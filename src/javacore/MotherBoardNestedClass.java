/*
package javacore;

class MotherBoardNestedClass {
        String model;
public MotherBoardNestedClass(String model) {
        this.model = model;
        }

// static nested class
static class USB{
    int usb2 = 2;
    int usb3 = 1;
    int getTotalPorts(){
        // accessing the variable model of the outer classs
        if(MotherBoardNestedClass.this.model.equals("MSI")) {
            return 4;
        }
        else {
            return usb2 + usb3;
        }
    }
}
}
public class Main {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoardNestedClass.USB usb = new MotherBoardNestedClass.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}*/
