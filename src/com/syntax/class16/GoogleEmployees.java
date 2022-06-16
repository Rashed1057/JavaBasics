package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployees;
    static String companyName="Google";

    void displayEmployeeInfo(){
        System.out.println("Name "+name+" Salary "+salary+" Company name "+companyName);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Abdul";
        emp1.salary=110000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Sameer";
        emp2.noOfEmployees=2;
        emp2.salary=123456;
        emp2.displayEmployeeInfo();

    }
}
