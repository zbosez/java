import java.util.Arrays;

public class mao {
    public static void bubble_sort(int[] array){
        int flag = 0;
        for(int i = 1;i<array.length;i++){
            for (int j = 0 ;j< array.length-i;j++){
                if(array[j]>array[j+1]){
                    flag = 1;
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array ={8,7,5,3,1};
        bubble_sort(array);
        System.out.println(Arrays.toString(array));
    }
}
