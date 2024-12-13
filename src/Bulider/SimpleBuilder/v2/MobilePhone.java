package Bulider.SimpleBuilder.v2;

public class MobilePhone {

    //required parameters
    private String SSD;
    private String RAM;

    //optional parameters
    private boolean isSdCardEnabled;
    private boolean isBluetoothEnabled;


    public String getSSD() {
        return SSD;
    }

    public String getRAM() {
        return RAM;
    }
    public boolean isSdCardEnabled() {
        return isSdCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private MobilePhone(MobilePhoneBuilder builder) {
        this.SSD=builder.SSD;
        this.RAM=builder.RAM;
        this.isSdCardEnabled=builder.isSdCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public static class MobilePhoneBuilder{

        // required parameters
        private String SSD;
        private String RAM;

        // optional parameters
        private boolean isSdCardEnabled;
        private boolean isBluetoothEnabled;

       public MobilePhoneBuilder(String SSD, String ram){
            this.SSD=SSD;
            this.RAM=ram;
        }

        public MobilePhoneBuilder setSdCardEnabled(boolean isSdCardEnabled) {
            this.isSdCardEnabled = isSdCardEnabled;
            return this;
        }

        public MobilePhoneBuilder setBluetoothEnabled(boolean
                                                              isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public MobilePhone build(){
            return new MobilePhone(this);
        }

    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "SSD='" + SSD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isSdCardEnabled=" + isSdCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}