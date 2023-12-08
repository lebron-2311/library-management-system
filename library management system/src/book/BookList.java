package book;

public class BookList {
    private Book[] books;
    private int usedSize;
    public BookList(){
        this.books=new Book[10];
        this.books[0]=new Book("三国演义","罗贯中",10,"小说");
        this.books[1]=new Book("西游记","吴承恩",9,"小说");
        this.books[2]=new Book("红楼梦","曹雪芹",8,"小说");
        this.usedSize=3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getBook(int pos)
    {
        return books[pos];
    }

    public void setBooks(Book book,int pos) {
        books[pos]=book;
    }
}
