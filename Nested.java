package task;

public class Nested {
    public static void main(String[] args) {
        /* Nested for loop
         * Loop inside loop
         */
for (int outer = 0; outer<2; outer++){
    for (int inner = 2; inner>=0; inner--){
        System.out.println("Inner"+ inner);

    }
    System.out.println("Outer"+ outer);
}

    }
    
}
