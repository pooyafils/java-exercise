package myexception;

public class Exception {
    public int pooya  (int a) throws NullPointerException {
//a= Integer.parseInt(null);
       return a;
    }
    public int error(){
       // throw new ArrayIndexOutOfBoundsException();
return 0;
    }
    public void d(){
     try{
         System.out.println("this is throw with catch");
     } catch (ArrayIndexOutOfBoundsException e) {
         throw e;
     }
    }
}
