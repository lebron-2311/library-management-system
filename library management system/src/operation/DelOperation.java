package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("删除图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除图书的书名：");
        int currentSize=bookList.getUsedSize();
        int index=-1;
        String name=scanner.nextLine();
        int i=0;
        for(i=0;i<currentSize;i++)
        {
            Book tmp=bookList.getBook(i);
            if(tmp.getName().equals(name))
            {
                index=i;
                break;//记录下来了要删除的图书的姓名
            }
        }
        //
        if(i>=currentSize)
        {
            System.out.println("没有你要删除的图书");
            return;
        }
        for(int j=index;j<currentSize-1;j++){
            Book book=bookList.getBook(j+1);
            bookList.setBooks(book,j);
        }
        bookList.setBooks(null,currentSize-1);
        bookList.setUsedSize(currentSize-1);
    }
}
