package task;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        /*System.out.println
         * "sout"
         */
          System.out.println("This line breaks");
          /*System.out.print 
           
          */
          System.out.print("This will not break");
          System.out.print("This will continue\n");

          /*System.out.printf*()
           * %s String, %d Integer, %f floating point, %b boolean
           * Print f means print format and doesn't break lines unlike println
           * print f take multiple arguments
           * takes value that matches their place holder like string only takes string as a placeholder
           */
          System.out.printf("Hello %s, Good Morning", "world");/* %s takes world as a placeholder */
          System.out.printf("This is a num %d", 10);
          /* multi format */
          System.out.printf("Both float %f and %b", 10.3f, false); /* order of value matters serially and also 
          take multiple arguments that matches the number of placeholders and takes more than two 
           */

          Scanner scan = new Scanner (System.in);/* system.in takes input from keyword */
          System.out.println("This following takes sentence:");
          String stringInput = scan.nextLine();
          System.out.println("The following takes int:");
          int intInput = scan.nextInt();
          System.out.println("the following takes boolean:");
          boolean boolInput = scan.nextBoolean();
          scan.close(); 

          /* args can be used to take an input from the user and values can be accessed using args variable
           * Parsing is the extraction of data from the string
           */

    
    }

}
