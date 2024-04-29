package task.Week4;

public class W4Task2 {
    public static void main(String[] args) {
        /*Write a program that displays the following table (note that 1 mile is 1.609 kilometers):

        Miles    Kilometers

        1    1.609

        2    3.218

        …    ….

        9    14.481

        10    16.090 */
        double milesToKilometers = 1.609;

        for ( int i = 1; i<=10; i++){
            double kilometers = i*milesToKilometers;
            System.out.println(i + " "+ kilometers);
        }
    }
    
}
