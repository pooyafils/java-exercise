package java9recipes.chapter6.SortingWithFeverLineOCode;

import java.util.ArrayList;
import java.util.Comparator;

public class MainForSorting {
    public static void main(String Args[]){
        Comparator<Player> byGoals = Comparator.comparing(Player::getGoals);
        ArrayList<Player> team=new ArrayList<>();
        team.add(new Player("pooya","files","def",1,10));
        team.add(new Player("po","fi","def",1,1));
        team.add(new Player("poo","f","def",1,7));
        team.add(new Player("ya","es","def",1,70));
team.stream().sorted(byGoals).map(p->p.getFirstName()+" "+p.getLastName()).forEach(elemnt->System.out.println(elemnt))  ;


    }
}
