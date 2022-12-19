package com.DataTypes;
import java.lang.*;
import java.util.*;
public class Arrays {
	/**
	 * @author Vinoth
	 * @version 1.0.1
	 *
	 */

	public static void main(String[] args) {

		int[] arr = new int[10];
		// System.out.println(arr.length);
		System.out.println(arr[3]);

		double[] arr1 = new double[10];
		System.out.println(arr1[2]);

		boolean[] arr4 = new boolean[10];
		System.out.println(arr4[3]);

		// Single Dimentional Array
		int[] arr5 = { 4, 5, 6, 7 };
		System.out.println(arr5[3]); // find array value

		// Multi Dimentional Array
		//int[][] matrix = { { 5, 6, 7, 8 }, { 3, 4, 5, 7 }, { 8, 41, 25, 17 } };
		//System.out.println(matrix[2][2]);

		System.out.println(java.util.Arrays.toString(arr5));
		//sort arrays value
		java.util.Arrays.sort(arr5);
		System.out.println(java.util.Arrays.toString(arr5));
		
		String[] student= new String[5];
		student[0]="Vinoth";
		student[1]="Praveen";
		student[2]="Rajesh";
		student[3]="Arun";
		student[4]="Selva";
		System.out.println(student.length);
		System.out.println(java.util.Arrays.toString(student));
	}
}
