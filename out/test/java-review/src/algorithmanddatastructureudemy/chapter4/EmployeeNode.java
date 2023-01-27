package algorithmanddatastructureudemy.chapter4;

public class EmployeeNode {
private  employee employee;
private EmployeeNode next;
//refreance to the next node in the list

    public EmployeeNode(employee employee) {

        this.employee = employee;
    }

    public employee getEmployee() {
        return employee;
    }

    public void setEmployee(employee employee) {

        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString(){
        return employee.toString();
    }
}
