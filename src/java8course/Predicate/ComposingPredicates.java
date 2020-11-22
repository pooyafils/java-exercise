package java8course.Predicate;

import java.util.List;
import java.util.function.Predicate;

public class ComposingPredicates {

    private void testPredicate(Trade trade){
        //AND
        Predicate<Trade> bigTrade=t->t.isBigTrade();
        Predicate<Trade> cancelTrade=t->t.isCancelledTrade();
        Predicate<Trade> bigAndCancelTrade=t->t.isBigTrade()&&t.isCancelledTrade();
        //adding one predicate yo other one
        Predicate<Trade> bigAndCancelTrade2=bigAndCancelTrade.and(bigAndCancelTrade);
        Predicate<Trade> issuerTrade=t->t.getInstrument().equals("GOOG");
        Predicate<Trade> bingCancelTradeForGoogoleIssuer=bigAndCancelTrade2.and(issuerTrade);
        //OR
        Predicate<Trade> newTrade=t-> trade.getStatus().equals("NEW");
        Predicate<Trade> CancellTrade=t-> trade.getStatus().equals("Canbcel");
        //we can mix and ,or togather to make more complex predicate
        Predicate<Trade> NewOrCancellTradeButBigTrade=newTrade.or(cancelTrade).and(bigTrade);
        //we can mix and ,or togather to make more complex predicate
        //NEGATE
        Predicate<Trade> notANewTrade=newTrade.negate();
        //EQUAL for comparing two objects

        List<Trade> trades = TradeUtil.createTrades();

        Trade t1 = new Trade("GOOG", 200000, "CANCEL");

        Predicate<Trade> p1 = Predicate.isEqual(t1);

        for(Trade t : trades){
            if(p1.test(t))
                System.out.println("Matching trade: "+t);
        }

    }
}
