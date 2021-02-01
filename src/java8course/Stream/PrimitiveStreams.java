package java8course.Stream;

import Stream.Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    List<Trade> trades=TradeUtil.createTrades();
    private void tradeQuntity(){
Optional<Integer> quntity =trades.stream().map(Trade::getQuantity).reduce(Integer::sum);
    }
    private void intStream(){
       int [] ints=new int[]{2,4,3,5};
        IntStream intStream=IntStream.of(ints);
        intStream.forEach(System.out::println);

        IntStream intStream2=IntStream.of(2,4,3,5);
        intStream2.forEach(System.out::println);
    }
    private void doubleStream(){
        double [] doubles=new double[]{2,4,3,5};
        DoubleStream doubleStream=DoubleStream.of(doubles);
        doubleStream.forEach(System.out::println);

        DoubleStream doubleStream2=DoubleStream.of(2.1,4.2,3.0,5.8);
        doubleStream2.forEach(System.out::println);
    }
    private void convertStream(){
        int sum=   trades.stream().mapToInt(Trade::getQuantity).sum();
      int reduceSum=  trades.stream().map(Trade::getQuantity).reduce(0,(a,b)->a+b);
      System.out.println("with reduce "+reduceSum+" without reduce "+sum); //this not part of the course i wrte it

    }
    public static void main(String[] args){
     //   new PrimitiveStreams().tradeQuntity();
      //  new PrimitiveStreams().intStream();;
    //    new PrimitiveStreams().doubleStream();
        new PrimitiveStreams().convertStream();

    }
}
