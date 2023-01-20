package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String ... args) {

        // build the person list with default values
        List<Person> personList = buildDefaultPersonList();

        // iterate thru the list and extract the students and instructors
        String personListParsed = buildPersonString(personList);

        // Bonus: using Gson, and industry standard, to jsonify the data (creates Gson object)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // pass in the person list to get the json data
        String json = gson.toJson(personList);

        System.out.println(json);

        // write the parsed data as well as the json to the file
        writePersonDataToFile(personListParsed, json);

    }
    /** this will write to a file with person data
     * @param parsedPersonList
     * @param json
     */
    public static void writePersonDataToFile(String parsedPersonList, String json) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(parsedPersonList);
            myWriter.write("\n");
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    /** build Person String
     * @param personList
     * @return string of person data
     */
    public static String buildPersonString(List<Person> personList) {
        StringBuilder sb = new StringBuilder();
        // edge case checks
        if(personList != null && personList.size() > 0)
            // iterate thru the list
            for (Person p : personList)
                // append data to the string builder
                sb.append(p.toString() + " " + p.personDetails() + "\n");
        // return the parsed data
        return sb.toString();
    }

    /**
     * build Default Person List
     * @return list of person's
     */
    public static List<Person> buildDefaultPersonList() {
        List<Person> personList = new ArrayList<Person>();

        Person s1 = new Student("Paul Hinta", "paul_hinta@mcgill.ca", "PaulHinta56", 100);
        Person i2 = new Instructor("Victor Nuke", "victor_nuke@sfu.ca", "VictorNuke420");

        personList.add(s1);
        personList.add(i2);

        return personList;
    }
/**
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

        for (Person p : personList) {
            sb.append(p.toString() + " " + p.personDetails()).append("\n");

        }

        Gson gson = new Gson();

        String json = gson.toJson(personList);

        System.out.println(json);

        System.out.println(sb.toString());

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(sb.toString());
            myWriter.write("\n");
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }*/
}