package extends1.super2;

public class ClassB  extends ClassA{


    public ClassB(int a){
        //상속을 받으면 생성자의 첫줄에 super()를 사용해서 부모클래스의 생성자를 호출함
        this(a,0);
        //super();//기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a);
    }
    public ClassB(int a,int b){

        //super();
        System.out.println("ClassB 생성자 a="+a+" b="+b);
    }
}
