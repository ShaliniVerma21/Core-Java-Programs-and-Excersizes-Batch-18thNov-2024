package Day14;
//Abstraction via abstract classes(0-100%)

abstract class Shape{
	
	//abstract method (unimplemented details)
	abstract double area();
	
	// non- abstract method (Concrete method)
	void display()
	{
		System.out.println("This is an area.");
	}
}

class Circle extends Shape{

	private double radius;
	//double PI=3.141;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	double area() {
		return Math.PI*radius*radius;
	}
	
}

class Rectangle extends Shape{

	private double height;
	private double width;
	
	Rectangle(double height,double width)
	{
		this.height=height;
		this.width=width;
	}
	
	@Override
	double area() {
		return height*width;
	}
	
}

public class demo4 {
	public static void main(String[] args) {
		Shape shape1;
		Shape shape2;
		
		shape1 = new Circle(5.5);
		shape2 = new Rectangle(12.5,34.5);
		
		System.out.println("Area of Circle is : "+ shape1.area());
		System.out.println("Area of Rectangle is : " +shape2.area());
		

	}

}
