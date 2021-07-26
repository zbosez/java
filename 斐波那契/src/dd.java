class Fib{
    int ret =0;
    public int sfib(int x){
        if(x==0){
            ret = 0;
        }else if(x<3){
            ret = 1;
        }else if(x>2){
            ret = sfib(x-1)+sfib(x-2);
        }
        return ret;
    }
}
public class dd {
    public static void main(String[] args) {
        int x = 6;
        Fib fib = new Fib();
        int ret = fib.sfib(x);
        System.out.println(ret);
    }
}
