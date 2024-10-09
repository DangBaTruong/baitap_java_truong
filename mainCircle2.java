package baiOTruong;

public class mainCircle2 {
	public static void main(String[] args) {

		circle2 c1 = new circle2(1.1);
		System.out.println(c1);
		circle2 c2 = new circle2();
		System.out.println(c2);

		c1.setRadius(2.2);
		System.out.println(c1);
		System.out.println("radius is: " + c1.getRadius());

		System.out.printf("area is: " + c1.getArea());
		System.out.printf("circumference is: " + c1.getCircumference());
	}
}
