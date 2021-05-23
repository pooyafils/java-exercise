package java9recipes.chapter6.ConstructingInstancesoftheSameClasswithDifferentValues;
public class PlayerFactory {

    public static Players createPlayer(String playerType){
        Players returnType;
        switch(playerType){
            case "GOALIE":
                returnType = new Goalie();
                break;

            default:
                returnType = new AllPosition();
        }
        return returnType;
    }
}
