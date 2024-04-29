package task.Week3;
import java.util.Scanner;
public class W3Task4 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether 
        a number is even or odd. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num%2==0){
            System.out.println(num + " is an even number");

        }else{
            System.out.println(num + " is odd number");

        }
        scan.close();

    }
    
}
