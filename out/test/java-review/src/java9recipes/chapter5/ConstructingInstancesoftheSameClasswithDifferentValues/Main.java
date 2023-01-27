package java9recipes.chapter5.ConstructingInstancesoftheSameClasswithDifferentValues;

public class Main {
    public static void main(String args[]){

/*
        InitTeam initTeam=new InitTeam();

Teams a=   initTeam.createTeam("java","springboot");

       System.out.println(a.getCity());
       for (Players s:a.getPlayers()){
           System.out.println(s.playerString() );
       }*/
        TeamBuilder builder = new HockeyTeamBuilder();
        builder.buildNewTeam("java");
        builder.designateTeamCity("springboot");
        builder.buildPlayerList();
       System.out.println(builder.getTeam().getCity() );
    }
}
