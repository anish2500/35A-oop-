package task;

public class Task1 {
    /* Task1 
     * Write a program to print weather a variable is greater or equal to 18
     */
    public static void main(String[] args) {
        int num1= 10;
        String output = num1>= 18 ? "greater": "lesser";
        // boolean output = num1>= 18 ;/* this is to give boolean ouput for the program  */ 
        // System.out.println(output);

        
        System.out.println( num1 + "is " + output + "than"+ 18); 
    }
    
}
