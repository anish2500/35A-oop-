package task;
import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        // int math = 34, science = 70, english = 50;
        // float average = ((34f+70f+50f)/300)*100;
        // System.out.println("Your average is "+ average);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marking of 3 subjects");
        float math  = scan.nextFloat();
        float science  = scan.nextFloat();
        float english  = scan.nextFloat();
        float average  = (math+science+english)/3;
        System.out.println("Your average is "+ average);


        if (math<35 || science <35 || english<35){
            System.out.println("Fail");
        }else if (average<60){
            System.out.println("Third div");

        }else if(average<70){
            System.out.println("Second div");
        }else if (average <80){
            System.out.println("1st div");
        }else if (average>80){
            System.out.println("Distinction");
        }else{
            System.out.println("Invalid marking");
        }
        scan.close();

    }
    
}
