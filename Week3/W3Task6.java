package task.Week3;
import java.util.Scanner;

public class W3Task6 {
    public static void main(String[] args) {
        
        /* Write a JAVA program to input any alphabet and check 
        whether it is vowel or consonant.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().toLowerCase().charAt(0); 

        if ((alphabet >= 'a' && alphabet <= 'z')) {
            
            boolean isVowel = alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u';

            if (isVowel) {
                System.out.println(alphabet + " is a vowel.");
            } else {
                System.out.println(alphabet + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid alphabet.");
        }

        scanner.close();
    }
}


        
    