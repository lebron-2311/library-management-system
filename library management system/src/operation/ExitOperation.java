package operation;

import book.BookList;

public class ExitOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("退出系统");
        //应该对booklist进行 手动资源回收
        System.exit(0);
    }
}
