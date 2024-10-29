package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10);
        //super(10,20);
       // super();//기본생성자 호출 안됨=> ClassB에서 안만들어서 호출안되고 기본생성자가 아니라 생략도 안됨
        System.out.println("ClassC 생성자");
    }
}
