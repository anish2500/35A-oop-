package task.Week2;

import java.util.Scanner;
public class W2Task5 {
    /*Wrtie a program to take two integer iputs form the user and print the sum and product of them */
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("The sum of two number is"+ (num1+num2));
        System.out.println("The product of two number is "+ (num1*num2));
        scan.close();


    }
    
}
