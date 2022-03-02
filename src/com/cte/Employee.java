package com.cte;

public class Employee {

    //CONSTRUCTOR
    public Employee(String Name, String Title, String Password, long Salary, long WorkedHrs, String Speciality ){
        employeeName = Name;
        employeeTitle = Title;
        employeePassword = Password;
        employeeSalary = Salary;
        employeeWorkedHrs = WorkedHrs;
        employeeSpeciality = Speciality;
    }

    //STATE
    private String employeeName;
    private String employeeTitle;
    private String employeePassword;
    private long employeeSalary;
    private long employeeWorkedHrs;
    private String employeeSpeciality;


    //BEHAVIOUR

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public long getEmployeeWorkedHrs() {
        return employeeWorkedHrs;
    }

    public void setEmployeeWorkedHrs(long employeeWorkedHrs) {
        this.employeeWorkedHrs = employeeWorkedHrs;
    }

    public String getEmployeeSpeciality() {
        return employeeSpeciality;
    }

    public void setEmployeeSpeciality(String employeeSpeciality) {
        this.employeeSpeciality = employeeSpeciality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeTitle='" + employeeTitle + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeWorkedHrs=" + employeeWorkedHrs +
                ", employeeSpeciality='" + employeeSpeciality + '\'' +
                '}';
    }
}
