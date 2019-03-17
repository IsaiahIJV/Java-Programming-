public class studentVec{
public static void main (String [] args)
{
   static int studentTot = 0;
   String firstName, lastName;
   double GPIndex = 0.0;
   
   public String getFirst()
   {
      return firstName;
   }
   public String getLast()
   {
      return lastName;
   }
   public Double getgpIndex()
   {
      return GPIndex;
   }
   public studentVec(String first, String last)
   {
      firstName = first;
      lastName = last;
      studentTot++;
   }
   public studentVec(String first, String last, double GPI)
   {
      firstName = first;
      lastName = last;
      GPIndex = GPI;
      studentTot++;
   }
}