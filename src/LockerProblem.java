import java.util.Arrays;

public class LockerProblem {
   public static void main(String[] args) {
      String[] lockerArray = new String[101];
      String position = "closed";

      for (int i = 1; i <= 100; i++) {
         lockerArray[i] = position;
      }
      
      for ( int i = 1; i <= 100; i++) {
         for ( int j = i; j <= 100; j += i) {
            if (lockerArray[j].equals("closed")) {
               lockerArray[j] = "open";  
            } else {
               lockerArray[j] = "closed";
            }
         }
      }
     for (int i = 1; i <= 100; i++) {
        if (lockerArray[i].equals("open")) {
           System.out.println(i);
        }
     }
   }
}
