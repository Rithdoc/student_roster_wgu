import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shaun on 2/2/2017.
 */
public class Roster
{
    private static ArrayList<Student> studentList;

    public Roster() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student nextStudent)
    {
        studentList.add(nextStudent);
    }

    //TODO: I will program this remove to remove all students it finds whose studentID matches the one given
    public static void remove(String studentID)
    {
        boolean removed = false;
        Integer studentIDInt = Integer.parseInt(studentID);
        for (int i = 0; i < studentList.size(); i++)
        {
            if (studentList.get(i).getStudentID() == studentIDInt)
            {
                studentList.remove(i);
                removed = true;
            }
        }
        if (!removed)
        {
            System.out.println("ERROR: No student with that student number is found in the database");
        }
    }

    public static void print_all()
    {
        for (int i = 0; i < studentList.size(); i++)
        {
            System.out.println(studentList.get(i).print());
        }
    }

    public static Integer getRosterSize()
    {
        return studentList.size();
    }

    //TODO: needs similar treatment as the remove function - search though and print
    public static void print_average_grade(String studentID)
    {
        boolean studentFound = false;
        Integer studentIDInt = Integer.parseInt(studentID);
        for (int i = 0; i < studentList.size(); i++)
        {
            if (studentList.get(i).getStudentID() == studentIDInt)
            {
                ArrayList<Integer> gradesList = studentList.get(studentIDInt).getGrades();
                int totalGradeValue = 0;
                int numberOfGrades = 0;
                for (int j = 0; j < gradesList.size(); j++) {
                    totalGradeValue += gradesList.get(j);
                    numberOfGrades += 1;
                }
                System.out.println(totalGradeValue / numberOfGrades);
                studentFound = true;
            }
        }
        if (!studentFound)
        {
            System.out.println("ERROR: No student with that student number is found in the database");
        }
        //TODO: more elegant solution than this needed, but it works for now.  subtract 1 from the given student
        // number == index of that student in the ArrayList.
//        Integer studentIndex = Integer.parseInt(studentID);
//
//        if (studentIndex >= 0) {
//            ArrayList<Integer> gradesList = studentList.get(studentIndex).getGrades();
//            int totalGradeValue = 0;
//            int numberOfGrades = 0;
//            for (int i = 0; i < gradesList.size(); i++) {
//                totalGradeValue += gradesList.get(i);
//                numberOfGrades += 1;
//            }
//            System.out.println(totalGradeValue / numberOfGrades);
//        }
//        else
//        {
//            System.out.println("Invalid student");
//        }
    }

    //TODO: If I understand correctly, I only need to validate email addresses for this function, the actual Roster
    // and Student Objects do not care if the email addresses are valid or not.
    public static void print_invalid_emails()
    {
        String myRegexString = "\\w*.*\\w*@\\w*.\\w*";
        Pattern myPattern = Pattern.compile(myRegexString);

        for (int i = 0; i < studentList.size(); i++)
        {
            //TODO: should print invalid emails in the database, not the valid ones!
            String currentEmail = studentList.get(i).getEmailAddress();
            Matcher myMatcher = myPattern.matcher(currentEmail);
            if (!myMatcher.matches())
            {
                System.out.println(currentEmail);
            }
            //TODO: Should an invalid email offer some output here?
        }
    }
}
