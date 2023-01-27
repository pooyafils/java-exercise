package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class NestedClass {

        int x=12;
        // int c=y; /error
        public void pooya() {
            System.out.println("pooya");
        }
        class inner {
            int y=x;

            public void mahmoodi() {
                pooya();
            }
        }
    }
