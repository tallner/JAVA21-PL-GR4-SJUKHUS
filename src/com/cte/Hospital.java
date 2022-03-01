package com.cte;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

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


    @Override
    public String toString() {
        return "Hospital{" +
                ", patients=" + patients +
                 ", employees=" + employees +
                '}';
    }
}
