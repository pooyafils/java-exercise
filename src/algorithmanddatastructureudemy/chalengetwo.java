package algorithmanddatastructureudemy;

public class chalengetwo {


    public static void main (String args[]){
        int[] intArray={20,35,-15,55,1,-22};
        insertationSort(intArray,intArray.length);
/*
        for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++ ){

            int newElement=intArray[firstUnsortedIndex];

            int i;

            for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--){
                intArray[i]=intArray[i-1];
            }

            intArray[i]=newElement;
        }*/
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
    public static void insertationSort(int[] input,int nimItems) {

        if (nimItems < 2) {
            return;
        }

        insertationSort(input, nimItems - 1);
        int newElement = input[nimItems - 1];

        int i;

        for (i = nimItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        System.out.println("result of call when items = " + nimItems);
    }
}
