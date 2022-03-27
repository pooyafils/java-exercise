package interview;

public class finallyExample {
    public static void main(String [] args) {
try{
 throw new ArrayIndexOutOfBoundsException();
}
catch (Exception e){
    e.printStackTrace();
}


finally {
    System.out.println("ddddd");
}

    }
    }
