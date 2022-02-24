package com.cte;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    //CONSTRUCTOR
    public Patient(String Name, Long SSN,String Condtion,String medicalIssue, int Room){
        patientName = Name;
        patientPersonalNo = SSN;
        patientCondition = Condtion;
        patientMedicalIssue = medicalIssue;
        patientRoom = Room;


    }

    //STATE
    public String patientName;
    public long patientPersonalNo;
    public String patientCondition;
    public String patientMedicalIssue;
    public int patientRoom;






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
}