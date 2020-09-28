package com.techelevator;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    public Employee(int employeeId, String firstName, String lastname, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastname;
        this.annualSalary = salary;

    }
    public void raiseSalary(double percent){
        annualSalary = annualSalary * (1.0 + percent / 100);
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }
    public String getFullName(){
        return lastName + ", " + firstName;
    }

}
