package JavaCore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooya on 4/18/2020.
 */
public class Generic {
    int num;

    Generic(int num) {
        this.num = num;
    }

    public <Integer> int integer_ge() {
        return num;
    }

    public <E> List listpooya(List<E> pooya) {
        return pooya;
    }

    public <E> void add(E t) {
        System.out.println(t);
    }

    public <E> E pooya(E t) {
        return t;
    }


}