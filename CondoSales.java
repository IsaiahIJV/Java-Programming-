import java.util.*;
public class CondoSales
{
public static void main(String[] args)
{
String condotype ="";
String parking ="";
double price =0 ; 

Scanner inputDevice = new Scanner(System.in);

System.out.println(" Enter 1 for a Park view \n " + " Enter 2 for a Golf course view \n " + " Enter 3 for a Lake view ");  

int choice = inputDevice.nextInt();


   if ( choice == 1 )
   {
      price = 150000;
      condotype = "park"; 
   }

   
  else if ( choice == 2 )
   {
      price = 170000;
      condotype = "golf";
   }

  else 
   {
       price = 210000;
       condotype = "lake"; 
   }
      

System.out.println(" Enter 1 for a garage \n " + " If you choose the second option then you get a parking space \n ");

choice = inputDevice.nextInt();

   if ( choice == 1 ) 
   {
      price = price + 5000;
      parking = "garage";
   }
   
   else 
   {
         parking = "parking space";
   } 

System.out.println( " You bought a " + condotype + " view condo with a " + parking + " costing " + price );

              
}
}
   
      
    



   