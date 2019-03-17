import java.util.Scanner;
public class Pay
{
public static void main(String[] args)
{
double TotDeduct = 0;
double HRS = 0;
double NetPay=0;
double PayRate;
double TOTPay;
double OTPay;
double RETICost;
double GrossPay; 
double REGPay=0; 

System.out.println( " Enter your Skill level as 1 , 2 or 3 " );

Scanner inputDevice= new Scanner(System.in);

int choice = inputDevice.nextInt();

if (choice == 1)
{
   PayRate = 17.00;
}
   
else if(choice == 2)
{
   PayRate = 20.00;
}

else
{
   PayRate = 22.00;
}

System.out.println(" Please enter number of hours");

HRS = inputDevice.nextInt();

if (HRS <= 40)

{
TOTPay = HRS * PayRate;
REGPay = TOTPay;
OTPay=0;
}

else 
{
REGPay = 40*PayRate;
OTPay = (HRS - 40) * 1.5 * PayRate;
TOTPay = 40 * PayRate + OTPay; 
}
NetPay=TOTPay;

if ( choice == 2 || choice == 3 )
{

System.out.println( " Enter option for insurance 1 , 2 , or 3 " );

int ins = inputDevice.nextInt();

if (ins == 1)
{
   TOTPay = TOTPay - 32.50;
   TotDeduct = TotDeduct + 32.50;
}

else if (ins == 2)
{
   TOTPay = TOTPay - 20.00;
   TotDeduct = TotDeduct + 20.00;
}

else 
{
   TOTPay = TOTPay - 10.00;
   TotDeduct = TotDeduct + 10.00;
}
} // closes 2 or 3
if(choice == 3)
{
System.out.println( " Do you want to participate in retirement plan , if yes then input 1 " );

int Retirement = inputDevice.nextInt();

if (Retirement == 1)
{   
   RETICost = NetPay * .03;
   TOTPay = TOTPay - RETICost;
   TotDeduct = TotDeduct + RETICost;
}
}//closes off retire
System.out.println(" You Worked " + HRS );
System.out.println(" Your Regular pay is " + REGPay );
System.out.println(" Your Overtime " + OTPay );
System.out.println(" Your GrossPay " + TOTPay );
System.out.println(" Your NetPay " + NetPay );
System.out.println(" Your Deduction " + TotDeduct);

if (TotDeduct > TOTPay)
System.out.println("You deducted more than you made");

}
}






             
   








