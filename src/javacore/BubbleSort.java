package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] array){

        System.out.println("Bubble sort start: ");
        System.out.print("Current sequence: ");
        printArray(array);

        for(int i = 0; i < array.length; i++){

            int modify = 0;
            System.out.println("Sequence (i = " + (i + 1) +"): \n");

            for(int y = 0; y < array.length - 1; y++){

                if(array[y] > array[y+1]){
                    System.out.print("Sub-sequence (y = " + (y + 1) +"): ");

                    int temp = array[y+1];
                    array[y+1] = array[y];
                    array[y] = temp;

                    printArray(array);
                    modify++;
                }

            }

            if(modify == 0) break;
        }

        System.out.println("Bubble sort finished:");
        printArray(array);

    }

    public static void printArray(int [] array){

        for(int i : array){
            System.out.print(i + ((i == array[array.length - 1])? "; \n":", "));
        }

        System.out.println("");

    }

    public static int[] listConvert(List<Integer> list){
        int[] array  = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            array[i] = Integer.valueOf(list.get(i));
        }

        return array;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<Integer> arrayList = new ArrayList<>();

        while(scan.hasNext()){
            String number = scan.next();

            try{

                arrayList.add(Integer.parseInt(number));

            }catch(NumberFormatException e){

                System.out.println("Ending sequence...");
                break;

            }
        }

        int [] array = listConvert(arrayList);
        bubbleSort(array);

    }
}
