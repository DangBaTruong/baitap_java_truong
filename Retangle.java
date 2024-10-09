package baiOTruong;

public class Retangle {
	private float length;
	private float width;

	public Retangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}

	public Retangle(float a, float b) {
		this.length = a;
		this.width = b;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	public String toString() {
		return "Retangle[length=" + length + ", width=" + width + "]";
	}

}
