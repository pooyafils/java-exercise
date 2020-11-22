package lambda_review;

import java.util.function.Function;

public class FunctionIInterface implements Function<Long,Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong+10;

    }
    public static void main (String args[]){
        Function<Long,Long> ex=new FunctionIInterface();
        Long result=ex.apply(4l);
        System.out.println(result);
        //providing a impo. here not on the method
        Function<Long,Long> exx=( i)->i+20;
        Long impo=exx.apply(4l);
        System.out.println(impo);

    }
}
