public class TestReal {
public static void main (String [] args)
 {
   Real lr1 = new Real(3,14);
   Real lr2 = new Real(2,0);
   //double x = cnvt2Double(lr);
   //System.out.println("X = " + x);
   //Real lr= cnvt2Real(3.14);
    Real lr = add( lr1,  lr2);
    System.out.println("Left " + lr.getLeft()+ " Right " + lr.getRight());
    lr = multiply(lr1, lr2);
    System.out.println("Left " + lr.getLeft()+ " Right " + lr.getRight());
    lr = subtract(lr1,lr2);
    System.out.println("Left " + lr.getLeft()+ " Right " + lr.getRight());
 }
 public static double cnvt2Double (Real lr){
 int Left = lr.getLeft();
 int Right = lr.getRight();
 String num = Left + "." + Right;
 double Result = Double.parseDouble(num);
 return Result;
 }
 public static Real cnvt2Real (double x){
 String temp =Double.toString (x);
 int dppos = temp.indexOf(".");
 String l = temp.substring(0,dppos);
 String r = temp.substring (dppos+1,temp.length());
 int left = Integer.parseInt(l);
 int right = Integer.parseInt(r);
 Real lr = new Real(0,0);
 lr.setLeft(left);
 lr.setRight(right);
 return lr;
 }
 public static double Trim (double Result){
 Result = Result * 100;
 Result = Result + .5;
 Result = (int)Result;
 Result = Result / 100;
 return Result;
 }
 public static Real add(Real lr1,Real lr2){
 double fnum = cnvt2Double(lr1);
 double snum = cnvt2Double(lr2);
 double result = fnum + snum ;
 result = Trim(result);
 Real lr = cnvt2Real(result); 
 return lr;
 }
 public static Real multiply(Real lr1,Real lr2){
 double fnum = cnvt2Double(lr1);
 double snum = cnvt2Double(lr2);
 double result = fnum * snum ;
 result = Trim(result);
 Real lr = cnvt2Real(result); 
 return lr;
 }
 public static Real subtract(Real lr1,Real lr2){
 double fnum = cnvt2Double(lr1);
 double snum = cnvt2Double(lr2);
 double result = fnum - snum ;
 result = Trim(result);
 Real lr = cnvt2Real(result); 
 return lr;
 }
 }