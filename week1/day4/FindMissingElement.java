package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num={1, 4,3,2,8, 6, 7}; 
		// find the length of array
		 int arraysize=num.length;
		 System.out.println(arraysize);
		 Arrays.sort(num); //sorted 1,2,3,4,6,7,8
		 int MissingNumber ;
         for(int i=0; i<num.length; i++) {
        	 System.out.println(num[i]);
        	// 1,2,3,4,5,6
		    if(num[i]!=i+1) {
		    	MissingNumber=i+1;
		    	System.out.println(MissingNumber);
		    	break;
		    }
				 }
			}
}
         
			
	

