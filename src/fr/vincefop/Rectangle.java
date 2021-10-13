package fr.vincefop;

public class Rectangle {
	
	public double a;
	public double b;
	
	public Rectangle() {}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double surface() {
		double result = this.a*this.b;
		return result;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	
	
}
