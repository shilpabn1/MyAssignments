package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetUniqueCharacter {

	public static void main(String[] args) {
		String companyName="google";
		char[] Cname=companyName.toCharArray();
		Set<Character> Var=new HashSet<Character>();
		for(int i=0; i<Cname.length;i++)
		{
			Var.add(Cname[i]);
		}
		System.out.println(Var);
	}
	
}
