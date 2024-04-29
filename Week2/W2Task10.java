package task.Week2;
import java.util.Scanner;

public class W2Task10 {
    /*Write a program to calculate the total marks of 
    four subjects of a student and the total percentage secured.
     And use the following conditions to generate the final result; */
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of sub 1");
        double a = scan.nextDouble();
        System.out.println("Enter the second marks");
        double b = scan.nextDouble();
        System.out.println("Enter the third marks");
        double c = scan.nextDouble();
        System.out.println("Enter the fourth marks");
        double d  = scan.nextDouble();
        double total = a + b + c + d;
        double percentage = ((total)/400)*100;
        System.out.println("The percentage secured is"+ percentage);
        String result = (percentage < 40) ? "Fail" :
        (percentage <= 49) ? "Third Class" :
        (percentage <= 59) ? "Second Class" :
        (percentage < 70) ? "Upper Second Class" : "First Class";
        System.out.println("The obtained result is "+ result);
        scan.close();

       
        


    }
}
