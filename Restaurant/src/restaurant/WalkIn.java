/**
 * @author Andrey Kaipov
 * @version 1.5 November 30, 2014
 * This class represents a Walk-In object.
 * A Walk-In, like a Reservation, has a name and a time.
 */

package restaurant;

public class WalkIn {
   private String lastName;
   private String firstName;
   private String walkTime; //in the form HH:MM. This is assured via the GUI.

   public WalkIn(String lastName, String firstName, String walkTime) {
      this.lastName = lastName;
      this.firstName = firstName;
      this.walkTime = walkTime;
   }
   
   public String getNames() {
      return firstName + " " + lastName;
   }
   
   public String toString() {
       return lastName + ", " + firstName + " at " + walkTime + ".";
   }
   
   public String getTime() {
      return walkTime;
   }
   
   public int getIntegerTime() {
      int hour = Integer.parseInt(walkTime.substring(0,2));
      int minute = Integer.parseInt(walkTime.substring(3));
      return 100*hour + minute;
   }
}
