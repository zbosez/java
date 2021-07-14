/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-14
 * Time: 15:50
 */

public class qgs1 {
    public static void main(String[] args) {
        int num =15;
        int count1 =0;
        while(num!=0){
             num&=(num-1);
             count1++;
        }
        System.out.println(count1);
    }
}
