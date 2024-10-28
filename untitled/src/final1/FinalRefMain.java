package final1;
public class FinalRefMain {
    public static void main(String[] args) {
        final Data data=new Data();
        //data=new Data();//에러

        //데이터자체는 안되지만 참조대상의 객체값은 변경 가능
        data.value=10;
        System.out.println("data.value = " + data.value);
        
        data.value=20;
        System.out.println("data.value = " + data.value);
    }

}
