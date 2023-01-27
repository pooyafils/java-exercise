package java9recipes.chapter5.ConstructingInstancesoftheSameClasswithDifferentValues;

import java.util.List;

public class Teams implements TeamTypes {
    private List<Players> players;
    private String name = null;
    private String city = null;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    /**
     * @return the players
     */
    public List<Players> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String getFullName(){
        return this.name + "  – "  + this.city;
    }

}
