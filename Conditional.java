package task;

public class Conditional {
    public static void main(String[] args) {
        /*If statement */
        if (true){//use boolean value inside the small paranthesis
            System.out.println("True statement");
        }
        //The parnenthesis takes an sboolean expression
        int num1 = 10, num2 = 20;
        if (num1 == num2){
            System.out.println("Equal");

        }else{
            System.out.println("Not equal");
        }
        /*Note: The else statement is always optional */

        /*If else if */
        if (num1 == num2){
            System.out.println("Equal");
        }else if(num1<num2){
            System.out.println("Lesser");
        }else{
            System.out.println("Greater");
        }
        /*Note that else should be at the last when using else if */
        /* If else if ladder */
        /* use when there is multiple condition to be checked  */
        if (num1 ==num2){
            System.out.println("Equal");

        }else if(num1>num2){
            System.out.println("Greater");
        }else if(num1!=num2){
            System.out.println("Not equal");
        }else if(num1>0){
            System.out.println("Positive");
        }else{
            System.out.println("Default statement");
        }
        /*When the condititon is matched it will skip all the remaining statement */
        /* Nested If else */
        if (num1>0){
            if (num1>num2){
                System.out.println("Positive greater");

            }else{
                System.out.println("Postive lesser");
            }
        }else{
            if(num1>num2){
                System.out.println("Negative greater");
            }else{
                System.out.println("Negative lesser");
            }
            /*Task 
             * Consider the following
             * calculate the total and average and save in variable accordingly 
             * if any of the marking is less than 35, print "third dix"
             * if the average is less than 60, print"Third div"
             * if the average is less than 70, print"1st div"
             * if the average is less than 80, print"Distinciton"
             * if the average is greater than 100, print"Invalid marking"
            */
        
        }
         
    }    
}
