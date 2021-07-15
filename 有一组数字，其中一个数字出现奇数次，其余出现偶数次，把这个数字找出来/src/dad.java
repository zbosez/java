/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-15
 * Time: 8:59
 */

public class dad {
    public static void main(String[]args){
        int[] array1 ={1,1,2,2,3,3,4};
        int ret = 0;
        for (int i = 0;i< array1.length;i++){
            ret^=array1[i];
        }
        System.out.println(ret);
    }
}
