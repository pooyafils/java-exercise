package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class PolymorphismMainClass {

    public static void  main(String[] args) {
        PolymorphismSuperClass pooya=new PolymorphismSubClass();
        pooya.run();
        System.out.println("    ");
        PolymorphismSubClass poo=new PolymorphismSubClass();
        //refrancing to super class
        poo.inhr();
    }

}
