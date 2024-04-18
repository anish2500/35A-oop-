package task;

public class  OperatorClass {
    public static void main(String[] args) {
        /* Arithmetic Operators
         */
        int num1 = 10, num2 = 20;
        int sum = num1 + num2; // here "+" is arithmetical operator
        System.out.println("num1 + num2 is  " + sum);
        System.out.println("num1 - num2 is " + (num1 - num2));
        System.out.println("num1 * num2 is" + (num1*num2));
        System.out.println("num1/num2 is" + (num1/num2));
        System.out.println("num1 modulo num2 is" + (num1%num2));
        /* Assignment Operator */
        int aNum1;
        aNum1 = 200; /* Here '= ' is assigment operator */
        System.out.println(aNum1);
        System.out.println("aNum += can be "+ (aNum1+=2));
        /*aNum1+= 2; is equivalent to aNum1+2;*/
        System.out.println("aNum-= can be" + (aNum1 -= 10));
        System.out.println("aNum*= can be " + (aNum1*= 3));
        System.out.println("aNum/= can be "+ (aNum1/= 3));
        System.out.println("aNum% = can be "+ (aNum1%=2 ));

        /* Relational Operator */
        int rNum1 = 20 , rNum2= 21;
        boolean rExpression = rNum1 ==rNum2;
        System.out.println("Is rNum1 equals to rNum2" + rExpression);
        System.out.println("Is rNum1 greater thean rNum2"+ (rNum1 > rNum2));
        System.out.println("Is rNum1 lesser than rNum2"+ (rNum1< rNum2));
        System.out.println("Is rNum1 lesser or equals to rNum2"+ (rNum1 <= rNum2));
        System.out.println("Is rNum1 greater or equals to rNum2"+(rNum1>= rNum2));

        /* Logical Operators */
        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2 " + (rOperator1 && rOperator2));
        System.out.println("Or using ||"+ (rOperator1 || rOperator2));
        System.out.println("Not Using !" + (!rOperator1));

        /* Unary operator */
        int uNum1 = 10;
        uNum1 ++; // equivalent to uNum1 = uNum1 + 1 and changes value from next line;
        ++uNum1; // equivalent to uNum1 = uNum1 - 1 and changes value in this line;
        System.out.println("Unary for ++ "+ uNum1);
        System.out.println("Unary for operand--"+ uNum1);
        System.out.println("Unary for --operand"+ --uNum1);

        /* Termary Operator */
         /* For example
         * String Output;
         * int a = 10;
         * int b = 20;
         * if (a>b){
         * output = "True statement"
         * else!
         * output = "False Statement"
         * }
         * 
         * We can use ternary for this 
         */
        int a = 10, b = 20;
        String ouput = a>b? "True statement": "False statement";
        /* Here ternary is take expression ? trus statement : false statement 
         * if the expression is true it takes the statement after the"?""
         * if ths expression if false it takes the statement after the "?""
        */
        int outputNumb = a<b ? 100: 200;
        System.out.println(ouput);
        System.out.println(outputNumb);

        
    }
    
    
}
