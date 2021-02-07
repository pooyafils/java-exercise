package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class NestedLoop {

    public static void main(String[] args) {
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=5;j++) {
                int k=i*j;
                System.out.println("i "+i+" j "+j+" k "+k);
            }
        }

    }

}
