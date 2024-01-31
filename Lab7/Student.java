package CIE;
import java.util.Scanner;
public class Student
 {
protected String usn = new String(); 
protected String name = new String(); 
protected int sem;
public void inputStudentDetails()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the usn");
 usn=s.nextLine();
 System.out.println("Enter the student name");
 name=s.nextLine();
 System.out.println("Enter the semester");
 sem=s.nextInt();
}
public void displayStudentDetails()
{
 System.out.println("Usn = "+usn);
 System.out.println("Student name = "+name);
 System.out.println("Semester = "+sem);
}
}