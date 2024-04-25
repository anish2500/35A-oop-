package task;

public class Taskk {
       /* Task
                 * Switch case
                 * 0 - sunday
                 * 1 - Monday
                 * 2 - Tuesday
                 * 3 - Wednesday
                 * 4 - Thursday
                 * 5 - Friday
                 * 6 - saturday
                 * any other - Invalid day
                 * int day = 2;
                 * 
                 */
         public static void main(String[] args) {
            int day = 2;
            switch (day){
                case 0:
                    System.out.println("sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println( "Friday");
                    break;
                default:
                    System.out.println("Invalid day");
                    break;                            
            
                }

         }       
    
}
