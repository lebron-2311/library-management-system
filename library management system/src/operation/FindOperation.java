package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOPeration{
    public void work(BookList bookList)
    {
        System.out.println("查找图书！");
        System.out.println("请写出你要查找的图书的书名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int currentSize=bookList.getUsedSize();
        for(int i=0;i<currentSize ;i++)
        {
            //Book book=BookList[i];//不是数组，是类，这个类当中有一个数组
           Book book=bookList.getBook(i);
           if(book.getName().equals(name))
           {
               System.out.println("存在这本书，信息如下：");
               System.out.println(book);
               return;
           }
        }
        //走到这一行说明代码没有retuen 出去，没有你要找的书
        System.out.println("没有你要找的这本书，书名为："+name);
    }
}
//总结思路，先调用use.doOperation(choice,bookList);
//然后通过choice选择用户 有可能是管理员或者是普通用户，调完用户之后可能会有不同的菜单
//同时不同的用户也会有不同的操作，我们在不同的种类的用户中存下来一个数组