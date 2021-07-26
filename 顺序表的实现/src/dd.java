
public class dd {
    public static void main(String[] args) {
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(1,9);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.add(6,7);
        myArrayList.add(80,8);
        myArrayList.display();
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.getPos(3));
        try{
            int ret = myArrayList.getPos2(3);
            System.out.println(ret);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();//printStackTrace() ：打印异常信息出错的位置及原因。
        }
        System.out.println(myArrayList.search(1));
        myArrayList.setPos(3,109);
        myArrayList.display();
        myArrayList.remove(2);
        myArrayList.display();
    }
}
