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
        Room r1 = new Room("Ann-Marie",45);
        Room r2 = new Room("Johan",15);
        Room r3 = new Room("Anders",10);
        Room r4 = new Room("Matilda",9);

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
                        hospital.addRoomToArray(r1);
                        hospital.addRoomToArray(r2);
                        hospital.addRoomToArray(r3);
                        hospital.addRoomToArray(r4);

                        System.out.println(hospital.getRooms());



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

                    }
                }
                
            } else {
                System.out.println(" In valid username and/or password ");
            }
        }
    }

}
