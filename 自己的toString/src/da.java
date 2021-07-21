/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zbossz
 * Date: 2021-07-21
 * Time: 7:40
 */

public class da {
    public static String mytoString (int[] array) {
        if(array==null){
            return "null";
        }
        String a = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                a = a + array[i] + ",";
            } else {
                a = a + array[i];
            }
        }
        a = a + "]";
        return a;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String a = mytoString(array);
        System.out.println(a);
    }
}
