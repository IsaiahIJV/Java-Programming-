import java.util.*;
public class Student {


  private int studentID;

  private int credits;

  private int points;

  private double gpa;

  
public void setID(int ID)
{
    studentID = ID;
}

public int getID()

{
   return studentID;
}

public void setCredits(int credit)

{
    credits = credit;
}

public int getCredits()

{
   return credits;
}

public void setPoints(int point)

{
   points = point;
}

public double getPoints()

{
   return points;
}

public void calculateGPA()

{
   gpa = points/credits;
   return ;
}

public Student()
{

  studentID = 9999;
  points = 12;
  credits = 3;
}

public void display()
{

  System.out.println("The student ID is: " + studentID);

  System.out.println("The number of credits is: " + credits);

  System.out.println("The number of points is: " + points);

  System.out.println("The GPA is: " + gpa);
}


}