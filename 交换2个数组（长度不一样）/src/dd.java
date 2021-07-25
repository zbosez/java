import java.util.Arrays;

public class dd {

    public static void swap2(int[][] array0) {
        int[] temp = array0[0];
        array0[0] = array0[1];
        array0[1] = temp;
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] array2={11,22,33,44,55,66,77};
        int[][] array0={array1,array2};
        System.out.println("改之前"+ Arrays.toString(array0[0]));
        System.out.println("改之前"+Arrays.toString(array0[1]));
        swap2(array0);
        System.out.println("改之后"+Arrays.toString(array0[0]));
        System.out.println("改之后"+Arrays.toString(array0[1]));
    }
}
