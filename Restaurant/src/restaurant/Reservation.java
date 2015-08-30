/**
 * @author Andrey Kaipov
 * @version 1.5 November 30, 2014
 * This class represents a Reservation object.
 * A reservation object has a name, and a reservation time.
 */

package restaurant;

public class Reservation {
   private String lastName;
   private String firstName;
   private String resTime; //in the form HH:MM. This is assured via the GUI.
   
   public Reservation(String lastName, String firstName, String resTime) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.resTime = resTime;
   }
   
   public String toString() {
       return lastName + ", " + firstName + " at " + resTime + ".";
   }     
   
   /**
    * Used for comparing two Reservation objects. 
    * Must have the same name and time.
    * @param item the Reservation object we are comparing.
    * @return true if it is the "same" Reservation, false otherwise.
    */
   public boolean isSame(Reservation item) {
      return   lastName.equals(item.lastName) && 
              firstName.equals(item.firstName) &&
                resTime.equals(item.resTime);
   }
   
   public String getTime() {
      return resTime;
   }
   
   /**
    * Extracts the hours and minutes from the the time variable as integers,
    * so we can use the time to compare the priority of reservations.
    * @return the time as an int in the form HHMM.
    */
   public int getIntegerTime() {
      int hour = Integer.parseInt(resTime.substring(0,2));
      int minute = Integer.parseInt(resTime.substring(3));
      return 100*hour + minute;
   }
}