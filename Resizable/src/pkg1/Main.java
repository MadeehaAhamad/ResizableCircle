package pkg1;

public class Main {

	public static void main(String[] args) {
		Resizable r1 = new ResizableCircle(20.0);
		System.out.println("Original Radius : "+r1.getRadius());
		r1.resize(30.0);
		System.out.println("Resized Radius : "+r1.getRadius());
	}

}
