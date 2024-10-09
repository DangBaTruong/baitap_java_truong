package baiOTruong;

public class mainRectangle {
	public static void main(String[] args) {

		Retangle r1 = new Retangle(1.2f, 3.4f);
		System.out.println(r1);
		Retangle r2 = new Retangle();
		System.out.println(r2);

		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());

		// Test getArea() and getPerimeter()
		System.out.printf("area is: %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
	}
}
