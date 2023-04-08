import java.io.FileWriter;
import java.util.*;
import java.io.IOException;

abstract class Person{
    public String name;
    public String emailAddress;
    public void setName(String Name){this.name = Name;}
    public void setEmail(String email){this.emailAddress = email;}
    public String getName() {return this.name;}
    public String getEmail(){return this.emailAddress;}
    public abstract String print();
}

class Instructor extends Person{
    public String employeeIDs;
    public void setDetails(String ID, String Name, String email){
        this.name = Name;
        this.employeeIDs = ID;
        this.emailAddress = email;
    }
    public String getID() {return this.employeeIDs;}
    public String print(){return "\nType: Instructor\n" + "Name: " + this.getName() + "\n" + "Email: " + this.getEmail() + "\n"+ "Employee ID: " + this.getID() + "\n";}
}

class Student extends Person{
    public String studentIDs;
    public String grade;
    public void setDetails(String ID, String Name, String email, String Grade){
        this.name = Name;
        this.studentIDs = ID;
        this.emailAddress = email;
        this.grade = Grade;
    }
    public String getID() {return this.studentIDs;}
    public String getGrade() {return this.grade;}
    public String print(){return "\nType: Student\n" + "Name: " + this.getName() + "\n" + "Email: " + this.getEmail() + "\n"+ "Student ID: " + this.getID() + "\n" + "Grade: " + this.getGrade() + "\n";}
}

class mainCLS{
    public static void main(String[] args){
        
        List<Person> list = new ArrayList<Person>();
        Student student1 = new Student();
        Student student2 = new Student();
        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor();
        student1.setDetails("301447481", "Hogan", "hogan@gmail", "A");
        student2.setDetails("301447482", "Alex", "Alex@gmail", "B");
        instructor1.setDetails("204869711", "Mary", "Mary@gmail");
        instructor2.setDetails("204869712", "Ken", "ken@gmail");
        
        list.add(student1);
        list.add(instructor1);
        list.add(student2);
        list.add(instructor2);
        for(int i = 0 ; i < list.size(); i++){list.get(i).print();}
        try{
            FileWriter fw = new FileWriter("output.txt");
            for(int i = 0; i<list.size(); i++){fw.write(list.get(i).print());}
            fw.close();
        }
        catch (Exception e){e.getStackTrace();}
    }
}