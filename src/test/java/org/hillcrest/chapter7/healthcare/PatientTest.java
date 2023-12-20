package test.java.org.hillcrest.chapter7.healthcare;

import org.hillcrest.chapter7.healthcare.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PatientTest {

    private Patient patient = new Patient();

    @Test
    public void testGetPatientID() {
        String ID = "123";
        patient.setPatientID(ID);
        Assertions.assertEquals("123", patient.getPatientID());
    }

    @Test
    public void testGetPatientName() {
        String name = "Bob";
        patient.setPatientName(name);
        Assertions.assertEquals("Bob", patient.getPatientName());
    }

    @Test
    public void testGetPatientAge() {
        String age = "14";
        patient.setPatientAge(age);
        Assertions.assertEquals("14", patient.getPatientAge());
    }

    @Test
    public void testGetPatientMedicalCond() {
        String medicalCond = "Flu";
        patient.setPatientMedicalCond(medicalCond);
        Assertions.assertEquals("Flu", patient.getPatientMedicalCond());
    }

    @Test
    public void testEquals() {
        String ID = "123";
        Patient pt = new Patient(ID);
        Object obj = pt;
        Assertions.assertEquals(pt, obj);

    }
}