package java9recipes.chapter6.filtering;

import java9recipes.chapter6.SortingWithFeverLineOCode.Player;

import java.util.ArrayList;
import java.util.Comparator;

public class MainForFiltering {
    public static void main(String Args[]) {
        Comparator<Player> byGoals = Comparator.comparing(Player::getGoals);
        ArrayList<Player> team = new ArrayList<>();
        team.add(new Player("pooya", "files", "def", 1, 10));
        team.add(new Player("po", "fi", "def", 1, 1));
        team.add(new Player("poo", "f", "def", 1, 7));
        team.add(new Player("ya", "es", "def", 1, 70));
        team.stream().filter(p->p.getGoals()>10).forEach(elemnt->System.out.println(elemnt));

    }
}
