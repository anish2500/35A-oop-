package task.Week3;

public class W3Task1 {
    public static void main(String[] args) {
        /*Write a JAVA program to find the 
        maximum between three numbers. */
        int num1 = 22;
        int num2 = 33;
        int num3 = 44;
        if (num1>num2 && num1>num3){
            System.out.println("This is the maximum number among the three"+ num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("This is the maximum number among the three"+ num2);
        }else{
            System.out.println("This the maximum number"+ num3);
        }
        
    }
    
}
