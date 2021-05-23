package java9recipes.chapter6.ConstructingInstancesoftheSameClasswithDifferentValues;

public class InitTeam {
    public Teams createTeam(String teamName, String city){
        TeamBuilder builder = new HockeyTeamBuilder();
        builder.buildNewTeam(teamName);
        builder.designateTeamCity(city);
        builder.buildPlayerList();
        return builder.getTeam();
    }
}
