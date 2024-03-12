package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1 
     int[] num= {2,5,7,7,5,9,2,3};
     Arrays.sort(num);
     //Sorted
     for (int i = 0; i < num.length-1; i++) {
    	 System.out.println(num[i]);
     }
     
    // Duplicates
     System.err.println("Duplicates");
 	for (int i = 0; i < num.length-1; i++) {
		if (num[i]==num[i+1]) {
			System.out.println(num[i]);
			
		}
	}
     
	}
	}


