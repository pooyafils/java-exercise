package interview;

public class EditingString {
    public static void main(String[] args) {
        String uuid="9b1deb4d3b7d4bad9bdd2b0d7b3dcb6d";
      char[] a=  uuid.toCharArray();
      char[] b= new char[a.length+4];
        for(int i=0;i<a.length;i++){
            if(i==9 ||i==13 ||i==17||i==21){
                b[i]='-';

            }
            else {
                b[i]=a[i];
            }
        }
        System.out.println(b);
    }
}
