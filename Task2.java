package task;

public class Task2 {
    /*Task 2
     * Write a program to print simple interest from variables 
     * Make 3 variable for amount, time and rate and save the calculation into a variable 
     * Formula 
     * si = amount + time + rate /100
     */
    public static void main(String[] args) {
        
    

     float amount = 20000f;
     float time = 5f;
     float rate = 20.5f;
     float si = (amount * time * rate)/100;
     System.out.println("interest is "+ si);
    }

    
}
