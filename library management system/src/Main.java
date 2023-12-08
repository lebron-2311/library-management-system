import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份.1：管理员 2:普通用户-->");
        int choice=scanner.nextInt();
        if(choice==1)
        {
            return  new AdminUser(name);

        }else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        //此时这个User到底指向的是 管理员对象 还是 普通用户对象不知道的
        //user =new AdminUser(name);  user =new NormalUser(name);
        User user=login();//用户不一样，打印的结果也不一样，这里发生了多态
        while (true){
            int choice=user.menu();
            //根据你菜单返回的choice来执行对应的操作
            user.doOperation(choice,bookList);//抽象类User找
        }
    }
}
//总结思路，先调用use.doOperation(choice,bookList);
//然后通过choice选择用户 有可能是管理员或者是普通用户，调完用户之后可能会有不同的菜单
//同时不同的用户也会有不同的操作，我们在不同的种类的用户中存下来一个数组