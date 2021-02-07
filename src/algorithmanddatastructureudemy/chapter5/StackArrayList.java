package algorithmanddatastructureudemy.chapter5;

public class StackArrayList {
    public static void main(String [] args) {
ArrayStack stack=new ArrayStack(10);
stack.push(new employee("janin","alexd",12223));
        stack.push(new employee("saras","ald",55523));
        stack.push(new employee("mary","asmthif",53));
System.out.println("pick of the stack "+stack.pick());
     //   stack.printstack();
        System.out.println("poped "+stack.pop());


    }
    }
