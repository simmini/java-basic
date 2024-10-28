package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1=10;//최초한번만 할당 가능
       // data1=20;//컴파일 오류

        final int data2=10;
        //data2=29;
        method(10);

    }

    private static void method(final int i) {
       // i=10;
    }
}
