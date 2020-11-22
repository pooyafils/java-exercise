package javacore;

public class InheritancePolymorphism {
    public int age;
    public int second;
    public int word;

    public InheritancePolymorphism(int age, int second, int word) {
        this.age = age;
        this.second = second;
        this.word = word;
    }

    public int numbersOfReadingWord(){
        return word*second;
    }
    public int  kiddCanRead(){
        return 12;
    }
}
