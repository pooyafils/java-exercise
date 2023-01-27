package java9recipes.chapter6.existingmethod;

import java9recipes.chapter6.SortingWithFeverLineOCode.Player;

import java.util.Arrays;

public class InvokingExistingMethod {
    public static void main(String args[]){
        Player teamArray []={new Player("alex","alex"
        ,"goal kepper",1,12),new Player("a","a"
                ,"player",1,2)};


       Arrays.sort(teamArray, Player::compareByGoal);
       System.out.println(Arrays.toString(teamArray));
    }
}
