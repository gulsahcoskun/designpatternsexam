package com.gulsah.designpatternsexam.question6;

/**
 * Created by GulsahCoskun on 3.05.2018.
 */
public class HROperationTest {

    public static void main(String[] args) {
        EmployeeRecruitment engineer = new EngineerRecruitment();
        System.out.println("----Enginer Recruitment----");
        engineer.hireEmployee();
        System.out.println();

        EmployeeRecruitment laborer = new WorkerRecruitment();
        System.out.println("----Worker Recruitment----");
        laborer.hireEmployee();
    }
}
