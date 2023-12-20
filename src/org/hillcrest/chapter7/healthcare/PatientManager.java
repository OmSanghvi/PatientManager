package org.hillcrest.chapter7.healthcare;
import java.util.*;

/**
 * Class for constructing a patient manager which holds a collection of patients in an array
 */
public class PatientManager {
    /**
     * Constructor of patient manager
     */
    public PatientManager(){}

    List<Patient> patientList = new ArrayList<>();

    /**
     * Method used to add a patient into the patient list collection
     * @param Id the Id of the new patient
     * @param name the name of the new patient
     * @param age the age of the new patient
     * @param medicalCond the medical condition of the new patient
     * @return if patient is not there, return add patient, else return patient already there
     */
    public String addPatient(String Id, String name, String age, String medicalCond){
        Patient newPt = new Patient(Id, name, age,medicalCond);

        if (!(patientList.contains(newPt))){
            patientList.add(newPt);
            return "Added new patient";
        }return "Patient already exists.";

    }

    /**
     * Method for removing the patient from the list
     * @param Id the ID of the patient
     * @return if patient is there, return patient has been removed, else return it does not exist
     */
    public String removePatient(String Id){
        Patient newPt = new Patient(Id);
        if (patientList.contains(newPt)){
            patientList.remove(newPt);
            return "Patient has been removed.";
        }
        return "Does not exist";
    }

    /**
     * Method for searching and creating the patient inside as a new object
     * @param targetPatient the patient which we are searching for by the parameters
     * @return patient if its ID is in the list, else return null
     */
    public Patient SearchPatient(Patient targetPatient)
    {
        for (Patient patient : patientList) {
            if (Objects.equals(patient.getPatientID(), targetPatient.getPatientID()))
                return patient;
        }
        return null;
    }

    /**
     * Method for viewing patient details
     * @param ID ID of the patient
     * @param name name of the patient
     * @param age age of the patient
     * @param medicalCond medical condition of the patient
     * @return if in the list, return its details, else return the patient was not found.
     */
    public String viewPatientDetails(String ID,String name, String age, String medicalCond){
        Patient newPt = new Patient(ID);
        Patient foundPt = SearchPatient(newPt);

        if (foundPt != null){
            foundPt.setPatientName(name);
            foundPt.setPatientAge(age);
            foundPt.setPatientMedicalCond(medicalCond);
           return  "The ID, name, age, and medical condition of the Patient is " + foundPt.getPatientID()+", "+ foundPt.getPatientName()+", "+ foundPt.getPatientAge()+", "+foundPt.getPatientMedicalCond();
        }
        return "Patient not found.";
    }

    /**
     * Method for updating the patient parameters
     * @param ID ID of the patient in the list
     * @param name name of the patient in the list
     * @param age age of the patient in the list
     * @param medicalCond medical condition of the patient in the list
     * @return if the patient is found, return the new patient parameters, else return patient not found
     */
    public String updatePatientInfo(String ID, String name, String age, String medicalCond){
        Patient newPt = new Patient(ID, name, age, medicalCond);
        Patient found = SearchPatient(newPt);
        if (found!=null) {
            found.setPatientName(name);
            found.setPatientAge(age);
            found.setPatientMedicalCond(medicalCond);
            return "The updated patient has ID: " + found.getPatientID()+", name"+found.getPatientName()+", age"+found.getPatientAge()+", medical condition"+ found.getPatientMedicalCond();
        }
        else{
            return "Patient not found.";
        }
    }
}