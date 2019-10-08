package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Shape s1 = new Circle(2.0,Color.BLACK);
		Shape s2 = new  Rectangle(3.0,4.0,Color.WHITE);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
