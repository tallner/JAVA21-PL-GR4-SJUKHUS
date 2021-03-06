package com.cte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();
//    private room

    public Hospital() {
    }

    //adds a patient to the list
    public void addPatient(Patient patient){
        patients.add(patient);
    }

    //get list of patients
    public List<Patient> getPatientList() {
        return patients;
    }

    //adds an employee to the list
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    //get list of employees
    public List<Employee> getEmployeeList() {
        return employees;
    }

//    method bookroom
    public void addRoomToArray(Room room) {
         rooms.add(room);
    }

    //get list of patients
    public List<Room> getRooms() {
        return rooms;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                ", patients=" + patients +
                 ", employees=" + employees +
                 ", rooms=" + rooms +
                '}';
    }
}
