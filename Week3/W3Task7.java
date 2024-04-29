package task.Week3;
import java.util.Scanner;
public class W3Task7 {
    public static void main(String[] args) {
        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case 
        statement to handle different grades. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char grade = scan.next().charAt(0);
        double gpa;
        switch(grade){
            case 'A':
            gpa = 4.0;
            break;

            case 'B':
            gpa = 3.0;
            break;

            case 'C':
            gpa = 2.0;
            break;

            case 'D':
            gpa = 1.0;
            break;

            default:
            System.out.println("You have invalid grade entered");
            return;
        }
        System.out.println("The corresponding value of grade entered "+ grade+ " is "+ gpa);
        scan.close();




    }
    
}
