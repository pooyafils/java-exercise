package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class CompanySalary {
    private String name;
    private int id;
    private String date;
    private int netsalaey;
    public int insurance;
    public int tax;
    public int salary;

    public CompanySalary(String name, int id, String date, int netsalaey) {
        super();
        this.name = name;
        this.id = id;
        this.date = date;
        this.netsalaey = netsalaey;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNetsalaey() {
        return netsalaey;
    }
    public void setNetsalaey(int netsalaey) {
        this.netsalaey = netsalaey;
    }

    public int insurance() {
        return getNetsalaey()*7/10;
    }
    public int tax() {
        if(getNetsalaey()>4850000) {
            return getNetsalaey()*10/100;
        }
        else {
            return 0;
        }
    }

    public int salary() {
        return getNetsalaey()-tax()-insurance();
    }



}

