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

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}


public class bb {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        cal.setNum1(5);
        cal.setNum2(6);
        System.out.println(cal.Add());
        System.out.println(cal.Mul());
        System.out.println(cal.Uinus());
        System.out.println(cal.Divide());
    }
}
