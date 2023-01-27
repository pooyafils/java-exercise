package java8course;

public class CapturingLambda {
    Trade trade = new Trade("IBM",20000, "OPEN");

    public interface ITrade{
        public boolean check(Trade t);
    }

    public boolean isOpenTrade(){
        ITrade simpleLambda = (t) -> t.isOpen()?true:false;
        return simpleLambda.check(trade);
    }
    public boolean checkStatus(String status){
        ITrade statusLambda = (t)->t.getStatus().equals(status)?true:false;
        return statusLambda.check(trade);

    }
    public static void main(String[] args) {
        CapturingLambda cl = new CapturingLambda();
        System.out.println("is Open Trade using non-capturing lambda: " + cl.isOpenTrade());
    }
}
