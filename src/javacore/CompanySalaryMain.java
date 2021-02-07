package JavaCore;

/**
 * Created by pooya on 4/18/2020.
 */
public class CompanySalaryMain {

    public static void main(String[] args) {
        CompanySalary ob=new CompanySalary("pooya",12,"12/1/2018",4000);
        System.out.println("netsalary "+ob.getNetsalaey());
        System.out.println("insurance "+ob.insurance());
        System.out.println("tax "+ob.tax());
        System.out.println("salary "+ob.salary());
        System.out.println("-----------");



    }

}

