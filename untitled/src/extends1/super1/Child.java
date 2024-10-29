package extends1.super1;



public class Child extends Parent {
    public String value="child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }
    public void call(){
        System.out.println("this.value = " + this.value);//this는 생략가능 ,내클래스에 찾음
        System.out.println("super.value = " + super.value);//부모타입에서 찾음

        this.hello();//this는 생략가능
        super.hello();
    }
}
