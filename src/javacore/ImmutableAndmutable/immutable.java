package javacore.ImmutableAndmutable;

public class immutable {
    private final String s;
    immutable(final String s) {
        this.s = s;
    }
    public final String getName() {
        return s;
    }
    public static void main(String[] args) {
        immutable obj = new immutable("Core  Training");
        System.out.println(obj.getName());
    }
}
