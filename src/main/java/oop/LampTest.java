package oop;

public class LampTest {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( "Sean ");
        stringBuilder.append( "Price" );
        System.out.println(stringBuilder);


        Lamp lamp1 = new Lamp(false);
        //turn the lamp on
        lamp1.turnOn();
        System.out.printf("My Name is %s. I was born in %d and my sex is %c ", "Mike", 1998, 'M');
    }

}
