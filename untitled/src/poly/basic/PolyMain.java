package poly.basic;

import java.sql.SQLOutput;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent=new Parent();
        parent.parentMethod();

        //자식 변수가 자식인스턴스 참
        System.out.println("Child -> child");
        Child child=new Child();
        child.parentMethod();
        child.childMethod();


        //부모변수가 자식인스턴스 참조(다형적 참조)
        //자식은 부모를 상속하고 잇어서 부모는 자식을 담을수잇음
        //부모는 자식을 상속안하거 있어서 자식은 부모를 못담아

        System.out.println("Parent->child");
        Parent poly=new Child();
        poly.parentMethod();

        //자식의 기능은 호출할수 없음, 컴파일 오류
        //poly.childMethod();

        //자식은 부모를 담을 수없음
       // Child child1=new Parent();




    }
}
