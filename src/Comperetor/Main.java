package Comperetor;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pooya on 4/18/2020.
 */
public class Main {

    public static void main(String args[]){
        ArrayList<VarList> al=new ArrayList<VarList>();
        al.add(new VarList(105,19,"b"));

        al.add(new VarList(101,18,"c"));

        al.add(new VarList(106,54,"alex"));

        //	Collections.sort(al,new varlist()); //error happen
        Collections.sort(al, new Name());
//		Iterator itr=al.iterator();
//		while(itr.hasNext()){
//		varlist st=(varlist)itr.next();
//		System.out.println(st.getName());
//		}

        for(VarList a: al) {
            System.out.println(a.getName());
        }
        System.out.println("-----------------");
        Collections.sort(al,new Number());
        for(VarList a: al) {
            System.out.println(a.getNumber());
        }


    }
}

