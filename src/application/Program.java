package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TriangleObject;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, type the meassures of the first triangle:");
		
		System.out.println("Please, type the first side numbers");
		double side1 = sc.nextDouble();
		System.out.println("Please, type the second side numbers");
		double side2 = sc.nextDouble();
		System.out.println("Please, type the third side numbers");
		double side3 = sc.nextDouble();
		
		TriangleObject triangle1= new TriangleObject(side1, side2, side3);
		
	System.out.println("Please, type the meassures of the second triangle:");
		
		System.out.println("Please, type the first side numbers");
		double side1_2 = sc.nextDouble();
		System.out.println("Please, type the second side numbers");
		double side2_2 = sc.nextDouble();
		System.out.println("Please, type the third side numbers");
		double side3_3 = sc.nextDouble();
		
		TriangleObject triangle2= new TriangleObject(side1_2, side2_2, side3_3);
		
		double area1 = triangle1.calculateArea();
		double area2 = triangle2.calculateArea();
		
		System.out.println(triangle1.biggerTriangle(area1, area2));
		
		sc.close();
		

	}

}
