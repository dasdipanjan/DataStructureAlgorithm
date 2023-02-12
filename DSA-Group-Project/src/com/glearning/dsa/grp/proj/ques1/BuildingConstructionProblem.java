package com.glearning.dsa.grp.proj.ques1;

/**
 * This class is responsible to analyze building construction related data and
 * display construction process accordingly so that manual work will be avoided.
 * 
 * @author Dipanjan, Latika, Amit, Arka.
 * @since 12-Feb-2023
 * @version 1.0
 */
public class BuildingConstructionProblem {
	private int totalNumberOfFloor;

	public BuildingConstructionProblem(int totalNumberOfFloor) {
		super();
		this.totalNumberOfFloor = totalNumberOfFloor;
	}

	/**
	 * This method is responsible to analyze floor size from given array and display
	 * construction order as follows. As per the rule building should be constructed
	 * in below mentioned rule.
	 * 
	 * a) The floor with the larger size must be placed at the bottom of the
	 * building b) The floor with the smaller size must be placed at the top of the
	 * building.
	 * 
	 * @param day Integer type array.
	 */
	public void displayConstructionOrders(int day[]) {
		boolean flag;
		int temp = this.totalNumberOfFloor;
		System.out.println("\nThe order of construction is as follows \n");
		for (int i = 1; i <= totalNumberOfFloor; i++) {
			System.out.println("Day " + i + " :");
			while (temp >= 1 && day[temp] <= i) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
		}
	}

}
