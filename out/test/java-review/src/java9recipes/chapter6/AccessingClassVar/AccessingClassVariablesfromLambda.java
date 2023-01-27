package java9recipes.chapter6.AccessingClassVar;

import java.util.function.Consumer;

public class AccessingClassVariablesfromLambda {
    public String CLASSA = "Class-level A";

    class InnerClass {

        public String CLASSA = "Class-level B";

        void lambdaInMethod(String passedIn) {
            String METHODA = "Method-level A";

            Consumer<String> l1 = x -> {
                System.out.println(x);
                System.out.println("CLASSA Value: " + CLASSA);
                System.out.println("METHODA Value: " + METHODA);
            };

            l1.accept(CLASSA);
            l1.accept(passedIn);

        }
    }
}
