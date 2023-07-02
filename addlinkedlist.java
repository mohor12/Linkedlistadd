class LL{
    Node head;
    class Node{
        String data;  //create node
        Node next;
        Node(String data){   //node constructor
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        LL list=new LL();  // class initialize
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("this");
        list.printList();
    }
    
}

output:
is->a->Null
is->a->List->Null
this->is->a->List->Null
