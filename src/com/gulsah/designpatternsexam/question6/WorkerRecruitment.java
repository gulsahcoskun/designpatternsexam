package com.gulsah.designpatternsexam.question6;

/**
 * Created by GulsahCoskun on 3.05.2018.
 */
public class WorkerRecruitment extends EmployeeRecruitment{

    @Override
    protected void checkMedicalReports() {
        documents.add("General Medical Record is added");
        documents.add("Lung Health Record is added");
    }

    @Override
    protected void checkDiploma() {
        documents.add("Highschool diploma is added");
    }
}
