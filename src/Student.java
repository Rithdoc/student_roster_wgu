import java.util.ArrayList;

/**
 * Created by Shaun on 2/2/2017.
 */
public class Student
{
    private int studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private ArrayList<Integer> grades;

    public Student(int studentID, String firstName, String lastName, String emailAddress, int age,
                   ArrayList<Integer> grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades = grades;
    }

    //TODO: Generated function doesn't use getters, isn't formatted for use in Roster[1]
    public String print() {
//        return "Student{" +
//                "studentID=" + this.getStudentID() +
//                ", firstName='" + this.getFirstName() + '\'' +
//                ", lastName='" + this.getLastName() + '\'' +
//                ", emailAddress='" + this.getEmailAddress() + '\'' +
//                ", age=" + this.getAge() +
//                ", grades=" + this.getGrades() +
//                '}';
        return this.getStudentID() +
                "\t" + this.getFirstName() +
                "\t" + this.getLastName() +
                "\t" + this.getEmailAddress() +
                "\t" + this.getAge() +
                "\t" + this.getGrades();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
