package task.Week3;
import java.util.Scanner;

public class W3Task2 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number
         is negative, positive, or zero. */
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = scan.nextInt();
         if (num<0){
            System.out.println(num + " is negative number");

         }else if ( num==0){
            System.out.println(num + "is zero");

         }else{
            System.out.println(num + " is positive number");
         }
         scan.close();
    }
    
}
