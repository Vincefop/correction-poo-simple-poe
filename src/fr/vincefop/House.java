package fr.vincefop;

public class House {
	private double surface;
	private Door porte = new Door();

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	public House() {}
	
	public House(double surface) {
		this.surface = surface;
	}
	
	public House(Door porte) {
		this.porte = porte;
	}
	
	public House(double surface, Door porte) {
		this.surface = surface;
		this.porte = porte;
	}

	public void Display() {
		System.out.println("Je suis une maison, ma surface est de " + this.surface + " m2");
	}
	
	public Door getDoor() {
		return this.porte;
	}
	
	
}
