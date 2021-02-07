package lambeda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooya on 4/18/2020.
 */
public class MethodRefrance {
    static void doubleit(int i) {
        System.out.println(i*2);
    }
    public static void main(String[] args) {
        List<Integer> pooya=new ArrayList<Integer>();
        pooya.add(2);
        pooya.add(5);
        pooya.forEach(MethodRefrance::doubleit);
        System.out.println();
    }

}

