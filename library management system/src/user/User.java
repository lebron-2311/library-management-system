package user;

import book.BookList;
import operation.FindOperation;
import operation.IOPeration;

//User是抽象的，因此是抽象类
public abstract class   User {
    protected String name;
    protected IOPeration[] ioPerations;
    //没有初始化，要么初始化为null，要么给一些值，没有分配空间
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    //本方法不需要实现，因此是抽象的
    public void doOperation(int choice, BookList bookList){
        //this.ioPerations[choice].work(bookList);
        IOPeration ioPeration=this.ioPerations[choice];
        ioPeration.work(bookList);
    }
}
