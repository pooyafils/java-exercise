package IoFaradarsCourse;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class io_review {

    public static void main(String [] args) throws FileNotFoundException {

        Formatter output ;

            output = new Formatter("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");

        Scanner input = new Scanner(System.in);

        int accountNumber;
        String firstName;
        String lastName;
        double balance;

        System.out.println(" enter id,first name,last name,blance");

        while( input.hasNext()){

            accountNumber = input.nextInt();
            firstName = input.next();
            lastName = input.next();
            balance=input.nextDouble();

            if ( accountNumber > 0){

                output.format(" %d %s %s %.2f/n ", accountNumber , firstName ,lastName, balance );

            }
            else
            {
                System.out.println("number must be greater than 0");
            }


            System.out.printf("%s %s /n%s", "enter account number (<0),","first name","last name","and balance");


        } //end while
output.close();




    } //end main


} //e
