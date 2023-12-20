package test.java.org.hillcrest.chapter7.healthcare;
import org.hillcrest.chapter7.healthcare.Patient;
import org.hillcrest.chapter7.healthcare.PatientManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PatientManagerTest {
    // Test constructor(s) and all getters and setters
        private PatientManager manager = new PatientManager();

        @Test
        public void testAddPatientSuccess() {
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            manager.addPatient(ID, name, age, medicalCond);
            Patient targetPatient = manager.SearchPatient(pt);
            Assertions.assertEquals(pt, targetPatient);
            // Test adding a new patient (should succeed)
        }
        @Test
        public void testRemovePatientSuccess(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            manager.removePatient(ID);
            Patient targetPatient = manager.SearchPatient(pt);
            Assertions.assertNotEquals(pt,targetPatient);
        }

        @Test
        public void testAddDuplicatePatient() {
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            String patient1 = manager.addPatient(ID, name, age, medicalCond);
            String patient2 = manager.addPatient(ID, name, age, medicalCond);
            //Patient targetPatient = manager.SearchPatient(pt);
            Assertions.assertNotEquals(patient1, patient2);
            // Test adding a patient with a duplicate ID (should fail)
        }
        @Test
        public void testGetPatientList(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            List<Patient> patientList = new ArrayList<>();
            patientList.add(pt);
            Assertions.assertEquals(pt, patientList.get(0));
        }
        @Test
        public void testViewPatientDetailsSuccess(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            manager.addPatient(ID, name, age, medicalCond);
            Assertions.assertEquals("The ID, name, age, and medical condition of the Patient is "+ ID+", "+name+", "+age+", "+medicalCond, manager.viewPatientDetails(ID, name, age, medicalCond));
        }
        @Test
        public void testViewPatientDetailsNull(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            manager.removePatient(ID);
            Assertions.assertEquals("Patient not found.", manager.viewPatientDetails(ID, name, age, medicalCond));
        }
        @Test
        public void testUpdatePatientInfoSuccess(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            String oldPatient = manager.addPatient(ID, name, age, medicalCond);
            String newName = "OmS";
            String newAge = "12";
            String newMedicalCond = "COVID";
            String newPatient = manager.updatePatientInfo(ID, newName, newAge, newMedicalCond);
            Assertions.assertNotEquals(oldPatient, newPatient);
        }
        @Test
        public void testUpdatePatientNull(){
            String ID = "1";
            String name = "Om";
            String age = "10";
            String medicalCond = "Flu";
            Patient pt = new Patient(ID, name, age, medicalCond);
            manager.removePatient(ID);
            Assertions.assertEquals("Patient not found.", manager.updatePatientInfo(ID, name, age, medicalCond));
        }

        // add the rest of your tests to get full coverage
    }