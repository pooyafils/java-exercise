package JsonProcessing.JSONOBJECT;

import java.util.List;

public class MyObject {
    private int intVal;
    private String stringVal;
    private List<String> list;

    public MyObject() {
    }

    public MyObject(int intVal, String stringVal, List<String> list) {
        this.intVal = intVal;
        this.stringVal = stringVal;
        this.list = list;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "intVal=" + intVal +
                ", stringVal='" + stringVal + '\'' +
                ", list=" + list +
                '}';
    }
}
