package pkg1;

public class ResizableCircle implements Resizable{
	double radius;

	public double getRadius() {
		return this.radius;
	}

	public void resize(double radius) {
		this.radius=radius;
		
	}

	public ResizableCircle(double radius) {
		this.radius = radius;
	}
		
}
