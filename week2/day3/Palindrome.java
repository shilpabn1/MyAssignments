package week2.day3;

public class Palindrome {
 
		public static void main(String[] args) {
		    
		    int input=121;
		    int total=0;
		    int ans=input;
		    while (input>0){
		        int remainder = input % 10;
		        total = total * 10 + remainder; //0+1  //1*10+2 //12*10+1
		                                        //1    //12     //121
		        input = input / 10;
		    } 
		    
		    if(total==ans) {
		        System.out.println("Palindrome");
		    }else {
		        System.out.println("not a palindrom");
		    }
		    
		}
		}
