package java9recipes.chapter6.SortingWithFeverLineOCode;
public class Player {

    private String firstName = null;
    private String lastName = null;
    private String position = null;
    private int status = -1;
    private int goals;

    public Player(){

    }

    public Player(String firstName, String lastName, String position, int status, int goals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.status = status;
        this.goals = goals;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Player(String position, int status){
        this.position = position;
        this.status = status;
    }

    public String findPlayerStatus(int status){
        String returnValue = null;

        switch(status){
            case 0:
                returnValue = "ACTIVE";
            case 1:
                returnValue = "INACTIVE";
            case 2:
                returnValue = "INJURY";
            default:
                returnValue = "ON_BENCH";
        }

        return returnValue;
    }

    public String playerString(){
        return getFirstName() + " " + getLastName() + " - " + getPosition();
    }

    // ** getters and setters removed for brevity **

    /**
     * Returns a positive integer if Player A has more goals than Player B
     * Returns a negative integer if Player A has fewer goals than Player B
     * Returns a zero if both Player A and Player B have the same number of goals
     */
    public static int compareByGoal(Player a, Player b){
        int eval;
        if(a.getGoals() > b.getGoals()){
            eval = -  1;
        } else if (a.getGoals() < b.getGoals()){
            eval = 1;
        } else {
            eval = 0;
        }
        return eval;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", status=" + status +
                ", goals=" + goals +
                '}';
    }
}