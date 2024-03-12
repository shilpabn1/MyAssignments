package week1.day4;

import java.util.Arrays;

public class CompareTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {2,5,79,10};
		int[] num2= {3,4,7,11,12};
		//use nested for loop
		
		//iterate num1
		for (int i = 0; i < num1.length; i++) {  //outer loop
			//iterate num2
			for(int j = 0; j < num2.length; j++) {//Inner loop
				if(num1[i]==num2[j]) {
					System.err.println(num1[i]);
					
				}
			}
			
		}

		System.out.println("--------------------");
		
		int[] num = {5,2,7,1,8,10,4};   //1,2,3,4,5,7,8,10
		
		//Arrays sort
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("-------------Descending order----------------");
		
		//Reverse loop
		//Last index position --> length of the Array -1
		for (int i = num.length-1; i>=0; i--) {
			System.out.println(num[i]);
			
		}
		

	}

}
