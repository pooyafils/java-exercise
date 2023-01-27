package java9recipes.chapter5.ConstructingInstancesoftheSameClasswithDifferentValues;

public interface TeamBuilder {
    public void buildPlayerList();
    public void buildNewTeam(String teamName);
    public void designateTeamCity(String city);
    public Teams getTeam();
}
