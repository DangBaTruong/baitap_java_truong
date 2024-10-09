package baiOTruong;

public class circle2 {
	private double radius;

	public circle2() {
		this.radius = 1.0;
	}

	public circle2(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
