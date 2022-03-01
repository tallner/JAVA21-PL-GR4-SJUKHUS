package com.cte;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    //CONSTRUCTOR @CT:sorry SSN ryker
    public Patient(String Name,String Condtion,String medicalIssue, int Room){
        patientName = Name;
        patientCondition = Condtion;
        patientMedicalIssue = medicalIssue;
        patientRoom = Room;
    }

    //STATE @ct:always use private for the fields
    private String patientName;
    private long patientPersonalNo;
    private String patientCondition;
    private String patientMedicalIssue;
    private int patientRoom;






    //BEHAVIOUR
    public String getPatientName() {
        return patientName;
    }
    public long getPatientPersonalNo() {
        return patientPersonalNo;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void setPatientPersonalNo(long patientPersonalNo) {
        this.patientPersonalNo = patientPersonalNo;
    }
    public String getPatientCondition() {
        return patientCondition;
    }
    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }
    public String getPatientMedicalIssue() {
        return patientMedicalIssue;
    }
    public void setPatientMedicalIssue(String patientMedicalIssue) {
        this.patientMedicalIssue = patientMedicalIssue;
    }
    public int getPatientRoom() {
        return patientRoom;
    }
    public void setPatientRoom(int patientRoom) {
        this.patientRoom = patientRoom;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientPersonalNo=" + patientPersonalNo +
                ", patientCondition='" + patientCondition + '\'' +
                ", patientMedicalIssue='" + patientMedicalIssue + '\'' +
                ", patientRoom=" + patientRoom +
                '}';
    }
}