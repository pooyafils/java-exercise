package lambeda;

/**
 * Created by pooya on 4/12/2020.
 */
public class LambdaEampleWithMethod {


    public interface add{
        int add(int i,int j);

    }
    public interface Email{
        String constractEmail(String name);
    }

    Email email =(String name)->name+"pooya";
    public String getname(String name,Email email) {
        return null;

    }
    public String name(String name,Email email) {
        return email.constractEmail(name);

    }
    public int addnumber(int i,int j,add add) {
        return add.add(i, j);
    }
    public static void main(String[] args) {
        new LambdaEampleWithMethod().getname("llk", (String name) -> name + "pooya");
        LambdaEampleWithMethod ob = new LambdaEampleWithMethod();
        int add = ob.addnumber(3, 4, (i, j) -> i + j);
        System.out.println(add);
        String b = ob.name("po", (String name) -> name + "pooya");
        String c = ob.getname("test", (String name) -> name + "po");
        System.out.print(b + "/t" + c);
    }}