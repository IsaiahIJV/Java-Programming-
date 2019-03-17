public class reverse {
public static void main (String [] args)
   {
   String RevMe = "D,C,B,A";
   String Revd = "";
   
   for (int i = RevMe.length()-1; i>=0; i--)
   {
   char temp =  RevMe.charAt(i);
   Revd = Revd + temp;
   }
   System.out.println("Reverse of " + RevMe + " is " + Revd);
}
}
