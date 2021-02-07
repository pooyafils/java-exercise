package JavaCore;

import java.util.ArrayList;

/**
 * Created by pooya on 4/18/2020.
 */
public class GenericMain {
    public static void main(String[] args) {
        GenericClass<Integer> ob= new GenericClass<>(5);
        int a=ob.pooya();
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(1);
        obj.add(2);
        obj.add(34);
        obj.add(2);

        System.out.println("totoal generic methid by generic class "+a);
        Generic bo2= new Generic (9);
        System.out.println(" a nit generic method but not reall one "+bo2.integer_ge());
        System.out.println("generic method with generic type parameter "+bo2.pooya(12));
        System.out.println("generic method with generic type parameter "+bo2.pooya("my name"));
        System.out.print("generic method with void type parameter ");
        bo2.add(2);
//	System.out.println();
        System.out.println("generic method with List return "+bo2.listpooya(obj));
    }

}

