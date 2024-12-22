package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{

    @Override
    void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭날기");
    }
}
