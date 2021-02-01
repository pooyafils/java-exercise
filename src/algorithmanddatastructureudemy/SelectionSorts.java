package algorithmanddatastructureudemy;

public class SelectionSorts {
    public static void main(String [] args){
        int[] intArrray={20,35,-15,55,1,-22};
        for(int lastUnsortedIndex=intArrray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
        int largeest=0;
        for(int i=1;i<=lastUnsortedIndex;i++){
            if(intArrray[i]>intArrray[largeest]){
                largeest=i;
            }
        }
swap(intArrray,largeest,lastUnsortedIndex);


        }


        for(int i=0;i<intArrray.length;i++){
            System.out.println(intArrray[i]);
        }


    }
    public static void  swap(int[] array,int i,int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        // we put what is in j to i
        array[j]=temp;
     //   System.out.println(array[i]+" "+array[j]);
    }
}
