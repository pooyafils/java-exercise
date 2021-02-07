package Comperetor;

import java.util.Comparator;

/**
 * Created by pooya on 4/18/2020.
 */
public class Name implements Comparator<VarList> {
    public int compare(VarList o1, VarList o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }

}
