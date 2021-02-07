package Bulider;

/**
 * pooya mahmoodi 9/4/2020
 **/
public class MainBulider {
    public static void main(String[] args){
        User user=new UserBulider().setAge(12).setFamilyName("pooya").builder();
        User users=new UserBulider().setFamilyName("pooya").builder();

        System.out.println(user);
    }
}
