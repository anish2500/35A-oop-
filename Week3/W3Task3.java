package task.Week3;
import java.util.Scanner;

public class W3Task3 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a number is 
        divisible by 5 and 11 or not. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println(num + "is divisible by 5 and 11");
        }else{
            System.out.println(num + "is not divisible by 5 and 11");

        }
        scan.close();
        
        
    }
    
}
