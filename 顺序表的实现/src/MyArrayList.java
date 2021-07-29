import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    //构造方法
    public MyArrayList(){
        this.elem = new int[6];
    }
    //添加元素
    public void add(int pos,int data){
        if(pos<0||pos>this.usedSize){
            System.out.println("想添加的位置不合法");
            return;
        }
        if(this.isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        for(int i = usedSize;i>pos;i--){
            elem[i]=elem[i-1];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //显示顺序表
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //是否包含某元素？
    public  boolean contains(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //找到并返回某元素的下标
    public int search(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //找某下标的元素
    public int getPos(int pos){
        if(pos<0||pos>this.usedSize-1){
            System.out.println("要找的位置不合法");
        }else{
            return this.elem[pos];
        }
        return -1;
    }
    public int getPos2(int pos) throws UnsupportedOperationException{
        if(pos<0||pos>this.usedSize-1){
            throw new UnsupportedOperationException("pos位置不合法");
        }else{
            return this.elem[pos];
        }
    }
    //将某下标的值改为value
    public void setPos(int pos,int value){
        if(pos<0||pos>this.usedSize-1){
            throw new UnsupportedOperationException("pos位置不合法");
        }
        this.elem[pos]=value;
    }
    //删除某元素
    public void remove(int toRemove){
        if(usedSize<2&&this.elem[0]==toRemove){
            usedSize=0;
        }
        int pos = this.search(toRemove);
        if(pos==-1){
            System.out.println("找不到这个数");
        }else{
            for (int i = pos; i < this.usedSize-1; i++) {
                this.elem[i] = this.elem[i+1];
            }
            this.usedSize--;
        }
    }
    //顺序表大小
    public  int size(){
        return this.usedSize;
    }
    //清空顺序表
    public  void clear(){
        this.usedSize=0;
    }
    //判断顺序表是否是满的
    public boolean isFull(){
        if(this.elem.length==usedSize){
            return true;
        }
        return false;
    }
}
