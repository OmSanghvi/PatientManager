package org.hillcrest.chapter7.healthcare;
/**
 * Class for constructing a Patient with parameter: Id, name, age, and medical condition
 */
public class Patient {
    private String ID;
    private String name;
    private String age;
    private String medicalCond;

    /**
     * Constructor an initialization if all arguments are needed
     * @param Id ID of patient
     * @param Name Name of patient
     * @param Age Age of patient
     * @param Cond Condition of patient
     */
    public Patient(String Id, String Name, String Age, String Cond)
    {
        ID = Id;
        name = Name;
        age = Age;
        medicalCond = Cond;

    }

    /**
     * Constructor for only ID
     * @param Id ID of the patient which is the key to check them by
     */
    public Patient(String Id) {
        ID = Id;
    }

    /**
     * Constructor for a patient with no parameters
     */
    public Patient() {
    }

    /**
     * Method for returning the patient's ID
     * @return the ID
     */

    public String getPatientID(){
        return ID;
    }

    /**
     * Method for setting the patient's ID
     * @param ID patient's ID
     */
    public void setPatientID(String ID){this.ID = ID;}

    /**
     * Method for returning the name of the patient
     * @return patient's name
     */
    public String getPatientName(){
        return name;
    }

    /**
     * Method for setting the patient's name
     * @param name name of the patient
     */
    public void setPatientName(String name){
        this.name = name;
    }

    /**
     * Method for getting the patient's age
     * @return the age
     */
    public String getPatientAge(){
        return age;
    }

    /**
     * Method for setting the age of the patient
     * @param age age of patient
     */
    public void setPatientAge(String age){
        this.age = age;
    }

    /**
     * Method for getting the medical condition of the patient
     * @return the medical condition
     */
    public String getPatientMedicalCond(){
        return medicalCond;
    }

    /**
     * Method for setting the medical condition of the patient
     * @param medicalCond medical condition of the patient
     */
    public void setPatientMedicalCond(String medicalCond){
        this.medicalCond = medicalCond;
    }

    /**
     * Method for constructing a boolean which checks if the patient is equal to the object
     * @param obj the object of the patient that is created
     * @return boolean which checks that the patient value is not null and that its ID is the same as the variable ID
     */
    @Override
    public boolean equals(Object obj) {
        Patient pt = (Patient) obj;
        return pt != null && pt.ID.equals(this.ID);

    }
}