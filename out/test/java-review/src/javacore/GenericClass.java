package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class GenericClass<E> {
        E e;
        GenericClass(E c){
            e= c;
        }
        public <E> E pooya() {
            return (E) e;
        }
    }
