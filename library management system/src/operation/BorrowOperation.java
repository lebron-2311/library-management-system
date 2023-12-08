package operation;

import book.BookList;

public class BorrowOperation implements IOPeration{
    public void work(BookList bookList){
        System.out.println("借阅图书");
    }
}
