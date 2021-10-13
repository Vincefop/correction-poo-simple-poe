package fr.vincefop;

public class Door {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Door() {
		this.color = "red";
	}
	
	public Door(String color) {
		this.color = color;
	}
	
	public void Display() {
		System.out.println("Je suis une porte, ma couleur est " + this.color);
	}
	
}
