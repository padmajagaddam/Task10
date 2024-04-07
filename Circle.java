package Task10;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
      
   double radius;
    }
  
    public double getRadius() {
      return radius;
    }
  
    public void setRadius(double radius) {
      this.radius = radius;
    }

public double getCircumference()
{ 
   return 2*Math.PI*radius;
}
   //System.out.println("the circumference of the circle from the method is " +circumfere   
       public Circle( double radius, double circumference)
     
    {
        
        System.out.println("the circumference from constructor with two arguments is " );
    
         System.out.println(getCircumference());
        
       }


   public static void main(String []args)
{ 
    int r = 5;
    Circle circle = new Circle();
    System.out.println("Radius of the circle is " + r);
    System.out.println("The circumference of the circle is " + circle.getCircumference());
    r = 8;
    circle.setRadius(r);
    System.out.println("\nRadius of the circle is " + r);
    System.out.println("The circumference of the circle is now " + circle.getCircumference());
  }

    
}

