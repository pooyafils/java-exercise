package Bulider.SimpleBuilder.v2;

public class TestBuilderPattern {

    public static void main(String[] args) {
        MobilePhone comp = new MobilePhone.MobilePhoneBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true).build();
        System.out.println(comp);
    }

}