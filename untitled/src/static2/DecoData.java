package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall(){
        //클래스 소속인데 인스턴스 변수는 인스턴스 생성해서 참조값을 알아야함
        //인스턴스 생성해서 힙영역에 생성됨
        //instanceValue++;//인스턴스 변수 접근,compile error
        //instanceMethod();//인스턴스 메서드 접근,compile error

        staticValue++;//정적 변수접근 <-같은 붕어빵틀에서 붕어빵 가져옴
        staticMethod();//정적 메서드 접근
    }
    public void instanceCall(){
        instanceValue++;//인스턴스 변수 접근
        instanceMethod();//인스턴스 메서드 접근

        staticValue++;//정적 변수접근 <-같은 붕어빵틀에서 붕어빵 가져옴
        staticMethod();//정적 메서드 접근
    }
    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
    
    
}
