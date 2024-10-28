package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s="hello java";
        String deco=DecoUtil2.deco(s);

       /* DecoUtil1 utils=new DecoUtil1();
        String deco=utils.deco(s);*/

        System.out.println("before:  " + s);
        System.out.println("after: " + deco);

      

    }
}
