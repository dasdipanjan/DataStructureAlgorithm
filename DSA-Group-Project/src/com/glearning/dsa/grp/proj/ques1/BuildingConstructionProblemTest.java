package com.glearning.dsa.grp.proj.ques1;

import java.util.Scanner;

/**
 * This class is responsible to take input from user for no of floor to be
 * constructed and size of each floor which is constructed in separate factory.
 * 
 * @author Dipanjan, Latika, Amit, Arka.
 * @since 12-Feb-2023
 * @version 1.0
 */
public class BuildingConstructionProblemTest {
	/**
	 * This is the entry point of this program. This method is called by JVM with
	 * the help of main thread.
	 * 
	 * @param args String array for command line arguments.
	 */
	public static void main(String ars[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the total number floors in the building : ");
			int noOfFloors = scanner.nextInt();
			BuildingConstructionProblem constructionProblem = new BuildingConstructionProblem(noOfFloors);
			int daysToComplete[] = new int[noOfFloors + 1];
			for (int i = 1; i <= noOfFloors; i++) {
				System.out.println("Enter the floor size given on day : " + i);
				int size = scanner.nextInt();
				daysToComplete[size] = i;
			}
			constructionProblem.displayConstructionOrders(daysToComplete);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
