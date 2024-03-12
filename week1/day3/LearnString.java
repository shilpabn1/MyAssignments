package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name1="Testleaf";
       String name2="TestleaF";
       String name3="Testleaf";
       String reverse1="";
    		   
       System.out.println(name1.equals(name3));
       System.out.println(name1.equalsIgnoreCase(name2));
       System.out.println(name1.contains("test"));
       
       String name4="Hello world";
       char[] array =name4.toCharArray();
       System.out.println(name4.replace("l", "s"));
       

      String name5="TestLeaf";
       char[] array1=name5.toCharArray();
       for(int i=array1.length-1; i>=0;i--) {
    	   System.out.println(array1[i]);
    	  String reverse = reverse1+(array1[i]);
    	  System.out.println(reverse);
       }
      
	}

}
