public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void printValues(){
        Node runner = head;
      
        while(runner.next!= null) {
            System.out.print(runner.value + " -> ");
            runner = runner.next;
        }
        System.out.print(runner.value + " -> null\n");
    }
    //Implement a find(int) method that will return the first node with the value in the parameter.
    public Node find(int value) {
        Node runner = head;
        while(runner!= null) {
            if(runner.value == value) {
                return runner;
            }
            runner = runner.next;
        }
        return null; // If value is not found, return null
    }
    public void remove(){
        //if the list is empty
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        //if the list has only one node
        if(head.next==null){
            head=null; // remove the only node
            return;
        }
        //if the list has more than one node
        Node runner=head;
        while(runner.next.next!=null){ 
            runner=runner.next;
        }
        //if the runner.next.next is null that means that the runner is second to last node
        runner.next=null; // and we remove the last node
    }

   // Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.

    public void removeAt(int n){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(n==0){
            head=head.next;
            return;
        }
        Node runner=head;
        System.out.println("runner"+runner.value);
        for(int i=0;i<n-1;i++){
            runner=runner.next;
            if(runner==null){
                System.out.println("Index out of range");
                return;
            }
        }
        runner.next=runner.next.next;
    }
}






