public class Instructor extends Person {

    public String employeeID;

    public Instructor(){
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public Instructor(String name, String email, String employeeID) {
        super(name, email);
        this.employeeID = employeeID;
    }
    @Override
    public String personDetails() {
        return "EmployeeId=" + getEmployeeID();
    }
}
