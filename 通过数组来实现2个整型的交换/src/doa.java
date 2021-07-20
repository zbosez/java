import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-20
 * Time: 19:53
 */

public class doa {
    public static void Swap(int[] array){
        int temp = array[0];
        array[0]=array[1];
        array[1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要交换的第一个数:");
        int a = sc.nextInt();
        System.out.println("请输入需要交换的第二个数:");
        int b = sc.nextInt();
        int[] array = {a,b};
        System.out.println("交换前："+array[0]+" "+array[1]);
        Swap(array);
        System.out.println("交换后："+array[0]+" "+array[1]);
    }
}
