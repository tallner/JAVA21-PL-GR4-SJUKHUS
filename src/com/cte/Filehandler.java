package com.cte;

import java.io.*;
import java.util.Scanner;

public class Filehandler {
    private File myObj;
    private final String basePath = "./_hospitalFiles/";

    public Filehandler() {
    }

    public void listFiles(){
        try {

            // create new file
            myObj = new File(basePath);

            // array of files and directory
            String[] paths = myObj.list();


            // for each name in the path array
            for(String path: paths) {

                // prints filename and directory name
                System.out.println(path);
            }

        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }

    public void createFile(String filename) {
        try {
            myObj = new File(basePath+filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writePatientsToFile(Hospital hospital, String filename){
        try {
            FileWriter myWriter = new FileWriter(basePath+filename,false);

            for (int i = 0; i < hospital.getPatientList().size() ; i++) {
                myWriter.write(hospital.getPatientList().get(i) + System.lineSeparator());
            }
            myWriter.close();
            System.out.println("Successfully printed the patients.");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public void writeEmployeesToFile(Hospital hospital, String filename){
        try {
            FileWriter myWriter = new FileWriter(basePath+filename,false);

            for (int i = 0; i < hospital.getEmployeeList().size() ; i++) {
                myWriter.write(hospital.getEmployeeList().get(i) + System.lineSeparator());
            }
            myWriter.close();
            System.out.println("Successfully printed the employees.");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }


    public void writeRoomBookingToFile(Hospital hospital, String filename){
        try {
            FileWriter myWriter = new FileWriter(basePath+filename,false);

            for (int i = 0; i < hospital.getRooms().size() ; i++) {
                myWriter.write(hospital.getRooms().get(i) + System.lineSeparator());
            }
            myWriter.close();
            System.out.println("Successfully printed the employees.");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }


    public void readFile(String filename) {
        try {
            myObj = new File(basePath+filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                System.out.println(myReader.nextLine());
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }



}