import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Shaun on 2/1/2017.
 */
public class main {

    public static void main(String[] args)
    {
        Roster myRoster = new Roster();

        //System.out.println("Hello, World!");

        //System.out.println(args[0]);

        File myFile = new File(args[0]);
        Scanner myScanner;
        try {
            myScanner = new Scanner(myFile);
            while(myScanner.hasNext())
            {
                //Student nextStudent;
                String nextEntry = myScanner.nextLine();
                //System.out.println(nextEntry);
                //nextEntry now has the next piece of information for a new student.
                //Because there are six piece of information per student, we'll implement a 6 step for-loop here
                //it's not the most elegant way to solve that - ideally, I'd
                Integer nextID;
                String nextFirstName;
                String nextLastName;
                String nextEmailAddress;
                Integer nextAge;
                String nextGrades;
                Scanner entryScanner = new Scanner(nextEntry);
                while(entryScanner.hasNext())
                {
                    nextID = entryScanner.nextInt();
                    nextFirstName = entryScanner.next();
                    nextLastName = entryScanner.next();
                    nextEmailAddress = entryScanner.next();
                    nextAge = entryScanner.nextInt();
                    nextGrades = entryScanner.next();
                    //now parse the grades list into an ArrayList of Integers
                    ArrayList<Integer> nextGradesList = new ArrayList<Integer>();
                    String[] nextGradesArray = nextGrades.split(",");
                    //System.out.println(nextGradesArray);
                    for(int i = 0; i < nextGradesArray.length; i++)
                    {
                        //System.out.println(nextGradesArray[i]);
                        nextGradesList.add(Integer.parseInt(nextGradesArray[i]));
                    }
                    //System.out.println(nextGradesList);
//                    Scanner gradeScanner = new Scanner(nextGrades);
//                    while(gradeScanner.hasNextInt())
//                    {
//                        //System.out.println("Here we go!");
//                        System.out.println(gradeScanner.nextInt());
//                    }
                    Student newStudent = new Student(nextID, nextFirstName, nextLastName, nextEmailAddress, nextAge, nextGradesList);
                    myRoster.addStudent(newStudent);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        myRoster.print_all();
//        myRoster.print_average_grade(4);
//        myRoster.print_invalid_emails();
//
//        for (int i = 0; i < myRoster.getRosterSize(); i++)
//        {
//            myRoster.print_average_grade(i);
//        }
//
//        myRoster.remove("1");
//        myRoster.remove("10");
//
//        myRoster.print_all();

        //These are the requested functions in the assignment's parameters
        myRoster.print_all();
        myRoster.print_invalid_emails();
        for (int i = 0; i < myRoster.getRosterSize(); i++)
        {
            myRoster.print_average_grade(Integer.toString(i));
        }
        myRoster.remove("3");
        myRoster.remove("3");



    }
}
