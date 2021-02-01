package algorithmanddatastructureudemy.chapter4;

public class EmployLinkList {
    private EmployeeNode head;
    private int size;
    public void addToFront(employee employee){
       EmployeeNode employeeNode=new EmployeeNode(employee);
       //System.out.println(head);
       employeeNode.setNext(head);
       //reference to the element that was before  line 8
       head=employeeNode;
       size++;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;

    }
    public void printList(){
        EmployeeNode current=head;
        System.out.println("HEAD");
        while (current!=null){
            System.out.println(current);
           System.out.println("->");
            current=current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removeNode=head;
        head.getNext();
        size--;
        return removeNode;
    }

}
