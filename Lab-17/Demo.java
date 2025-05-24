public class Demo {
    // public class CirculerFirst{
        Node head;
        Node last;
        public Demo(){
            this.head=null;
            this.last=null;
        }
        class Node{
            int info;
            Node link;
            public Node(int data){
                this.info=data;
                this.link=null;
            }
        }
    
        // insert at first
    
        public void insertAtFirst(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                last=newnode;
            } else{
                last.link=newnode;
                newnode.link=head;
                head=newnode;
            }
                
        }
    
        //insert at last
    
        public void insertAtLast(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                last=newnode;
            } else{
                last.link=newnode;
                newnode.link=head;
                last=newnode;
            }
                
        }
    
        // insert at order
    
        public void insertAtOrd(int data){
            Node newnode=new Node(data);
            Node first=head.link;
            if(first==null){
                newnode=newnode.link;
                first=newnode;
                last=newnode;
                return;
            }
            if(newnode.info<=first.info){
                
                newnode.link=first;
                last.link=newnode;
                first=newnode;
            }
            Node save=first;
            while(save!=last && newnode.info >= save.link.info){
                save=save.link;
            }
            newnode.link=save.link;
            save.link=newnode;
            if(save == last){
                last = newnode;
            }
        }
    
        // delete at position
    
        public void deleteAtPosition(int key){
            Node pred = head;
            Node save = head.link;
            if(pred.info == key){
                head = head.link;
            }
            while(save.info != key){
                pred = save;
                save=save.link;
            }
            pred.link = save.link;
        }   
    
        public void print(){
            Node temp=head;
            if(head!=null){
                do { 
                    System.out.print(temp.info+" -> ");
                    temp=temp.link;
                }
                while(temp!=head);
            }
        }
        public static void main(String[] args) {
            Demo c = new Demo();
            c.insertAtFirst(4);
            c.insertAtFirst(3);
            c.insertAtFirst(2);
            c.insertAtFirst(1);
            c.print();
            // System.out.println();
            // c.insertAtFirst(5);
            // c.print();
            // System.out.println();
            // c.insertAtLast(7);
            // c.print();
            // System.out.println();
            // c.insertAtOrd(1);
            // c.print();
            // System.out.println();
            // c.deleteAtPosition(1);
            // c.print();
        }
    }

