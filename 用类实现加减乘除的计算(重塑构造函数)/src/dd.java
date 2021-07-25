class Calculate{
    public int num1;
    public int num2;

    public int Add(){
        return num1+num2;
    }
    public int Mul(){
        return num1*num2;
    }
    public int Uinus(){
        return num1-num2;
    }
    public float Divide(){
        return num1*1.0f/num2;
    }
    Calculate(int x,int y){
        num1=x;
        num2=y;
    }
}


public class dd {

    public static void main(String[] args) {
        Calculate cal = new Calculate(5,6);
        System.out.println(cal.Add());
        System.out.println(cal.Mul());
        System.out.println(cal.Uinus());
        System.out.println(cal.Divide());
    }
}
