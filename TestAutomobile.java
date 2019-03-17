public class TestAutomobile
{
public static void main(String[] args)
   {
   Automobile MyCarl = new Automobile("White",10000,"Civic",2018,65); 
   MyCarl.Display();
   MyCarl.setColor("Blue");
   MyCarl.setIDNumber(-5);
   MyCarl.setModel("Civic");
   MyCarl.setYear(1996);
   MyCarl.setMPgallon(5);
  

   Automobile MyVert = new Automobile("Yellow",7,"Civic",2001,11); 
   MyVert.Display();
   MyVert.setColor("Red");
   MyVert.setIDNumber(10000);
   MyVert.setModel("Civic");
   MyVert.setYear(2020);
   MyVert.setMPgallon(70);
   }
   }