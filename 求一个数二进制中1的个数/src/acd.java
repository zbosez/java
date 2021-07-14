/**
 * Created with IntelliJ IDEA.
 * Description:求一个数二进制中1的个数
 * User: zbossz
 * Date: 2021-07-14
 * Time: 14:53
 */

public class acd {
    public static void main(String[] args) {
        int num =15;
        int count1 =0;
        while(num!=0){
            if((num&1)==1){
                count1++;
            }
            num>>>=1;
        }
        System.out.println(count1);
    }
}
