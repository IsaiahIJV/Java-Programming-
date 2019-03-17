public class numOccur {
public static void main (String []args)
   {
   String searchme = "Bob,Jim,Dale,Jim,Bob,Bill,Sam,Jim";
   String searchfor = "Bob";
   int numoccur=0;
   
   int foundat = searchme.indexOf(searchfor, 0);
   if (foundat == -1) //not found
   {
   System.out.println("Could not find: " + searchfor + " in " + searchme);
   System.exit(0);
   }
   //found it 
   numoccur++;
 do
   {
     foundat = searchme.indexOf(searchfor, foundat + 1);
     if (foundat != -1)
     {
     numoccur++;
     foundat = foundat + 1;
     }
    } while (foundat !=-1);
  System.out.println("Found Bob " + numoccur + " times");
  }
  }