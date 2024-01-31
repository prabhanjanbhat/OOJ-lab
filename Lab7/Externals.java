package SEE;
import CIE.Internals;
import java.util.Scanner;
public class Externals extends Internals 
{
 protected int marks[];
 protected int finalMarks[];
 public Externals() 
 {
  marks = new int[5]; 
  finalMarks = new int[5]; 
 }
 public void inputSEEmarks() 
 {
  Scanner s = new Scanner(System.in);
  for(int i=0;i<5;i++) 
  {
   System.out.print("Subject "+(i+1)+" marks: ");
   marks[i] = s.nextInt(); 
  } 
 }
 public void calculateFinalMarks() 
 {
  for(int i=0;i<5;i++)
  finalMarks[i] = marks[i]/2 + super.marks[i];
 }
 public void displayFinalMarks() 
 { 
  displayStudentDetails();
  for(int i=0;i<5;i++)
  System.out.println("Subject " + (i+1) + ": " + finalMarks[i]);
 }
}