package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child=new Child();
        System.out.println("Child->child");
        System.out.println("value="+child.value);
        child.method();
    }
}
