public class Automobile
{
String Color; 
int IDNumber; 
String Model;
int Year;
double MPgallon;

public String getColor()
{
return Color;
}
public void setColor(String Clr)
{
Color = Clr;
}

public int getIDNumber()
{
return IDNumber;
}

public void setIDNumber(int IDn)
{
if (IDn < 0 || IDn > 9999)
   IDNumber=0;
else
   IDNumber = IDn;
}

public String getModel()
{
return Model;
}
public void setModel(String Mdl)
{
Model = Mdl;
}

public int getYear()
{
return Year;
}

public void setYear(int Yr)
{
if (Yr < 2000 || Yr > 2017)
   Year =0;
else
   Year = Yr;
}

public double getMPgallon()
{
return MPgallon;
}

public void setMPgallon(double Mpg)
{
if (Mpg < 10 || Mpg > 60)
   MPgallon = 0;
else
   MPgallon=Mpg;
}   
   
public Automobile(String Color , int IDNumber , String Model , int Year, double MPgallon)

{
   this.setColor(Color);
   this.setIDNumber(IDNumber);
   this.setModel(Model);
   this.setYear(Year);
   this.setMPgallon(MPgallon);
}
public void Display()
{
System.out.println(" ID number = " + getIDNumber());
System.out.println(" Color = " + getColor());
System.out.println(" Model = " + getModel());
System.out.println(" Year = " + getYear());
System.out.println(" Gallon = " + getMPgallon());
}
}


                                                                                                                                                  









