import java.util.Scanner;
public class MetricConversion
{
   public static void main (String[] args)
   {
      int number1;
      
      Scanner inputDevice = new Scanner(System.in);
      
      System.out.print("Please enter a number ");
      
      number1 = inputDevice.nextInt();
      
      
      Inch2cm(number1);
      Gall2Liter(number1);
      }
      
      public static void Inch2cm(int inch)
      {
      System.out.println("I/P number is " + inch + " This many inches is " + (inch/2.54));
      }
      public static void Gall2Liter(int liter)
      {
      System.out.println("I/P number is " + liter + " This many gallons is " + (liter/3.7854));
      }
      }
      