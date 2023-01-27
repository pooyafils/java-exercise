package enums;

public enum  EnumMethods {
    RED, GREEN, BLUE;
}

 class Test
{
    public static void main(String[] args)
    {
        // Calling values()
        EnumMethods arr[] = EnumMethods.values();

        // enum with loop
        for (EnumMethods col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(EnumMethods.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
