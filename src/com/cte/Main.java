package com.cte;

 
import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // main takes care of the terminal and runs the application continuous until exit
        String hospName = "";
        int sel = 666;
        Scanner userSel = new Scanner(System.in);
        Hospital hospital = new Hospital();
        Filehandler filehandler = new Filehandler();

        // creates a mockdata file in _hospfiles so you can start playing around with correct fileformat
//        filehandler.writeCustomersToFile(Mock.initiateMymock(new Hospital()),"mockHosp.txt");

        //simple UI to test the methods
        while(true)
        {
            System.out.println(" |**********************| ");
            System.out.println(" |****     MENU     ****| ");
            System.out.println(" |**********************| ");
            System.out.println(" 0. List files "); //list files in a certain directory
            System.out.println(" 1. Create new files "); //Generates a new hospital files
            System.out.println(" 2. Import patient list"); //Reads a patient list from file
            System.out.println(" 3. Add a patient"); //add patient to hospital
            System.out.println(" 4. Remove a patient"); //remove patient from hospital

            System.out.println(" 5. Get patient information"); //get information on patient
            System.out.println(" 6. Change patient information"); //change patient information

            System.out.println(" 100. Exit ");
            System.out.println("....................");
            System.out.println("Make your choice!");



            //make sure the input is correct
            try {
                sel = userSel.nextInt();
            } catch (Exception e) {
                System.out.println("bad input");
                userSel.next();
            }

            //exit the app
            if(sel == 100) break;


            //select what action to do
            switch (sel) {
                //list all files in directory
                case 0 -> {
                    System.out.println("Available files:");
                    filehandler.listFiles();
                }

                //create a new files
                case 1 -> {
                    filehandler.createFile("patients.txt");
                    filehandler.createFile("employees.txt");
                    filehandler.createFile("equipment.txt");
                    filehandler.createFile("medicine.txt");
                    filehandler.createFile("rooms.txt");
                }

                //read patients from an existing bank
                case 2 -> {
                    System.out.println(" |*******************************************| ");
                    System.out.println(" |**** Read and list patient from a file ****| ");
                    System.out.println(" |*******************************************| ");

                    System.out.println("Name of file: ");
                    hospName = userSel.next();

                    hospital = filehandler.readFile(hospName);

                    //print customer names
                   // System.out.println(bank.getCustomers());

                }


                //Add a patient
                case 3 -> {

                    System.out.print("Patient first name: ");
                    String firstName = userSel.next();
                    System.out.print("Patient last name: ");
                    String lastName = userSel.next();

                    //System.out.println(bank.addCustomer(firstName,lastName,SSN));
                    //add both to the object and the file so that you dont need to read the file again or loose if restarting
                    filehandler.writePatientsToFile(hospital,hospName);
                }

                //Remove a patient
                case 4 -> {
                    System.out.print("Patient name: ");
                    String lastName = userSel.next();

                    //System.out.println(hospital.removeCustomer(SSN));
                    filehandler.writePatientsToFile(hospital,hospName);
                }

                //Get a certain customers information
                case 5 -> {
                    System.out.print("Customer SSN: ");
                    long SSN = userSel.nextLong();

                    //System.out.println(bank.getCustomer(SSN));

                }

                //Change patient information
                case 6 -> {
                    System.out.print("Patient first name: ");
                    String firstName = userSel.next();
                    System.out.print("Patient last name: ");
                    String lastName = userSel.next();


                    /*if (hospital.changePatientInformation(firstName, lastName)){
                        System.out.println("Customer name changed");
                        filehandler.writeCustomersToFile(bank, bankName);
                    }
                    else{
                        System.out.println("Customer "+SSN+" does not exist");
                    }*/
                }
                default -> System.out.println("0");
            }
        }



        Employee e1 = new Employee("Rae Gabriel", "Doctor", "Rae1234", 55000,190,"Diabetes");
        Employee e2 = new Employee("Puja Katell", "Doctor", "Puja1234", 57000,195,"Cancer");
        Employee e3 = new Employee("Hardman Svanhild", "Nurse", "Hardman1234", 35000,160,"Blood control");
        Employee e4 = new Employee("Sylvia Sultana", "Nurse", "Sylvia234", 34000,160,"Oxygen control");
        Employee e5 = new Employee("Gulshan Lucette", "Doctor", "Gulshan1234", 68000,180,"Stomach");

        System.out.println("************************");
        System.out.println("Name: "+e1.getEmployeeName());
        System.out.println("Title: "+e1.getEmployeeTitle());
        System.out.println("Password: "+e1.getEmployeePassword());
        System.out.println("Salary: "+e1.getEmployeeSalary());
        System.out.println("Hours: "+e1.getEmployeeWorkedHrs());
        System.out.println("Speciality: "+e1.getEmployeeSpeciality());

        System.out.println("************************");
        System.out.println("Name: "+e2.getEmployeeName());
        System.out.println("Title: "+e2.getEmployeeTitle());
        System.out.println("Password: "+e2.getEmployeePassword());
        System.out.println("Salary: "+e2.getEmployeeSalary());
        System.out.println("Hours: "+e2.getEmployeeWorkedHrs());
        System.out.println("Speciality: "+e2.getEmployeeSpeciality());

        System.out.println("************************");
        System.out.println("Name: "+e3.getEmployeeName());
        System.out.println("Title: "+e3.getEmployeeTitle());
        System.out.println("Password: "+e3.getEmployeePassword());
        System.out.println("Salary: "+e3.getEmployeeSalary());
        System.out.println("Hours: "+e3.getEmployeeWorkedHrs());
        System.out.println("Speciality: "+e3.getEmployeeSpeciality());

        System.out.println("************************");
        System.out.println("Name: "+e4.getEmployeeName());
        System.out.println("Title: "+e4.getEmployeeTitle());
        System.out.println("Password: "+e4.getEmployeePassword());
        System.out.println("Salary: "+e4.getEmployeeSalary());
        System.out.println("Hours: "+e4.getEmployeeWorkedHrs());
        System.out.println("Speciality: "+e4.getEmployeeSpeciality());

        System.out.println("************************");
        System.out.println("Name: "+e5.getEmployeeName());
        System.out.println("Title: "+e5.getEmployeeTitle());
        System.out.println("Password: "+e5.getEmployeePassword());
        System.out.println("Salary: "+e5.getEmployeeSalary());
        System.out.println("Hours: "+e5.getEmployeeWorkedHrs());
        System.out.println("Speciality: "+e5.getEmployeeSpeciality());


        Patient p1 = new Patient("Anna Andersson", 112233445566L,"Diabetes","Something",101);
        Patient p2 = new Patient("Bertil Bernt", 2233442211L,"Breast Cancer (female)","Something",102);
        Patient p3 = new Patient("Cecilia Cysh", 4455667788L,"Depression","Something",103);
        Patient p4 = new Patient("Daniel Dong", 6644999933L,"HIV", "Something", 104);
        Patient p5 = new Patient("Erik Elm", 2255114466L,"Lung Cancer","Something",105);


        System.out.println("*************************");
        System.out.println("PATIENT 1:");
        System.out.println("Name: "+p1.getPatientName());
        System.out.println("SSN: "+p1.getPatientPersonalNo());
        System.out.println("Condition: "+p1.getPatientCondition());
        System.out.println("Medical Issue: "+p1.getPatientMedicalIssue());
        System.out.println("Room: "+p1.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 2:");
        System.out.println("Name: "+p2.getPatientName());
        System.out.println("SSN: "+p2.getPatientPersonalNo());
        System.out.println("Condition: "+p2.getPatientCondition());
        System.out.println("Medical Issue: "+p2.getPatientMedicalIssue());
        System.out.println("Room: "+p2.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 3:");
        System.out.println("Name: "+p3.getPatientName());
        System.out.println("SSN: "+p3.getPatientPersonalNo());
        System.out.println("Condition: "+p3.getPatientCondition());
        System.out.println("Medical Issue: "+p3.getPatientMedicalIssue());
        System.out.println("Room: "+p3.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 4:");
        System.out.println("Name: "+p4.getPatientName());
        System.out.println("SSN: "+p4.getPatientPersonalNo());
        System.out.println("Condition: "+p4.getPatientCondition());
        System.out.println("Medical Issue: "+p4.getPatientMedicalIssue());
        System.out.println("Room: "+p4.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 5:");
        System.out.println("Name: "+p5.getPatientName());
        System.out.println("SSN: "+p5.getPatientPersonalNo());
        System.out.println("Condition: "+p5.getPatientCondition());
        System.out.println("Medical Issue: "+p5.getPatientMedicalIssue());
        System.out.println("Room: "+p5.getPatientRoom());


    }

}
