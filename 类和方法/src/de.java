import java.util.Arrays;
import java.util.Scanner;

class Student{
    public String name;
    private int age;
    String sex;
    int score;
    static int num;
    //构造方法
    Student(){

    };
    Student(int x){

    };
    //方法
    public void getscore(){
        System.out.println(name+"的成绩："+score);
    }
    public static void regetscore(){
        Student s1 = new Student();
        s1.getscore();
    }
    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
public class de {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.num=1;
        Student.num = 2;
    }
}
