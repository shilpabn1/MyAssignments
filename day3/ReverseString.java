package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String companyName= "Testleaf";
    char[] company=companyName.toCharArray();
    for(int i=company.length-1; i>=0; i--) {
    	System.out.println(company[i]);
    	}
    System.out.println("--------------in one line");
    for(int i=company.length-1;i>=0; i--) {
    	System.out.print(company[i]);
    }
	}

}
