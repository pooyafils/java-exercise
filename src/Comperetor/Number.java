package Comperetor;

import java.util.Comparator;

/**
 * Created by pooya on 4/18/2020.
 */
public class Number implements Comparator< VarList> {


    @Override
    public int compare(VarList o1, VarList o2) {
        if(o1.getNumber()==o2.getNumber())
            return 0;
        else if(o1.getNumber()>o2.getNumber())
            return 1;
        else
            return -1;

    }


/*    @Override
    public int compare(VarList o1, VarList o2) {
        if(o1.getNumber()==o2.getNumber())
            return 0;
        else if(o1.getNumber()>o2.getNumber())
            return 1;
        else
            return -1;

    }*/
}

