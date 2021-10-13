package fr.vincefop;

public class Point {
	
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void distance(Point p) {
		System.out.println("La distance entre P1 et P2 est : "
							+ Math.sqrt( Math.pow( (double)p.x-(double)this.x,2 ) + Math.pow( (double)p.y-(double)this.y,2 ) )
						);
	}
	
	@Override
	public String toString() {
		return "Point [" + this.x + ", " + this.y + "]";
	}
	
	
	
}
