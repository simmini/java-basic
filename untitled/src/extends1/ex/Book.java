package extends1.ex;

public class Book extends Item {
    private String book;
    private String isbn;


    Book(String name,int price,String book,String isbn){
        super(name,price);
        this.book=book;
        this.isbn=isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:"+ book+", isbn:"+isbn);
    }
}
