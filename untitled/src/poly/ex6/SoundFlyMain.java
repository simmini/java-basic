package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

       // flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //AbstractAnimal사용가능
    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void flyAnimal(Fly fly){
        System.out.println("날다");
    }
}
