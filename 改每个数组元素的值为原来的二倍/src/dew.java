import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-20
 * Time: 22:10
 */

public class dew {
    public static void Double(int[] array){
        for(int i =0;i<array.length;i++){
            array[i]*=2;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println("改变之前："+ Arrays.toString(array));
        Double(array);
        System.out.println("改变之后："+ Arrays.toString(array));
    }
}
