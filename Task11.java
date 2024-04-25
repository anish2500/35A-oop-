package task;

public class Task11 {
    /*Write a program to calculate the total marks of 
    four subjects of a student and the total percentage secured.
     And use the following conditions to generate the final result; */
    public static void main(String[] args) {
    
        float sub1 = 78f;
        float sub2 = 88f;
        float sub3 = 77f;
        float sub4 = 76f;
        float total = sub1+ sub2+ sub3+ sub4;
        float percentage = ((total)/400)*100;
        System.out.println("The percentage is"+ percentage);
        /*if percentage>=70:
         *  print("First class")
         * 
         *elif percentage>59:
            print("Upper second class")
            elif percentage>49:
                print("Second class")
            elif percentage>39:
                print("Third class")
            else:
                print("failed")    
         */
        int a = 70, b = 59;
        String output = percentage>70? "First class":"Upper second class";
        System.out.println(output);
        


    }
}
