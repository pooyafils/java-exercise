package java9recipes.chapter6.ConstructingInstancesoftheSameClasswithDifferentValues;

import java.util.ArrayList;
import java.util.List;

public class HockeyTeamBuilder implements TeamBuilder {

    private Teams team;

    public HockeyTeamBuilder(){
        this.team = new Teams();
    }

    @Override
    public void buildPlayerList() {
        List players = new ArrayList();
        for(int x = 0; x <= 10; x++){
            players.add(PlayerFactory.createPlayer("ALL"));
        }
        team.setPlayers(players);
    }

    @Override
    public void buildNewTeam(String teamName) {
        team.setName(teamName); //see this
    }

    @Override
    public void designateTeamCity(String city){
        team.setCity(city);
    }

    public Teams getTeam(){
        return this.team;
    }

}