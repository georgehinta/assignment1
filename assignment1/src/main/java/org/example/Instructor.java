package org.example;

public class Instructor extends Person {
    //properties
    public String employeeID;
    //empty constructor
    public Instructor(){
    }
    //get employee id function
    public String getEmployeeID() {
        return employeeID;
    }
    //set employee id
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //instructor constructor for employee id
    public Instructor(String name, String email, String employeeID) {
        super(name, email);
        this.employeeID = employeeID;
    }
    @Override
    public String personDetails() {
        return "EmployeeId=" + getEmployeeID();
    }
}