package oop;

public class Box {
    public int length, width;
    public static int x;

    //constructor
    public Box(int length, int width ){
        this.length = length;
        this.width = width;
    }

    public void calcArea(){

        System.out.println(length * width);
    }

    public static void calculateArea(int length, int width ){
        System.out.println(length * width);
    }


}
