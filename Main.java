/*
 Jackson Frank
 File: Main.java
 Purpose: To output the surface area and volume of different shapes based on user input
 */

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		
		
		println("3D Shapes!");
		println("");
		
		Interface3D shapes;
	
		
		println("Which shape would you like to use?:");
		println("1. Cone");
		println("2. Cube");
		println("3. Cylinder");
		println("4. Rectangular Prism");
		println("5. Sphere");
		println("6. TriangularPrism");
		print("Your choice: ");
		int choice = console.nextInt();
		
		println("");
		
		switch(choice) {
		case 1:
			print("Base Radius: ");
			float r1 = console.nextFloat();
			print("Height: ");
			float h1 = console.nextFloat();
			shapes = new Cone(r1, h1);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		case 2:
			print("Side Length: ");
			float s = console.nextFloat();
			shapes = new Cube(s);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		case 3:
			print("Base Radius: ");
			float r2 = console.nextFloat();
			print("Height: ");
			float h2 = console.nextFloat();
			shapes = new Cylinder(r2, h2);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		case 4:
			print("Length: ");
			float l1 = console.nextFloat();
			print("Width: ");
			float w1 = console.nextFloat();
			print("Height: ");
			float h3 = console.nextFloat();
			shapes = new RectangularPrism(l1, w1, h3);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		case 5:
			print("Radius ");
			float r3 = console.nextFloat();
			shapes = new Sphere(r3);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		case 6:
			print("Side 1: ");
			float s1 = console.nextFloat();
			print("Side 2: ");
			float s2 = console.nextFloat();
			print("Side 3: ");
			float s3 = console.nextFloat();
			print("Length: ");
			float l2 = console.nextFloat();
			shapes = new TriangularPrism(s1, s2, s3, l2);
			System.out.println("Volume: " + shapes.getVolume());
			System.out.println("Surface Area: " + shapes.getSA());
			break;
		}
		console.close();
	}
	
	
	public static void println(String string) {
		System.out.println(string);
	}
	public static void print(String string) {
		System.out.print(string);
	}

}
