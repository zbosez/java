import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-14
 * Time: 20:25
 */

public class sd {
    public static boolean isSorted(int[] array){
        if(array==null||array.length==1){
            return false;
        }

        for (int i = 0;i< array.length-1;i++){
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {2};
        System.out.println(isSorted(array));
    }
}
