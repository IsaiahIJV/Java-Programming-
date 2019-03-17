import java.util.*;
   public class NauticalMiles
   {
   public static void main(String[] args)
   {  
      double nauticalmiles,miles,kilometers;
     
      final  double NM2KM= 1.852;
      
      final  double NM2Mile= 1.150779;
      
      Scanner inputDevice= new Scanner(System.in);
      
      System.out.print("Please enter nautical miles");
      
      nauticalmiles = inputDevice.nextInt();
      
      miles=NM2Mile*nauticalmiles;
      
      kilometers=NM2KM*nauticalmiles;
      
      
      System.out.println("I/P number is " + nauticalmiles + " Nautical Miles is " + miles + " Miles is " + kilometers + " Kilometers  " );
      }
      }