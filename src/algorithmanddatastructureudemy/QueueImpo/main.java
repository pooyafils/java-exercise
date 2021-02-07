package algorithmanddatastructureudemy.QueueImpo;

public class main {
    public static void main(String[] args){
        employee janeJones = new employee("Jane", "Jones", 123);
        employee johnDoe = new employee("John", "Doe", 4567);
        employee marySmith = new employee("Mary", "Smith", 22);
        employee mikeWilson = new employee("Mike", "Wilson", 3245);
        employee billend = new employee("Bill", "end", 78);
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billend);
       // queue.pringQueue();

        queue.remove();
        queue.remove();
        // queue.pringQueue();

       // System.out.println(queue.peek());
        queue.remove();
        queue.remove();


        queue.remove();
        queue.pringQueue();
         queue.add(mikeWilson);
        queue.pringQueue();






    }
}
