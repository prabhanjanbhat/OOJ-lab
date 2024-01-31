import SEE.Externals;
class Main 
{
 public static void main(String args[])
 {
  int numOfStudents = 2;
  Externals finalMarks[] = new
  Externals[numOfStudents];
  for(int i=0;i<numOfStudents;i++)
  {
   finalMarks[i] = new Externals();
   finalMarks[i].inputStudentDetails();
   System.out.println("Enter CIE marks");
   finalMarks[i].inputCIEmarks();
   System.out.println("Enter SEE marks");
   finalMarks[i].inputSEEmarks();
  }
  System.out.println("Displaying data:\n");
  for(int i=0;i<numOfStudents;i++)
  {
   finalMarks[i].calculateFinalMarks();
   finalMarks[i].displayFinalMarks();
  } 
 } 
}