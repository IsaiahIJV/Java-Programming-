public class ShowStudent
{
   public static void main(String[] args)
   {
   Student Chris = new Student();
   Student Fred = new Student(); 
   
   System.out.println(Chris.getIDNum());
   System.out.println(Chris.getCredHr());
   System.out.println(Chris.getPErnd());
   Chris.calcGPA();
   System.out.println(Chris.getGPA());
   
   Fred.setIDNum(44444);
   Fred.setCredHr(3);
   Fred.setPErnd(12);
   Fred.calcGPA();
   System.out.println(Fred.getIDNum());
   System.out.println(Fred.getCredHr());
   System.out.println(Fred.getPErnd());
   System.out.println(Fred.getGPA());
   }
   }
   
   
   
   