package JavaCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingArrayList {
public  ArrayList<Integer> showArrayList(ArrayList<Integer> v) {
	return v;	
}
public  int showArrayListIndex(ArrayList<Integer> v,int index) {
	if(index>v.size()) {
		System.out.print("wrong index ");
		return 0;
	}
	int i=v.get(index);
	return i;
	
}
public ArrayList<Integer> updateIndex(ArrayList<Integer> v,int index,int value){
    	v.add(index,value);
	return v;
}
public String  searchInArrayList(ArrayList<Integer> v,int value) {

for(int i:v) {
	if(i==value) {
		return "value exist in the list "+value;
	}
}
	
	return "value does not exist in the list";
}
public ArrayList<Integer> removeAll(ArrayList<Integer> v){
	 ArrayList<Integer> pooya=new ArrayList<Integer>();
	 
		 v.removeAll(v);
	
	
	return v;
}
public  List<Integer> add(ArrayList<Integer> v,ArrayList<Integer> c){

ArrayList<Integer> newList = new ArrayList<Integer>();
return Stream.of(v, c)
		   .flatMap(x -> x.stream())
		   .collect(Collectors.toList());
}
public ArrayList<Integer> reverse(ArrayList<Integer> v){
	ArrayList<Integer> re=new ArrayList<Integer> ();

			Collections.reverse(v);
			return v;
}
}

