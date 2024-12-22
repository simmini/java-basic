package poly.ex3;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        //추상클래스라 인스턴스생성 불가
        //AbstractAnimal animal=new AbstractAnimal() ;
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        //부모는 자식을 담을 수 있따.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
