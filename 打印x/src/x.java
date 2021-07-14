import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-14
 * Time: 18:22
 */

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int scanf = sc.nextInt();
            for(int row=0;row<scanf;row++){
                for(int col=0;col<=scanf;col++){
                    if(row==col||row+col==scanf-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
