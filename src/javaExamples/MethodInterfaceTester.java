package javaExamples;

class Cube implements MethodInterface{
	
	private double length;
	
	public Cube(double len)
	{
		length = len;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6 * length * length;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return length * length * length;
	}
	
	
}

class Ball implements MethodInterface{
	
	private double radius;
	
	public Ball(double rad)
	{
		radius = rad;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
	}
	
	
}

public class MethodInterfaceTester {
	
	public static void main(String[] args)
	{
		Cube c1 = new Cube(3.4);
		Ball b1 = new Ball(4.3);
		
		System.out.println("The area of the cube is: " + c1.getArea() + ", and volume is: " + c1.getVolume());
		System.out.println("The area of the ball is: " + b1.getArea() + ", and volume is: " + b1.getVolume());
	}
	
	
}