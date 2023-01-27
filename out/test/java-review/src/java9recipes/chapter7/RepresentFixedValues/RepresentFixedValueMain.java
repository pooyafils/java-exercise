package java9recipes.chapter7.RepresentFixedValues;

public class RepresentFixedValueMain {
  //  Each enum constant has an ordinal value representing its relative position in the enum declaration.
  //  The first constant in the declaration is assigned an ordinal value of zero.
  //  The ordinal() method can be used to retrieve an enum constant’s ordinal value;
  //  however, it is not recommended that applications be written
  //  to depend on this value for maintainability reasons.
    public static void main(String[] args) {
        RepresentFixedValue representFixedValue=RepresentFixedValue.EMAIL_ADDRESS;
        System.out.println("representFixedValue.name() ->"+representFixedValue.name());
        System.out.println("representFixedValue.ordinal() ->"+representFixedValue.ordinal());
        System.out.println("representFixedValue.toString() -> "+representFixedValue.toString());
        char values='a';
        double c=values;
        System.out.println(c);
    }
}
