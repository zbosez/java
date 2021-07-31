public class das {
    public static Node mergeTwoLists(Node head1,Node head2){
        Node puppet = new Node();
        Node temp = puppet;
        while(head1!=null&&head2!=null){
            if(head1.value<head2.value){
                temp.nextAddress=head1;
                head1=head1.nextAddress;
                temp=temp.nextAddress;
            }else{
                temp.nextAddress=head2;
                head2=head2.nextAddress;
                temp=temp.nextAddress;
            }
        }
        if(head1==null){
            temp.nextAddress=head2;
        }else if(head2==null){
            temp.nextAddress=head1;
        }
        return puppet;
    }
    public static void main(String[] args) {
        UnidirectionalList unidirectionalList = new UnidirectionalList();

        unidirectionalList.addLast(1);
        unidirectionalList.addLast(3);
        unidirectionalList.addLast(5);
        unidirectionalList.addLast(7);
        unidirectionalList.addLast(9);
        unidirectionalList.display();

        UnidirectionalList unidirectionalList2 = new UnidirectionalList();
        unidirectionalList2.addLast(2);
        unidirectionalList2.addLast(4);
        unidirectionalList2.addLast(6);
        unidirectionalList2.addLast(8);
        unidirectionalList2.display();
        Node newhead=mergeTwoLists(unidirectionalList.head,unidirectionalList2.head);
        unidirectionalList.display2(newhead.nextAddress);

    }
}
