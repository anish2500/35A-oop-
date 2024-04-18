package task;

public class Task3{
    /*Task3
     * Write a program to print the area and perimeter fo rectangle 
     * a = l*b
     * p = 2(l+b)
     */
    public static void main(String[] args) {
        float length = 23f;
        float breadth = 22f;
        float a = length*breadth;
        float p = 2*(length + breadth);
        System.out.println("area" + a);
        System.out.println("perimter" + p);
    }
}