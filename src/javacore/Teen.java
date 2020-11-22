package javacore;

public class Teen extends InheritancePolymorphism {
    public Teen(int age, int second, int word) {
        super(age, second, word);
    }

    public void numberTeenCanRead(){
        System.out.println(numbersOfReadingWord());
    }

}
