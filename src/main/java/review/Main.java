package review;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//References
public class Main {
    //create methods here
    public static void printSomething() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outter loop i" + i);
            //Nested loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("inner loop j" + j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //call or use or invoke the methods here
        printSomething();

    }

}
