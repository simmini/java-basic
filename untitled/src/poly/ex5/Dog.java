package poly.ex5;

import java.sql.SQLOutput;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지이동");
    }

}
