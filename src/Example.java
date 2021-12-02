import java.util.ArrayList;
import java.util.List;

    public class Example{

        public static void main(String [] arg){

            String a = "poooya sensey is master cook";
            int max = 0;
            char let45 ='@';
            List<LetterAndNumber> letters = new ArrayList<>();

            for(int i = 0; i< a.length(); i++){

                if(letters.isEmpty()){
                    letters.add(new LetterAndNumber(a.charAt(i)));
                }else {
                    boolean bul = true;

                    for(LetterAndNumber let1: letters){

                        if(let1.getLetter() == a.charAt(i)){
                            let1.add();
                            bul = false;
                        }
                    }
                    if(bul){
                        letters.add(new LetterAndNumber(a.charAt(i)));
                    }
                }
            }
            for(LetterAndNumber let:letters ){
                if(max < let.getNumber()){
                    max = let.getNumber();
                    let45 =let.getLetter();
                }
            }
            System.out.println("Here is the max letter '"+let45+"' and the nr of times it occurs "+max+" !");
        }
}
