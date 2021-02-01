package algorithmanddatastructureudemy.chapter5;

import algorithmanddatastructureudemy.hashtables.employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private employee[] stack;
    private int top;
    public ArrayStack(int capacity){
        stack=new employee[capacity];
    }

    public void push(employee emp){
        if(top==stack.length){
            //need to resixe the array
            employee[] newArray=new employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
        }
        stack[top++]=emp;
    }

    public  employee pop(){
        if(isempty()){
            throw new EmptyStackException();
        }
        employee emp=stack[--top];
        stack[top]=null;
        return emp;
    }

    public boolean isempty(){
        return top==0;
    }
    public employee pick(){
        if(isempty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size(){
        return top;
    }
    public void printstack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
