import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class


public class Main {

    public static void main(String[] args) {
        Person paul = new Student("Paul Hinta", "paul_hinta@mcgill.ca", "PaulHinta56", 100);
        //System.out.println(paul.getStudentId()+ " " + paul.getGrade());
        Person victor = new Instructor("Victor Nuke", "victor_nuke@sfu.ca", "VictorNuke420");
        //System.out.println(victor.getEmployeeID());
        //add two more students and instructors
        //txt file is created, write to file, sb.toString, comments for code, properties of classes, constructors, getters and setters
        List<Person> personList = new ArrayList<>();
        personList.add(paul);
        personList.add(victor);

        StringBuilder sb = new StringBuilder();

        for(Person p : personList) {
            sb.append(p.toString() + " " + p.personDetails()).append("\n");

        }

        System.out.println(sb.toString());

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(sb.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        /*

        List<Object> objList = new ArrayList<>();
        objList.add(paul);
        objList.add(victor);

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();

        for(Object obj : objList) {

            if(obj.getClass() == Person.class) {
                Person person = (Person) obj;
                sb.append(person.getEmail()).append(",").append(person.getName()).append(",");
                System.out.println(person.getEmail());
                System.out.println(person.getName());
            }

            // check if
            if (obj.getClass() == Student.class) {
                Student student = (Student) obj;
                sb.append(student.getStudentId()).append(",").append(student.getGrade()).append(",");
                System.out.println(student.getStudentId());
                System.out.println(student.getGrade());
            }

            sb.append("\n");
        }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
      */
    }


}