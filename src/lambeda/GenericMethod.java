package lambeda;

/**
 * Created by pooya on 4/13/2020.
 */
public class GenericMethod {
    interface mygeneric<T>{
        T compute(T t);
    }


    public static void main(String[] args) {
        mygeneric<String> revers=(str)-> {
            String r="";
            for(int i = str.length()-1; i >= 0; i--)
                r += str.charAt(i);

            return r;
        };
        System.out.println(revers.compute("is"));
    }

}
