/**
 * @author Andrey Kaipov
 * @version 1.5 November 30, 2014
 * This class implements a linked list and its iterator.
 * 
 * This kind of list will be used to collect the reservations in our restaurant.
 * With the help of an iterator, we are able to traverse the list and organize
 * our reservations according to ascending times. In other words, those with 
 * the earlier times will be before those with later times.
 */

package restaurant;
import java.util.NoSuchElementException;

public class LinkedList {
   //embedded Node class, with methods -- best of both worlds!
   class Node {
      private Reservation data;
      private Node nextNode;

      public Node(Reservation data, Node nextNode) {
         this.data = data;
         this.nextNode = nextNode;
      }

      public Reservation getData() {
         return data;
      }

      public void setData(Reservation newData) {
         data = newData;
      }

      public Node getNextNode() {
         return nextNode;
      }

      public void setNextNode(Node newNextNode) {
         nextNode = newNextNode;
      }

      public String toString() {
         return data.toString();
      }
   }
   
   private Node first;
   private int size;
   
   /**
    * Creates an empty list. It has no first node, and size is 0. 
    */
   public LinkedList() {
      first = null;
      size = 0;
   }
   
   public boolean isEmpty() {
      return (size == 0);
   }
   
   public int size() {
      return size;
   }
   
   public void clearAll() {
      first = null;
      size = 0;
   }
   
   /**
    * Gets the first node's data. If no data, exception is thrown.
    * @return the data of the first node.
    */
   public Reservation getFirst() {
      if(isEmpty()) throw new NoSuchElementException();
      else          return first.getData();
   }
   
   /**
    * Inserts a new node (reservation) into the front of list.
    * @param newRes the reservation to be added.
    */
   public void insertFirst(Reservation newRes) {
      Node newNode = new Node(newRes, first);
      first = newNode;
      size++;
   }
   
   /**
    * Deletes the first node.
    * @return the data of the first node.
    */
   public Reservation deleteFirst() {
      if(isEmpty()) throw new NoSuchElementException();
      else {
         size--;
         Reservation out = first.getData();
         Node temp = first.getNextNode();
         first.setNextNode(null);
         first = temp;
         return out;                   
      }
   }
   
   public String toString() {
      String out = "", spacing = "";
      Node currentNode = first;
      while(currentNode != null) {
            out += spacing + currentNode.toString();
            spacing = "\n";
            currentNode = currentNode.getNextNode();           
      }
      return out;
   }
   
   public ListIterator getListIterator() {
      return new ListIterator();
   }
   
   class ListIterator {
      private Node previous, position;
      public int nextIndex;
      
      /**
       * Our list iterator keeps track of the node traversed, the current node 
       * we are at, and the next index we would like to go to.
       * For e.g., if A -> B -> C is our list.. when nextIndex = 2, 
       * we are located at B, having already traversed A.
       */
      public ListIterator() {
         previous = position = null;
         nextIndex = 0;
      }
      
      /**
       * Checks to see if our list has a next element.
       * @return true if there is another element. false otherwise.
       */
      public boolean hasNext() {
         return nextIndex < size;
      }
      
      /**
       * Gets the current-node's next-node's data, 
       * and then moves further into the list.
       * @return the node's data (Reservation) traversed.
       */
      public Reservation getNext() {
         if(!hasNext()) throw new NoSuchElementException();
         previous = position; //we move up the list, so since we just traversed position, it's now previous.
         position = (position == null) ? first : position.getNextNode(); //now the current position is the position's next node
         nextIndex++; //we moved up, so increment the index.
         return position.getData();
      }
      
      /**
       * Adds a new node AFTER our current position in the list.
       * We move up one in our position. Our new position is the node we add.
       * @param res the data of the node we're adding.
       */
      public void addAfter(Reservation res) {
         if(nextIndex == 0) { 
            insertFirst(res);
            position = first;
         }
         else {
            Node newNode = new Node(res, position.getNextNode());
            position.setNextNode(newNode);
            previous = position;
            position = newNode;
            size++;
         }
         nextIndex++;
      }
      
      /**
       * Adds a new node BEFORE our current position in the list.
       * We stay at our current position. Our new previous is the node we add.
       * @param res the data of the node we're adding.
       */
      public void addBefore(Reservation res) {
         if(nextIndex == 0) throw new IllegalStateException();
         else if(nextIndex == 1) insertFirst(res);
         else {
            Node newNode = new Node(res, position);
            previous.setNextNode(newNode);
            previous = newNode;
            size++;
         }
      }
      
      /**
       * Removes the node we are currently at (position).
       */      
      public void remove() {
         if(nextIndex == 0) throw new IllegalStateException();
         else if(nextIndex == 1) deleteFirst(); 
         else {
            previous.setNextNode(position.getNextNode());
            position.setNextNode(null); //the position node will be picked up by GC
            position = previous; //now our current position is previous.            
            size--;
         }
         nextIndex--;
      }
      
      /**
       * Overrides the data of our current position.
       * @param res the new data that will be at our current position.
       */
      public void set(Reservation res) {
         if(isEmpty()) throw new IllegalStateException();
         else          position.setData(res);
      }
      
      /**
       * Checks to see if a current reservation is in our list.
       * @param res the reservation we're checking for.
       * @return true if it's in the list. false if it's not in the list.
       */
      public boolean find(Reservation res) {
         boolean found = false;
         position = null;
         nextIndex = 0;
         
         Reservation item = null;
         while(hasNext() && !found) {
            item = getNext();
            if(res.isSame(item)) found = true;
         }
         return found;
      }
      
      /**
       * Checks to see if a certain time is on our list.
       * Identical to the above method, except we're looking for time now.
       * @param time the time we're looking for
       * @return true if the time exists in the list. false if it doesn't.
       */
      public boolean timeExists(int time) {
         boolean exists = false;
         position = null;
         nextIndex = 0;
         
         Reservation item = null;
         while(hasNext() && !exists) {
            item = getNext();
            if(time == item.getIntegerTime()) exists = true;
         }
         return exists;
      }
      
      /**
       * Creates a new reservation and puts it in the correct place in our list.
       * Before doing so, we must check to make sure we're allowed to make
       * a reservation.
       * @param res The reservation we're creating.
       */
      public void makeReservation(Reservation res) {
         if(isEmpty()) addAfter(res);
         else if(find(res))
            System.err.println("Unable to add. Duplicate reservation found!");
         else if(timeExists(res.getIntegerTime()))
            System.err.println("Unable to add. "
                    + "A reservation already exists at " + res.getTime() + "!");
         else {
            position = null;
            nextIndex = 0;
            
            Reservation item = null;
            while(hasNext() && nextIndex != size) {
               item = getNext();
               if(item.getIntegerTime() > res.getIntegerTime()) {
                  addBefore(res);
                  break;
               }
            }
            if(nextIndex == size) addAfter(res);
         }
      }
      
      /**
       * Simply a reservation in the list.
       * @param res the reservation we want to remove.
       */
      public void removeReservation(Reservation res) {
         if(find(res)) remove();
         else System.out.println("The old reservation was NOT found");
      }
      
      /**
       * Replaces a reservation with another one.
       * If the old reservation is not found, the second reservation is NOT added.
       * @param res1 the reservation that is to be replaced.
       * @param res2 the reservation that does the replacing.
       */
      public void replaceReservation(Reservation res1, Reservation res2) {
         if(find(res1)) {
            remove();
            makeReservation(res2);
         }
         else System.out.println("The old reservation was NOT found");
      }
   }
}
