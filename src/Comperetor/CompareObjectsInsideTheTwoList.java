package Comperetor;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareObjectsInsideTheTwoList {
    public static void main(String args[]){
//database arraylist
        ArrayList<VarList> database=new ArrayList<VarList>();
        database.add(new VarList(105,19,"b"));
        database.add(new VarList(101,18,"c"));
        database.add(new VarList(106,54,"database"));
//object array list
        ArrayList<VarList> object=new ArrayList<VarList>();
        object.add(new VarList(105,19,"b"));
        object.add(new VarList(106,54,"database"));


        List<VarList> resultList = new ArrayList<VarList>();
        for(VarList user1 : database) {
            for(VarList user2 : object) {
                if(user1.getName().equals(user2.getName())) {
                    resultList.add(user2);
                }
             //   System.out.println(resultList);
            }

        }
resultList.stream().map(x->x.getName()).forEach(System.out::println);


    }



}
