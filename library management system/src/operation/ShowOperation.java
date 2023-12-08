package operation;

import book.Book;
import book.BookList;

public class ShowOperation implements IOPeration{
    public void work(BookList bookList){
        System.out.println("显示图书");
        int currentSize=bookList.getUsedSize();
        for(int i=0;i<currentSize ;i++)
        {
            //Book book=BookList[i];//不是数组，是类，这个类当中有一个数组
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
    }
}
