package task;

public class Cuboid {
    /*Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid. */
    public static void main(String[] args) {
        float length = 30f;
        float breadth = 45f;
        float height = 22f;
        float area = length * breadth ;
        
        System.out.println("Area is " + area);
        float volume = length * breadth * height;
        float vol1 = length*length * length;
        System.out.println("volume of cube is " + volume);
        System.out.println("Volume of cuboid is " + vol1);




    }
    
}
