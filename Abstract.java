/*In Java, Data Abstraction is the property by virtue of which only the essential
 details are displayed to the user. The trivial or the non-essential units are not displayed to the user. */
abstract class Shape {
    String color;
	abstract double area();
    public abstract String toString(); // these is declared as public bcz public access modifiers has higher access privileged
	Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
	
	String getColor() 
	 { 
	 return color; 
	 }
}

class Circle extends Shape {
    double radius;
    Circle(String color, double radius)
    {
		super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
	
	@Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
 
    @Override public String toString()
    {
        return "Circle color is " + super.getColor()  // this is how called the methods of superclas in subclass 
            + "and area is : " + area();
    }
}

class Rectangle extends Shape {
 
    double length;
    double width;
    Rectangle(String color, double length, double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
 
    @Override double area() 
	{ 
	return length * width; 
	}
 
    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}
class Abstract{
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
 