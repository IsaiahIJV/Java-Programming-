import java.util.Scanner;
public class NumbersDemo
{
   public static void main(String[] args)
   {
      int number1,number2;
      
      Scanner inputDevice = new Scanner(System. in);
      
      System.out.print("Please input first number ");
      
      number1 = inputDevice.nextInt();
      
      System.out.print("Please input second number ");
      
      number2 = inputDevice.nextInt();
      
      displayPlus5(number1);
      displayTwiceTheNumber(number1);
      displayNumberSquared(number1);
      
      displayPlus5(number2);
      displayTwiceTheNumber(number2);
      displayNumberSquared(number2);
      }       
      
   public static void displayPlus5(int Num)
   {
   System.out.println("Number is " + Num + " plus 5 is " + (Num+5));
   }
   public static void displayTwiceTheNumber(int Num)
   {
   System.out.println("Number is " + Num + " multiplied by 2 is " + 2*Num);   
   }
   public static void displayNumberSquared(int Num)
   {
   System.out.println("Number is " + Num + " being squared is " + Num*Num);
   }
   }  