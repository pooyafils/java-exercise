package java9recipes.chapter20.UnmarshallingXML;


import java.util.ArrayList;
import java.util.List;

public class Patients {

    protected List<Patient> patient;

    public List<Patient> getPatient() {
        if (patient == null) {
            patient = new ArrayList<Patient>();
        }
        return this.patient;
    }

}
