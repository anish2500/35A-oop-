package task.Week2;
import java.util.Scanner;

public class W2Task8 {
    /*Take side of a square from user and print area and perimeter of it.
     Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
     Take the attributes as user input.
     * 
     */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the side :");
        int side = scan1.nextInt();
        int area = side*side;
        int perimeter = 4*side;
        System.out.println("The area of square is "+ area);
        System.out.println("The perimeter of square is "+ perimeter);

        /* for simple interest */
        System.out.println("Enter a number");
        int a = scan1.nextInt();
        System.out.println("Enter a time");
        int time = scan1.nextInt();
        System.out.println("Enter the rate");
        float rate = scan1.nextFloat();
        float output = (a*time*rate)/100;
        System.out.println("The simple interest is "+ output);
        

        /* For volume of cube */
        System.out.println("Enter the length");
        int length = scan1.nextInt();
        int output1 = length*length*length;
        System.out.println("The volume of cube is "+ output1);

        /* For volume of cuboid */
        System.out.println("Enter the length");
        int l1 = scan1.nextInt();
        System.out.println("Enter the breadth");
        int b1= scan1.nextInt();
        System.out.println("Enter the height ");
        int h1 = scan1.nextInt();
        int out1 = (l1*b1*h1);
        System.out.println("The volume of cuboid is " + out1);
        scan1.close();







        
    }
    
}
