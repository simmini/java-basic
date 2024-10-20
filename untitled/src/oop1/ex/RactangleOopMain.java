package oop1.ex;

public class RactangleOopMain {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.width=5;
        ractangle.height=8;

        System.out.println("넚이 = " + ractangle.calculateArea());
        System.out.println("둘레길이 = " + ractangle.calculatePerimeter());
        System.out.println("정사각형 여부 = " + ractangle.isSquare());
    }
}
