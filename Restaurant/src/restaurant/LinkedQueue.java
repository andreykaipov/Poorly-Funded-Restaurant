/**
 * @author Andrey Kaipov
 * @version 1.5 November 30, 2014
 * This class represents a queue in a restaurant - like a line.
 * This class is exclusively for walk-in objects.
 * 
 * This Queue's implementation is identical to that of a Linked List,
 * except we're adding last (instead of adding first).
 */

package restaurant;

public class LinkedQueue {
   //embedded Node class, with methods -- best of both worlds!
   class Node {                
      private WalkIn data;
      private Node nextNode;
      
      public Node(WalkIn data, Node nextNode) {
         this.data = data;
         this.nextNode = nextNode;
      }

      public WalkIn getData() {
         return data;
      }

      public void setData(WalkIn newData) {
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
   
   private Node first, last;
   public int size;
   
   public LinkedQueue() {
      first = last = null;
      size = 0;
   }
   
   public boolean isEmpty() {
      return (first == null);
   }
   
   public int size() {
      return size;
   }
   
   /**
    * Adds a walk-in in the front of the line.
    * i.e. an "insert last" method.
    * @param data the walk-in we're adding.
    */
   public void addWalkIn(WalkIn data) {
      if(timeExists(data.getIntegerTime()))
         System.err.println("A walk-in already exists for this time!");
      
      Node newNode = new Node(data, null);
      if(last == null) first = last = newNode;
      else {
         last.setNextNode(newNode); //last points to our new node
         last = last.getNextNode(); //now the new last is our new node.
      }
      size++;
   }
   
   /**
    * Seats a walk-in an "empty" table.
    * @return true if successfully seated. false if otherwise.
    */
   public boolean fillEmptyTable() {
      if(isEmpty()) {
         System.err.println("The queue is empty! All of the walk-ins have been seated!");
         return false;
      }
      else {
         WalkIn out = first.getData();
         first = first.getNextNode();
         if(first == null) last = null;
         size--;
         System.out.println("Here is your table " + out.getNames() + "." 
                       + " You've been seated at " + out.getTime() + ".");
         return true;
      }
   }
   
   /**
    * Looks at who is next up in the queue (line).
    * @return the walk-in that is next.
    */
   public WalkIn peek() {
      if(isEmpty()) System.err.println("The queue is empty! Nobody is next!");
      
      return first.getData();
   }
   
   /**
    * Checks to see if a person has already walked in at a certain time.
    * @param time the time we're checking for.
    * @return true if found. false if otherwise.
    */
   public boolean timeExists(int time) {
      Node currentNode = first;
      while(currentNode != null) {
         if(time == currentNode.getData().getIntegerTime())
            return true;
         currentNode = currentNode.getNextNode();
      }
      return false;
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
}
