package Bulider.builderexample;
public class TestBuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        MobilePhone comp = new MobilePhone.MobilePhoneBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setSdCardEnabled(true).build();
    }

}