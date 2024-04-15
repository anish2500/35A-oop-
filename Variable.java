package task;

public class Variable{
    /*Instance variable needs object to accessed 
     * Value is not shared
     */
    int instanceVariable = 10;
    /* Static variable does not need object to be accessed 
     * Value is shared among objects 
     */
    static int staticVariable = 100;
    /* */

    public static void main(String[] args) {
        /* Primitive Data Type
         * Already defined in Programming Language (JAVA)
         */
        byte byteValue = 100;
        short shortVlaue = 200;
        int intValue = -199;
        long longVlaue = 10000;
        float floatVlaue = 2.13f;
        double doubleValue = -90.223;
        char charvalue = 'l';
        boolean booleanValue = false;
        /* Non Primitive Data type
         * Not defined by Programming Language (String)
         * Combination of primitive data type
         */
       
        String stringValue = "This is a string value";
        int[] intArray = new int[5];
        Variable variableObject = new Variable();
        /* Use instance variable with Variable object */
        System.out.println(variableObject.instanceVariable);
        /* Use static variable with Class itself */
        System.out.println(Variable.staticVariable);

        //byte defaultByteValue;
        //System.out.println("Default Byte Value is " + defaultByteValue);
        /* Continue all and find the default value of all the 
         * primitive datatype
         */
        
         /*impicit casting , smaller data type to larger  */
         int newIntValue = 10;
         double convertedInt = newIntValue;

         /* Explicit casting larger data type to smaller */
         double newDoubleValue = 290.99;
         int convertedDoubleValue = (int) newDoubleValue;
    }
}