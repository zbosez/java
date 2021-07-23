import java.util.Arrays;

public class da {
    public static void reverse(int[] array) {
        int head = 0;
        int tail = array.length-1;
        while(head<tail){
            int temp = array[head];
            array[head]=array[tail];
            array[tail]=temp;
            head++;
            tail--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
