public class PrimaryNumber {
    public static boolean primaryNumber(int num){
        if(num%2>0){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(primaryNumber(2));
    }
}
