/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-20
 * Time: 21:45
 */

public class ad {
    public static double average(int[] array){
        int sum=0;
        for(int i = 0;i<array.length;i++){
            sum +=array[i];
        }
        return sum*1.0/array.length;
    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        double ret = average(array);
        System.out.println(ret);
    }
}
