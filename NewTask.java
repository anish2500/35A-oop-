package task;
import java.util.Scanner;

public class NewTask {
    /*Make new Scanner Object/Variable calles scan1
     * Prompt the following for Input
     * What is your name? save as string in new var;
     * 
     */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String stringInput = scan1.nextLine();
        System.out .println("Are you over 18?");
        boolean boolInput = scan1.nextBoolean();
        System.out.println("How many siblings?");
        int intInput = scan1.nextInt();
        System.out.println("Hello " + stringInput);
        System.out.println("Status "+ boolInput);
        System.out.println("You have "+intInput+" number of siblings.");


    }
    
}
