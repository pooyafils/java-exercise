package java8course.Stream;


import java.util.ArrayList;
import java.util.List;

public class StreamBasic {
    private void findLargeTradesUsingStreams(List<Trade> trades) {

    }
    private List<Trade> findLargeTradesUsingPreJava8(List<Trade> trades) {
        List<Trade> largeTrade=new ArrayList<>();
        for( Trade trade :trades){
            if(trade.getQuantity()>1000){
                largeTrade.add(trade);
            }
        }
return null;
    }
        public static void main(String[] args) {
        StreamBasic basics = new StreamBasic();
        List<Trade> trades = TradeUtil.createTrades();
        //basics.findLargeTradesUsingPreJava8(trades);
        //basics.findLargeTradesUsingStreams(trades);

    }

}
