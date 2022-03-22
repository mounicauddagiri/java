package com.vogella.eclipse.ide.first;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChars {
	
	public static int LongestSubString(String s) {
		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> set = new HashSet();
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				System.out.println(set);
				max = Math.max(max, set.size());
			}
			else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkewrweerwdewdwdwefrfefgtrcsdgetg";
		System.out.println(LongestSubString(s));
	}

}
