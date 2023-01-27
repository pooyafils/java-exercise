package enums;

public enum  EnumConstructors {
    RED, GREEN, BLUE;

    EnumConstructors() {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}
     class Tests
    {
        // Driver method
        public static void main(String[] args)
        {
            EnumConstructors c1 = EnumConstructors.RED;
            System.out.println(c1);
            c1.colorInfo();
        }
}
