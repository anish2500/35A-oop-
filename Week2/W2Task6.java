package task.Week2;

import java.util.Scanner;
public class W2Task6 {
    /*Take two integer inputs from the user. 
    First, calculate the sum of two, then the product of two. 
    Finally, calculate the division of the thus obtained sum and product and print the result.
     * 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer");
        float  num1 = scan.nextFloat();
        System.out.println("Enter the second integer");
        float num2 = scan.nextFloat();
        float sum = num1+ num2;
        float product = num1*num2;
        System.out.println("The sum of the two integer is"+ sum);
        System.out.println("The product of the two integer is"+ product);
        float output = (sum / product);
        System.out.println("The division of the obtained sum and product is"+ output);
        scan.close();
    

   
    }
    
}
