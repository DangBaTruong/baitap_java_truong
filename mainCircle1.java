package baiOTruong;

public class mainCircle1 {
	public static void main(String[] args) {
		circle1 c1 = new circle1();
		System.out.println("Hinh tron co ban kinh la: " + c1.getRadius() + " va co dien tich bang " + c1.getArea());

		circle1 c2 = new circle1(2.0, "blue");

		System.out.println("Hinh tron co ban kinh la: " + c2.getRadius() + " va co dien tich bang " + c2.getArea());

	}
}