package task.Week3;
import java.util.Scanner;
public class W3Task8 {
    public static void main(String[] args) {
        /*Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and
         performs the corresponding arithmetic operation using a switch case statement. */
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter first number");
         double num1 = scan.nextDouble();
         System.out.println("Enter the second number");
         double num2 = scan.nextDouble();
         System.out.println("Enter the operator");
         char operator = scan.next().charAt(0);

         double result;

         switch(operator){
            case '+':
            result = num1+ num2;
            System.out.println("The result of the given operator is "+ result);
            break;

            case '-':
            result = num1-num2;
            System.out.println("The result is "+ result);
            break;

            case '*':
            result = num1*num2;
            System.out.println("The result is " + result);
            break;

            case '/':
                if (num2!=0){
                    result = num1/num2;
                    System.out.println("result is "+ result);
                }else{
                    System.out.println("Error: divison by zero is not allowed");
            
                }
                break;
            default:
            System.out.println("Invalid operator entered ");    
        
         }
         scan.close();


        

    }
    
}
