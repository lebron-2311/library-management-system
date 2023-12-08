package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration{
    public void work(BookList bookList){
        System.out.println("新增图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要新增图书的书名：");
        String name=scanner.nextLine();
        System.out.println("请输入你要新增图书的作者：");
        String author=scanner.nextLine();
        System.out.println("请输入你要新增图书的价格：");
        int price=scanner.nextInt();
        System.out.println("请输入你要新增图书的类型：");
        String type=scanner.nextLine();

        Book book=new Book(name,author,price,type);
        int currentSize=bookList.getUsedSize();
        for(int i=0;i<currentSize;i++)
        {
            Book tmp=bookList.getBook(i);
            if(tmp.getName().equals(name))
            {
                System.out.println("存在这本书，不能重复添加!：");
                return;
            }
        }
        //没有重复的书，开始新增。
        bookList.setBooks(book,currentSize);
        bookList.setUsedSize(currentSize+1);
    }
}
