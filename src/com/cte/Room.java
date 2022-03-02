package com.cte;

public class Room {
    public Room(String Name, int RoomNr){
        patientName = Name;
        patientRoom = RoomNr;
    }

    //STATE @ct:always use private for the fields
    private String patientName;
    private int patientRoom;











/*
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
    public int getPatientRoom() {
        return patientRoom;
    }
    public void setPatientRoom(int patientRoom) {
        this.patientRoom = patientRoom;
    }*/

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientRoom=" + patientRoom +
                '}';
    }




}
