package javacore;

public class Polymorphism  extends InheritancePolymorphism{
    public Polymorphism(int age, int second, int word) {
        super(age, second, word);
    }
    public int kidMistake=12;
    @Override
    public int  kiddCanRead(){
        return numbersOfReadingWord()-kidMistake;
    }
}
