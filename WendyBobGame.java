package com.vogella.eclipse.ide.first;

public class WendyBobGame {
	public static String GameWinner(String colors) {
		int w =0; 
		int b =0;
		for (int i=0; i<colors.length()-2;i++) {
			String sub = colors.substring(i,i+3);
			if(sub.equals("www")) {
				w++;
			}
			if(sub.equals("bbb")) {
				b++;
			}
		}
		if(w>b) {
			return "Wendy";
		}
		if(w<b) {
			return "Bob";
		}
		return null; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wwbbbbwbbbwbbbwwbbbbwwwwbwbwbwbwwwww";
		System.out.println(GameWinner(s));
	}

}
