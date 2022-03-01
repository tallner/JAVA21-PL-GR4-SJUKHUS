package com.cte;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Patient p1 = new Patient("Anna Andersson", 112233445566L,"Diabetes","Something",101);
        Patient p2 = new Patient("Bertil Bernt", 2233442211L,"Breast Cancer (female)","Something",102);
        Patient p3 = new Patient("Cecilia Cysh", 4455667788L,"Depression","Something",103);
        Patient p4 = new Patient("Daniel Dong", 6644999933L,"HIV", "Something", 104);
        Patient p5 = new Patient("Erik Elm", 2255114466L,"Lung Cancer","Something",105);


        System.out.println("*************************");
        System.out.println("PATIENT 1:");
        System.out.println("Name: "+p1.getPatientName());
        System.out.println("SSN: "+p1.getPatientPersonalNo());
        System.out.println("Condition: "+p1.getPatientCondition());
        System.out.println("Medical Issue: "+p1.getPatientMedicalIssue());
        System.out.println("Room: "+p1.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 2:");
        System.out.println("Name: "+p2.getPatientName());
        System.out.println("SSN: "+p2.getPatientPersonalNo());
        System.out.println("Condition: "+p2.getPatientCondition());
        System.out.println("Medical Issue: "+p2.getPatientMedicalIssue());
        System.out.println("Room: "+p2.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 3:");
        System.out.println("Name: "+p3.getPatientName());
        System.out.println("SSN: "+p3.getPatientPersonalNo());
        System.out.println("Condition: "+p3.getPatientCondition());
        System.out.println("Medical Issue: "+p3.getPatientMedicalIssue());
        System.out.println("Room: "+p3.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 4:");
        System.out.println("Name: "+p4.getPatientName());
        System.out.println("SSN: "+p4.getPatientPersonalNo());
        System.out.println("Condition: "+p4.getPatientCondition());
        System.out.println("Medical Issue: "+p4.getPatientMedicalIssue());
        System.out.println("Room: "+p4.getPatientRoom());
        System.out.println("*************************");
        System.out.println("PATIENT 5:");
        System.out.println("Name: "+p5.getPatientName());
        System.out.println("SSN: "+p5.getPatientPersonalNo());
        System.out.println("Condition: "+p5.getPatientCondition());
        System.out.println("Medical Issue: "+p5.getPatientMedicalIssue());
        System.out.println("Room: "+p5.getPatientRoom());

    }

}
