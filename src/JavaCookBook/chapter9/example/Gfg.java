package JavaCookBook.chapter9.example;

// Driver Class
class Gfg {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
        System.out.println("over ride "+E1.loan(100));
        System.out.println("over load"+E1.loan(100,100));
    }
}
