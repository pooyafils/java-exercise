package stream_review;

public class info {
    int lenght;
    String word;


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "info{" +
                "lenght=" + lenght +
                ", word='" + word + '\'' +
                '}';
    }
}
