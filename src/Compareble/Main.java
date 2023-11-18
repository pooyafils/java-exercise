package Compareble;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pooya on 4/18/2020.
 */
public class Main {
    public static void main(String args[]){
        ArrayList<Comp> al=new ArrayList<Comp>();
        al.add(new Comp(101,"Vijay",3));
        al.add(new Comp(106,"Ajay",54));
        al.add(new Comp(105,"Jai",19));

        Collections.sort(al);
        // we can't have muliue srt cikoanc
        for(Comp st:al){
            System.out.println(st.number+" "+st.name);
        }
    }
}

