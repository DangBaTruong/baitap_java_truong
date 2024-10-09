package baiOTruong;

public class circle1 {
	private double radius;
	private String color;

	public circle1() {
		this.radius = 1.0;
		this.color = "red";
	}

	public circle1(double r, String c) {
		this.color = c;
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}
