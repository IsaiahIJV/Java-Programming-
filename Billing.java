public class Billing
{
   public static void main(String[] args)
   {
      int Quantity = 10;
      double Price = 10;
      double Coupon = .10;
      
      
      
      double Total = computeBill( Price );
      System.out.println( " Total for one = " + Total );
      
      Total = computeBill( Price , Quantity );
      System.out.println( " Total for two = " + Total ) ;
      
      Total = computeBill( Price , Quantity , Coupon);
      System.out.println( " Total for three = " + Total ) ;
      }
      public static double computeBill( double Price )
      {
       
        double Total = Price + Price * 0.08;
         return Total;
      }
      
      public static double computeBill( double Price , int Quantity )
      {
         double Total = Price * Quantity; 
         Total = Total + Total  * 0.08;
         return Total;
      }
      
      public static double computeBill( double Price , int Quantity, double Coupon ) 
      {
         double Total = Price * Quantity; 
         Total = Total - Coupon * Total;
         Total = Total + Total  * 0.08;
         return Total;
      }
      } 
         
         
      
      
      
      
      
      
      
      
      
      
      