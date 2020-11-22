package java8course;

import java.util.concurrent.Callable;
//its fun. interface
public class Runnables {
    public void methodAcceptingRunnable(Runnable r){

    }
//its fun. interface

    public void methodAcceptingCallable(Callable c){

    }
interface Tradable<Trade>{
       boolean check(Trade t);
}
    Tradable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();

    Tradable<Trade> ibmTradeLambda = (trade ) -> trade.getInstrument().equals("IBM");

    public static void main(String args[]) {
    Runnable runnable=()-> System.out.println("helllo");
    new Runnables().methodAcceptingRunnable(runnable);
    new Runnables().methodAcceptingRunnable(
            ()->System.out.println("complex lambda")
    );
Callable callable=()->"hello callable";
new Runnables().methodAcceptingCallable(
        ()->{
            return "hello";
        });

    }
    }
