package singelton;
public class SingletonExample {

    // 1. Private static instance (lazy initialization)
    private static SingletonExample instance;

    // 2. Private constructor to prevent instantiation from outside
    private SingletonExample() {
        // Initialization code, if needed
    }

    // 3. Public static method to provide the instance (lazy initialization)
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void someOperation() {
        System.out.println("Performing some operation in Singleton instance");
    }

    public static void main(String[] args) {
        // Example usage
        SingletonExample singletonOne = SingletonExample.getInstance();
        SingletonExample singletonTwo = SingletonExample.getInstance();

        System.out.println("Are the instances the same? " + (singletonOne == singletonTwo));

        singletonOne.someOperation();
    }
}