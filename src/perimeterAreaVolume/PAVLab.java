//Additional Comment for Git Training

package perimeterAreaVolume;

import java.util.Scanner;

public class PAVLab {

	public static void main(String[] args) {
		// Open Scanner
		Scanner scnr1 = new Scanner (System.in);
		
		//Declare Variables
		double length;
		double height;
		double width;
		double area;
		double perimeter;
		double volume;
		boolean continueTest = true;
		String response;
		char responseResult;
		
		//Run Loop for continuation answer
		while (continueTest == true) {
		
		//collect needed user inputs
		System.out.println("Enter the length of the space:");
		length = scnr1.nextDouble();

		System.out.println("Enter the width of the space:");
		width = scnr1.nextDouble();

		System.out.println("Enter the height of the space:");
		height = scnr1.nextDouble();

		//calculate results based on user inputs
		area = length * width;
		volume = length * width * height;
		perimeter = (length * 2) + (width * 2);
		
		//Displays results to user
		System.out.println("The Area: " + area );
		System.out.println("The Perimeter: " + perimeter);
		System.out.println("The Volume: " + volume);
		
		//Asks if they want to continue
		System.out.println("Continue? (y continues)");		
		response = scnr1.next();
		responseResult = response.charAt(0);
		
		//Loop repeats if input is y, and stops if its anything else
		if (responseResult == 'y') {
			continueTest = true;
		}
		else {
			continueTest = false;
		}
		
		
	}
		scnr1.close();
}

}
