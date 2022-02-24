package com.cte;

import java.util.Scanner;

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
    }
}
