package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{

	private Double radius;
	
	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.pow(radius,2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [ Area=" + String.format("%.3f",area()) + ", Color=" + getColor() + ", radius=" + radius +  "]";
	}
	
}
