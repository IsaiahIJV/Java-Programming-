public class BloodData
{
private String BloodType;
private String Rh;

public String getBloodType()
{
return BloodType;
}
public void setBloodType(String BT)
{
BloodType=BT;
}

public String get_RH()
{
return Rh;
}


public void set_Rh(String rh)
{
Rh=rh;
}

public BloodData()
{
BloodType="O";
Rh= "+";
}

public BloodData(String BT, String rh)
{
BloodType= BT;
Rh=rh;
}

public void Display()
{
System.out.println( "Blood Type = " + this.getBloodType() + " RH factor is "  + this.get_RH());
}
}  