public class employeeVec
{
   static int employeeTotal = 0;
   String firstName; 
   String lastName;
   double salary = 11.0;
   
   public String getFirst()
   {
      return firstName;
   }
   public String getLast()
   {
      return lastName;
   }   
   public double getSalary()
   {
      return salary;
   } 
   public employeeVec(String first, String last)
   {
      firstName = first;
      lastName = last;
      employeeTotal ++;
   }
   public employeeVec(String first, String last, double sal)
   {
      firstName = first;
      lastName = last;
      salary = sal;
      employeeTotal ++;
   }
}