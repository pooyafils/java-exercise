package Comperetor;

/**
 * Created by pooya on 4/18/2020.
 */

    public class Comp implements Comparable<Comp> {
        int number;
        String name;
        int age;
        Comp(int number, String name, int age ){
            this.name=name;
            this.number=number;
            this.age=age;

        }
        @Override
        public int compareTo(Comp o) {
            // TODO Auto-generated method stub
            return name.compareTo(o.name);
        }


//	public int compareTo(comp o) {
//		if(number==o.number)
//		return 0;
//		else if(number>o.number)
//			return 1;
//			else
//				return -1;
//	}
        //@Override
        // public int compareTo(comp o){
        //  return this.number-o.number;
        //  }


    }

