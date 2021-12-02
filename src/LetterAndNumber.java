public class LetterAndNumber{

    private char letter;
    private int number = 0;

    public LetterAndNumber(char letter){

        this.letter = letter;
        number++;
    }

    public void add(){
        number++;
    }

    public int getNumber(){
        return number;
    }

    public char getLetter(){
        return this.letter;
    }
}