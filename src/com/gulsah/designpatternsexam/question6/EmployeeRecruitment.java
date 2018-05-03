package com.gulsah.designpatternsexam.question6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GulsahCoskun on 3.05.2018.
 */
public abstract class EmployeeRecruitment {

    protected List<String> documents = new ArrayList<>();

    final void hireEmployee(){
        checkMedicalReports();
        checkCriminalRecord();
        checkResidence();
        checkDiploma();
        saveDocuments();
        insuranceRegister();
        initializeEmployeeRights();
    }

    protected abstract void checkMedicalReports();

    protected abstract void checkDiploma();

    private void checkCriminalRecord() {
        documents.add("Criminal record is added!");
    }

    private void checkResidence() {
        documents.add("Residence Paper is added!");
    }

    private void saveDocuments() {
        for(String document : documents){
            System.out.println(document);
        }
        System.out.println("All documents are collected.");
    }

    private void insuranceRegister() {
        System.out.println("Employee is registered to insurance.");
    }

    private void initializeEmployeeRights() {
        System.out.println("All rights are assigned to employee.");
    }


}
