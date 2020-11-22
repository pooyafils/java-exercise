package lambda_review.Consumer;

public class Customer {
    int Customer;
    String type;
    int balance;

    public Customer(int customer, String type, int balance) {
        Customer = customer;
        this.type = type;
        this.balance = balance;
    }
    public  boolean isPerfume(){
      if(getType().startsWith("A")){
          return true;
      }
      else
          return false;
    }
    public boolean customerBalance(){
        if(getBalance()<100){
            return false;
        }
        else return true;
    }
    public boolean customerCode(){
        if(getCustomer()>100)
            return true;
        else
            return false;
    }

    public int getCustomer() {
        return Customer;
    }

    public void setCustomer(int customer) {
        Customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer=" + Customer +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
