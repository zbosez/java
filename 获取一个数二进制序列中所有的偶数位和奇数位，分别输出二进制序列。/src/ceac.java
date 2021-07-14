/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-14
 * Time: 17:55
 */

public class ceac {
    public static void main(String[] args) {
        int num =11;
        for(int i = 31;i>0;i-=2){
            System.out.print(((num>>>i)&1)+" ");
        }
        System.out.println();
        System.out.print(" ");
        for(int i = 30;i>=0;i-=2){
            System.out.print(((num>>>i)&1)+" ");
        }
    }
}
