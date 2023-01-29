package JavaCookBook.chapter9.example;

public
    class Engineer extends Employee {
        int benefits = 10000;
        @Override
        public int loan (int x){
            return benefits*salary;
        }
        public String EngineerCardCode(String code){
            return employeeCardCode()+code;
        }
        public int loan(int x,int y){
            return x*y;
        }
    }
