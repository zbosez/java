class Func{
    public int num;
}
public class dd {
    public static void Swap(Func x,Func y){
        int temp=x.num;
        x.num=y.num;
        y.num =temp;
    }
    public static void main(String[] args) {
       Func func = new Func();
       func.num = 1;
       Func func2 = new Func();
       func2.num=2;
       System.out.println("交换前："+func.num+" "+func2.num);
       Swap(func,func2);
        System.out.println("交换后："+func.num+" "+func2.num);
    }
}
