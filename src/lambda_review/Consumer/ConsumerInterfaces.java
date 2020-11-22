package lambda_review.Consumer;

import java.util.function.Consumer;

public class ConsumerInterfaces {
    Consumer<Customer> saveCustomer = m -> saveInDatabase(m);
    Consumer<Customer> printInfo = m -> System.out.println("printing info of customer " + m);
    Consumer<Customer> notify = m -> notifys(m);

    private void saveInDatabase(Customer customer) {
        System.out.println("customer has been saved " + customer);
    }

    private void notifys(Customer customer) {
        System.out.println("notify the customer " + customer);
    }

    public void testCustomer(Customer customer) {
        saveCustomer.accept(customer);
        printInfo.accept(customer);
        notify.accept(customer);
    }
    public void testCustomerForThan(Customer customer){
        Consumer<Customer> printAndThanShow=  saveCustomer.andThen(printInfo);
        printAndThanShow.accept(customer);
    }

    public static void main(String args[]) {
        Customer customer=new Customer(12,"A",2000);
        new ConsumerInterfaces().testCustomer(customer);
        System.out.println("===========");
        new ConsumerInterfaces().testCustomerForThan(customer);
    }
}