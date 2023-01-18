public class Student extends Person {
    //Properties
    public String studentId;
    public double grade;

    /**
     * Empty Constructor.
     */
    public Student(){

    }

    /**
     * Student constructor for ID and grade.
     * @param studentId
     * @param grade
     */
    public Student(String name, String email, String studentId, double grade) {
        super(name, email);
        this.studentId = studentId;
        this.grade = grade;
    }
    @Override
    public String personDetails() {
        return "StudentId=" + getStudentId() + " Grade= " + getGrade();
    }
    /**
     * get student id
     * @return string
     */
    public String getStudentId(){
        return studentId;
    }

    /**
     * get student grade
     * @return double
     */
    public double getGrade(){
        return grade;
    }
    //setters
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
