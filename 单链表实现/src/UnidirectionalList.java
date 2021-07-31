public class UnidirectionalList {
    public Node head;

    public Node reciprocalK(int k){
        Node fast = head;
        Node slow = head;
        if(k<=0||head==null){
            return null;
        }
        while(k>0){
            if (fast.nextAddress!=null){
                fast = fast.nextAddress;
                k--;
            }else{
                System.out.println("k过大");
                return null;
            }
        }
        while(fast!=null){
            fast = fast.nextAddress;
            slow = slow.nextAddress;
        }
        return slow;
    }
    public Node findmid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.nextAddress!=null){
            slow = slow.nextAddress;
            fast = fast.nextAddress.nextAddress;
        }
        return slow;
    }
    public void reversedList(){
        Node cur = this.head.nextAddress;
        Node next = cur.nextAddress;
        head.nextAddress=null;
        while(cur!=null){
            next = cur.nextAddress;
            cur.nextAddress = this.head;
            head = cur;
            cur = next;

        }
    }
    //删除第一次出现k关键字的节点
    public void removeKey(int key){
        Node cur = this.head;
        if(head.value==key){
            this.head = this.head.nextAddress;
        }else{
            while(cur.nextAddress!=null){
                if(cur.nextAddress.value==key){
                    cur.nextAddress= cur.nextAddress.nextAddress;
                    return;
                }else{
                    cur = cur.nextAddress;
                }
            }
        }
        System.out.println("没有这个关键字可以删掉");
    }

    public void removeKeyall(int key){
        Node prev = this.head;
        Node cur = prev.nextAddress;
        while(cur!=null){
            if(cur.value==key){
                prev.nextAddress = cur.nextAddress;
                cur = cur.nextAddress;
            }else{
                cur = cur.nextAddress;
                prev = prev.nextAddress;
            }
        }
        if(this.head.value==key){
            this.head=head.nextAddress;
        }
    }
    public void display(){
        Node cur =this.head;
        while(cur!=null){
            System.out.print(cur.value+" ");
            cur = cur.nextAddress;
        }
        System.out.println();
    }
    public void display2(Node head){
        Node cur =head;
        while(cur!=null){
            System.out.print(cur.value+" ");
            cur = cur.nextAddress;
        }
        System.out.println();
    }
    public int size(){
        int count = 0;
        Node cur =this.head;
        while(cur!=null){
            count++;
            cur = cur.nextAddress;
        }
        return count;
    }
    public  void addFirst(int value){
        Node node = new Node(value);
        node.nextAddress = head;
        head = node;
    }
    public void addLast(int value){
        Node node = new Node(value);
        Node cur =this.head;
        if(head==null){
            head = node;
        }else{
            while(cur.nextAddress!=null){
                cur = cur.nextAddress;
            }
            cur.nextAddress = node;
        }
    }
    public Node findPrevious(int pos){
        Node cur = this.head;
        if(cur==null){
            System.out.println("没有前一项");
        }else{
            for (int i = 0; i < pos-1; i++) {
                cur = cur.nextAddress;
            }
            return cur;
        }
        return null;
    }
    public boolean isContain(int value){
        Node cur = this.head;
        if(cur==null){
            return false;
        }else{
            for (int i = 0; i < size(); i++) {
                if(cur.value==value){
                    return true;
                }else{
                    cur = cur.nextAddress;
                }
            }
        }
        return false;
    }
    public void addInsert(int pos,int value){
        Node node = new Node(value);
        if(pos<0||pos>size()){
            System.out.println("插入位置不合法");
            return;
        }
        if(pos==0){
            addFirst(value);
            return;
        }
        if(pos==size()){
            addLast(value);
            return;
        }
        Node cur = findPrevious(pos);
        node.nextAddress=cur.nextAddress;
        cur.nextAddress = node;
    }
    public void clear(){
        Node cur = this.head;
        Node later = cur;
        while(cur!=null){
            later = cur.nextAddress;
            cur=null;
            cur = later;
        }
        this.head = null;
    }
}
