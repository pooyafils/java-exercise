package lambda_review.Predicate;

import java8course.Predicate.Trade;

import java.util.function.Predicate;

public class CustomerPredicate {
    private void testPredicate(Customer customer) {

        Customer customer1 = new Customer(50, "Apooya", 200);
        Predicate<Customer> customerType = t -> t.isPerfume();
        Predicate<Customer> customerIsOld = t -> t.customerCode();
        Predicate<Customer> customerBalanceIsGood = t -> t.customerBalance();
        //and
        Predicate<Customer> customerIsPremuinAndOld = customerType.and(customerIsOld);
        //or
        Predicate<Customer> customerBalanceIsGoodOrPremun = customerType.or(customerBalanceIsGood);
        Predicate<Customer> customerIsEqual = t->customer.getType().equals("Agoogle"); //we can't really call this one a or but impo. is different
        Predicate<Customer> customerIsEqualBalance=t->t.getBalance()<200;
        Predicate<Customer> customerIsEqualBalanceOrName=customerIsEqual.or(customerIsEqualBalance);
        //we can mix and or together
        Predicate<Customer> customerIsOldOrPremuinAndGoodBalance=customerType.and(customerBalanceIsGood).or(customerIsOld);
        //Negate
        Predicate<Customer> negate=customerIsEqual.negate();
    }
    public static void main(String args[]){

    }
}
