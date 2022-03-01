package com.cte;

public class Main {

    public static void main(String[] args) {


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

    }
}
