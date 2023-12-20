package org.hillcrest.chapter7.healthcare;
import java.util.Scanner;

public class PatientManagerApp {
    public static void main(String[] args) {
        var patientMgr = new PatientManager();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Patient Management System!\n" +
                "\n" +
                "Please select an option:\n" +
                "1. Add a new patient\n" +
                "2. Remove a patient\n" +
                "3. View patient details\n" +
                "4. Update patient information\n" +
                "5. Exit");
        System.out.println("Enter an option 1, 2, 3, 4, 5");
        while (in.hasNext()||in.hasNextInt()){
            int option = in.nextInt();
            if (option == 1) {
                System.out.println("Please enter your ID: ");
                String ID = in.next();
                System.out.println("Please enter your name: ");
                String name = in.next();
                System.out.println("Please enter your age: ");
                String age = in.next();
                System.out.println("Please enter your medical condition: ");
                String medicalCond = in.next();
                patientMgr.addPatient(ID, name, age, medicalCond);
                System.out.println("Enter an option 1, 2, 3, 4, 5");
            } else if (option == 2) {
                System.out.println("Please enter your ID: ");
                String ID = in.next();
                patientMgr.removePatient(ID);
                System.out.println("Enter an option 1, 2, 3, 4, 5");
            } else if (option == 3) {
                System.out.println("Please enter your ID: ");
                String ID = in.next();
                System.out.println("Please enter your name: ");
                String name = in.next();
                System.out.println("Please enter your age: ");
                String age = in.next();
                System.out.println("Please enter your medical condition: ");
                String medicalCond = in.next();
                System.out.println(patientMgr.viewPatientDetails(ID, name, age, medicalCond));
                System.out.println("Enter an option 1, 2, 3, 4, 5");
            } else if (option == 4) {
                System.out.println("Please enter your ID: ");
                String ID = in.next();
                System.out.println("Please enter new name or same name: ");
                String name = in.next();
                System.out.println("Please enter new age or same age: ");
                String age = in.next();
                System.out.println("Please enter new medical condition or same medical condition: ");
                String medicalCond = in.next();
                System.out.println(patientMgr.updatePatientInfo(ID, name, age, medicalCond));
                System.out.println("Enter an option 1, 2, 3, 4, 5");
            } else {
                System.out.println("Goodbye.");
                break;
            }
        }


    }
}
