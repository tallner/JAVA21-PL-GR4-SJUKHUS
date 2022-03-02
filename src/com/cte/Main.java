package com.cte;

 
import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        // main takes care of the terminal and runs the application continuous until exit

        Hospital hospital = new Hospital();
        Filehandler filehandler = new Filehandler();

        // creates a mockdata
        Patient p1 = new Patient("Anna Andersson", "Diabetes","Something",101);
        Patient p2 = new Patient("Bertil Bernt","Breast Cancer (female)","Something",102);
        Patient p3 = new Patient("Cecilia Cysh","Depression","Something",103);
        Patient p4 = new Patient("Daniel Dong","HIV", "Something", 104);
        Patient p5 = new Patient("Erik Elm","Lung Cancer","Something",105);
        Employee e1 = new Employee("Rae Gabriel", "Doctor", "Rae1234", 55000,190,"Diabetes");
        Employee e2 = new Employee("Puja Katell", "Doctor", "Puja1234", 57000,195,"Cancer");
        Employee e3 = new Employee("Hardman Svanhild", "Nurse", "Hardman1234", 35000,160,"Blood control");
        Employee e4 = new Employee("Sylvia Sultana", "Nurse", "Sylvia234", 34000,160,"Oxygen control");
        Employee e5 = new Employee("Gulshan Lucette", "Doctor", "Gulshan1234", 68000,180,"Stomach");


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name : ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password : ");
            String password = scanner.nextLine();

            if ("username".equals(userName) && "password".equals(password)) {

                while (true)
                {

                    System.out.println(" User successfully logged-in.. ");
                    System.out.println(" Press 1 if you want to add Patients ");
                    System.out.println(" Press 2 if you want to read Patients ");
                    System.out.println(" Press 3 if you want to access Rooms ");
                    System.out.println(" Press 4 if you want to add Employees ");
                    System.out.println(" Press 5 if you want to read Employees ");

                    String nextStep = scanner.nextLine();
                    if (nextStep.equals("1")) {
                        System.out.println(" Add patients ");
                        //Patient klass
                        hospital.addPatient(p1);
                        hospital.addPatient(p2);
                        hospital.addPatient(p3);
                        hospital.addPatient(p4);
                        hospital.addPatient(p5);
                        filehandler.writePatientsToFile(hospital,"patients.txt");

                    }else if(nextStep.equals("2")) {
                        System.out.println(" Patient list: ");
                        filehandler.readFile("patients.txt");

                    }else if(nextStep.equals("3")) {
                        System.out.println(" Welcome to Rooms ");
                        //Room klass

                    }else if(nextStep.equals("4")) {
                        System.out.println(" Welcome to Employees ");
                        //Employees klass
                        hospital.addEmployee(e1);
                        hospital.addEmployee(e2);
                        hospital.addEmployee(e3);
                        hospital.addEmployee(e4);
                        hospital.addEmployee(e5);
                        filehandler.writeEmployeesToFile(hospital,"employees.txt");

                    }else if(nextStep.equals("5")) {
                        System.out.println(" Employee list: ");
                        filehandler.readFile("employees.txt");

                    }else if(nextStep.equals("6")) {
                        System.out.println(" Book room: ");
                        hospital.addRoomToArray(new ArrayList<>());
                    }
                }


            } else {
                System.out.println(" In valid username and/or password ");
            }
        }




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
