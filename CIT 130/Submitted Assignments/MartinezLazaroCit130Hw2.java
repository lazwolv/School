/// @author Lazaro Martinez
/// I pledge my word of honor that I have abided
/// by the CSN Academic Integrity Policy
/// while completing this assignment.
/// @file MartinezLazaroCit130Hw2
/// @version 01/26/2024
/// @note Time taken 60 minutes

/* IPO

Start
Import Java utility package
Declare variables
Get triangle Base
Get triangle Height
Calculate triangle Area
Display triangle Area
Get rectangle Width
Get rectangle Height
Calculate rectangle Area
Display rectangle Area
Get semicircle Radius
Calculate semicircle Area
Display Semicircle Area
Calculate figure Area
Display figure Area
End

*/

import java.util.Scanner;

public class MartinezLazaroCit130Hw2{

	public static void main(String [] args){
		// declared all the variables I'm planning on using
		double triangleBase;
		double triangleHeight;
		double rectangleWidth;
		double rectangleHeight;
		double semicircleRadius;
		double triangleArea;
		double rectangleArea;
		double semicircleArea;
		double figureArea;

		Scanner input = new Scanner(System.in); // setup scanner for gathering user input

		// get user input for Base and Height for the triangle
		// and calculate and display the triangle's area
		System.out.println("Enter triangle Base (in centimeters):");
		triangleBase = input.nextDouble();
		System.out.println("Enter triangle Height (in centimeters):");
		triangleHeight = input.nextDouble();
		triangleArea = triangleBase * triangleHeight / 2;
		System.out.println("The area of the triangle is: " + triangleArea);

		// get user input for Width and Height for the rectangle
		// and calculate and display the rectangle's area
		System.out.println("Enter rectangle Width (in centimeters):");
		rectangleWidth = input.nextDouble();
		System.out.println("Enter rectangle Height (in centimeters):");
		rectangleHeight = input.nextDouble();
		rectangleArea = rectangleWidth * rectangleHeight;
		System.out.println("The area of the rectangle is: " + rectangleArea);

		// get user input for Radius for the semicircle
		// and calculate and display the semicircle's area
		System.out.println("Enter semicircle Radius (in centimeters):");
		semicircleRadius = input.nextDouble();
		semicircleArea = (Math.PI * semicircleRadius * semicircleRadius) / 2;
		System.out.println("The area of the semicircle is: " + semicircleArea);

		// calculate and display the composite figure's area
		figureArea = triangleArea + rectangleArea - semicircleArea;
		System.out.println("The area of the composite 2D figure is: " + figureArea + " cm2");

		input.close();
		
	} //main

} //class
