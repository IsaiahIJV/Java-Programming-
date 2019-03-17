public class Circle
{
private int radius;
private int diameter;
private double area;


public Circle()
{
radius = 1;
diameter = 2 * radius;
area = Math.PI * radius * radius;
}

public int get_radius()
{
   return radius; 
}

public void set_radius(int rad)
{
radius = rad;
diameter = 2 * radius;
area = Math.PI * radius * radius;
}

public int get_diameter()
{
   return diameter;
}

public void set_diameter(int diam)
{
diameter = diameter;
diameter = 2 * radius;
}

public double get_area()
{
   return area;
}

public void set_area(double ar)
{
area = ar;
}
public void Display()
{
System.out.println("A circle with radius  " + radius + "  has diameter  " + diameter + " and area " + area);
}
} 

   