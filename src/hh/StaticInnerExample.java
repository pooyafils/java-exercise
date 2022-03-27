
package hh;

/**
 * Recipe 5-14
 * 
 * Static Inner Class interview.Example
 * @author Juneau
 */
public class StaticInnerExample {
    
    static String hello = "Hello";
    
    
    public static void sayHello(){
        System.out.println(hello);
    }
    
    static class InnerExample {
        String goodBye = "Good Bye";
        
        public void sayGoodBye(){
            System.out.println(this.goodBye);
        }
    }
    
    public static void main (String[] args){
        StaticInnerExample.sayHello();
        InnerExample inner =
                new InnerExample();
        inner.sayGoodBye();
    }
}


