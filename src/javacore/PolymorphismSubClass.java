package javacore;

/**
 * Created by pooya on 4/18/2020.
 */
public class PolymorphismSubClass extends JavaCore.PolymorphismSuperClass {

        @Override
        //@Override annotation example
        public void run() {
            System.out.print("you are runging");

        }
        public void inhr() {
            super.run();
        }
    //int x=y;
        int x=0;
    }
