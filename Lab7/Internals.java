package CIE;
import CIE.Student;
import java.util.Scanner;
public class Internals extends Student
{
 protected int marks[]=new int[5];
 public void inputCIEmarks()
 { 
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the marks of each subject");
  for(int i=0;i<5;i++)
  marks[i]=s.nextInt();
 }
}
  