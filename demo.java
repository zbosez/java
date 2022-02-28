import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("请问你想要多少行:");
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            for (int d = i;d>=0;d--)
                System.out.print("*");
            for (int j = 0;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }*/
        /*int[] b = new int[10];
        System.out.println(b.length);
        int[][] a = new int[3][4];
        System.out.println(a.length);
        int[][][] c = new int [5][4][3];
        System.out.println(c.length);
        String s = new String("abc,tre,fgh");
        String[] str = s.split(",");
        System.out.println(s.split(",")[0]);
        System.out.println(str[0]);
        System.out.println(s.split(",")[1]);
        System.out.println(str[1]);
        System.out.println(s.split(",")[2]);
        System.out.println(str[2]);
        for(String i : str){
            System.out.println(i.toUpperCase());
        }*/


        /*String str1 = "123";
        String str2 = "123";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = new String("123");
        String str4 = new String("123");
        System.out.println(str3==str4);//地址
        System.out.println(str3.equals(str4));//内容*/

        /*String str1 = "ancd";
        String str2 = "ytfg";
        String str3 = str1+str2;//新开辟地址来存储的。
        System.out.println(str3);*/

        /*StringBuffer stringBuffer = new StringBuffer("abda");
        StringBuffer stringBuffer1 = new StringBuffer("");
        stringBuffer.append("21");
        stringBuffer.append("true");
        stringBuffer.append('d');
        System.out.println(stringBuffer);*/


        /*Date date = new Date();
//        System.out.println(date);
        System.out.println(date.getTime());*/

        //简单日期格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(sdf.format(new Date()));
        SimpleDateFormat sdf1 = new SimpleDateFormat("yy-M-d HH:mm:sss");
        //System.out.println(sdf1.format(new Date()));

        /*System.out.println(Math.abs(-100.0));
        System.out.println(Math.abs(new Random(0).nextInt()%10));*/
        System.out.println(Math.abs(new Random(new Date().getTime()).nextInt()%10));


    }
}
