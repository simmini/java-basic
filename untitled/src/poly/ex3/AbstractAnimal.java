package poly.ex3;

public abstract class AbstractAnimal {
    //자식에서 반드시 오버라이딩 해야함
    //abstract있으면 무조건 클래스에도 이름 붙음
    //직접 인스턴스를 생성 할수 없다.
    public abstract void sound();

    //자식 클래스가 오버라이딩안해도됨 ,해도되고 안해도됨
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
