import java.util.Scanner;
public class MinutesConversion
{
   public static void main(String[] args)
   {
      int minutes;
      
      double hours,days;
      
      Scanner inputDevice= new Scanner(System.in);
      
      System.out.print("Please enter a number of minutes");
      
      minutes=inputDevice.nextInt();
      
      hours= minutes/60.;
      
      days= hours/24;
      
      System.out.println(" I/P number is " + minutes + " Minutes is " + hours + " hours is " + days + " days " );
      }
      } 
      
