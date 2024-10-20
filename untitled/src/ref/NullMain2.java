package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data=new Data();
        System.out.println(data.value);
        data=null;
        data.value=10;
        System.out.println(data.value);
    }
}
