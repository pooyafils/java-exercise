package algorithmanddatastructureudemy.QueueImpo;

import java8course.Stream.Employee;

import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue {
    private employee[] queue;
    private int front;
    private int back;
   public ArrayQueue(int capacity){
       queue=new employee[capacity];
   }
   public  void add(employee employee){
       if(back==queue.length){
           employee[] newArray=new employee[queue.length];
           System.arraycopy(queue,0,newArray,0,queue.length);
           queue=newArray;
       }
       queue[back]=employee;
       back++;
   }
   public employee remove(){
       if(size()==0){
           throw new NoSuchElementException();
       }
       employee employee=queue[front];
       queue[front]=null;
       front++;
       if(size()==0){
           front=0;
           back=0;
       }
        return  employee;
   }
   public int size(){
       return back-front;
   }
   public employee peek(){
       if(size()==0){
           throw new NoSuchElementException();
       }
       return queue[front];
   }

   public void pringQueue(){
       for(int i=front;i<back;i++){
           System.out.println(queue[i]);
       }
   }

}
