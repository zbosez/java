import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-20
 * Time: 22:47
 */

public class eqwe {
    public static int[] Double(int[] array) {
        int[] ret =new int[array.length];
        for (int i = 0;i<array.length;i++){
            ret[i]=2*array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array ={1,2,3};
        int[] ret = Double(array);
        System.out.println("改变之后的array为："+ Arrays.toString(array));
        System.out.println("改变之后的ret为："+ Arrays.toString(ret));
    }
}
