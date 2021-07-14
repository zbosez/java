/*
* 2021/7/14
* 作者：zbossz(zzy)
* 功能：模拟用户登录3次
* */

import java.util.Scanner;
import java.lang.String;
public class pas {
    public static void main(String[] args) {
        int times = 3;
        String password ="zbossz123zzy";
        do{
            System.out.println("请输入您的密码，还有"+times+"次机会：");
            Scanner sc = new Scanner(System.in);
            String typing = sc.nextLine();
            if(password==typing){
                System.out.println("登入成功");
                break;
            }
            times--;
        }while(times>0);
    }
}
