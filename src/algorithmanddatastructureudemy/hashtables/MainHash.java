package algorithmanddatastructureudemy.hashtables;

public class MainHash {
    public static void main(String args[]){


        employee employee=new employee("jane","jones",123);
        employee employee2=new employee("sara","mac",123);
        employee employee3=new employee("janet","jo",123);
        employee employee4=new employee("alex","jos",123);
        employee employee5=new employee("rily","jos",123);
SimpleHashTable simpleHashTable=new SimpleHashTable();
simpleHashTable.put("boss",employee);
simpleHashTable.put("secratary",employee2);
simpleHashTable.put("jenetor",employee4);
simpleHashTable.put("rily",employee5);
simpleHashTable.pringHashTable();
//System.out.println("geting a empolyee "+simpleHashTable.get("boss"));
      //  System.out.println("geting a empolyee "+simpleHashTable.get("rily"));


    }
}
