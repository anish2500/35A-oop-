package task;

public class Task9 {
    /*Take side of a square from user and print area and perimeter of it.
     Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
     Take the attributes as user input.
     * 
     */
    public static void main(String[] args) {
        int side = 8;
        System.out.println("The perimeter of square is "+(4*side));
        System.out.println("The area of square is "+ (side*side));
        float amount = 30000f;
        float time = 5f;
        float rate = 4.56f;
        float si  = (amount * time * rate)/100;
        System.out.println("The simple interest is "+ si);

        int length = 22;
        int breadth = 44;
        int height = 12;
        System.out.println("The volume of cube is "+ (length * breadth * height ));

        int length1 = 33;
        System.out.println("The volume of cuboid is"+ (length1*length*length));
        
    }
    
}
