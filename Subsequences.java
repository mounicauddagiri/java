package com.vogella.eclipse.ide.first;
import java.util.*;

public class Subsequences {
	
	static List<String> al = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		findsubsequences(s,"");
		System.out.println(al);
		
	}
	private static void findsubsequences(String s, String ans) {
		if(s.length() == 0) {
			al.add(ans);
			return;
		}
		
		findsubsequences(s.substring(1), ans+s.charAt(0));
		
		findsubsequences(s.substring(1),ans);
	}
	
	

}
