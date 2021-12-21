package com.fredo.week3;

import java.lang.reflect.Array;

public class App {

	public static void main(String[] args) {
		
// Question number 1	
	int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		
		
	System.out.println(ages[ages.length - 1] - ages[0]);
	
		int sum = 0;
		
		for (int i = 0; i< ages.length; i++) {
			sum += ages [i];
		}
		int average = sum/ages.length;
		System.out.println (average);
// Question number 2
		String [] names = new String [] { "Sam", "Tommy", "Tim", "Sally", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
			average = sum / names.length;
			
//			System.out.print (names[i]+ " ");
			System.out.println(average);
// Question number 3
			System.out.println("The last element in the names array is " + names[names.length -1]);
// Question number 4
			System.out.println("The first element in the names array is " + names[0]);		
// Question number 5 and 6	
		int [] nameLength = new int [5];
		for (int i = 0; i < names.length; i++) {
			nameLength[i] = names[i].length();
		}
		sum = 0;
		for (int i = 0; i< nameLength.length; i++) {
			sum += nameLength[i];
		}
		System.out.println ("The sum of all the elements in nameLength is " + sum);
		
// Testing number 7		
		System.out.println(concatenateWord("Hello", 3));
//Testing number 8		
		System.out.println(createFullName("Fredo","Duran"));
// Testing number 9 
		System.out.println(sumOfAllInts(ages));
		}// end of main
// Question number 7
	
		public static String concatenateWord (String word, int n) {
			String result = "";
			for (int i = 1; i <= n; i++) {
				result = result + word;
			}
			return result;
		}
//Question number 8
		public static String  createFullName (String firstName, String lastName) {
			return  (firstName + " " + lastName);
//Question number 9			
		}
		public static boolean sumOfAllInts(int[] myArray) {
			int sum = 0;
				for (int i = 0; i < myArray.length; i++) {
					sum += myArray[i];
				}
			if (sum > 100) {
				return true;
			}
			else {
				return false;
			}
		}
		public static double averageOfElements (double[] arrayOfDouble) {
			double sum = 0;
			for (int i = 0; i < arrayOfDouble.length; i++) {
				sum += arrayOfDouble[i];
				}
			double average = sum / arrayOfDouble.length;
			return average;
		}
		
		
}
	
	

