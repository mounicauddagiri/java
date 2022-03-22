package com.vogella.eclipse.ide.first;

public class WordSearchDFS {

	public static boolean contains(char[][] wordSearch, String word) {
		for(int i=0; i<wordSearch.length;i++) {
			for(int j=0;j<wordSearch[i].length;j++) {
				if(matches(wordSearch, i, j, word.charAt(0))) {
					if(isWordInWordSearchInner(wordSearch, word, i,j)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private static boolean isWordInWordSearchInner(char[][] wordSearch, String word, int x, int y) {
		if(word.isEmpty()) {
			return true;
		}else {
			boolean firstLetter = matches(wordSearch, x, y, word.charAt(0));
			if(firstLetter) {
				boolean left = isWordInWordSearchInner(wordSearch, word.substring(1), x-1, y);
				boolean right = isWordInWordSearchInner(wordSearch, word.substring(1), x+1, y);
				boolean bottom = isWordInWordSearchInner(wordSearch, word.substring(1), x, y+1);
				boolean top = isWordInWordSearchInner(wordSearch, word.substring(1), x, y-1);
				
				return left || right || bottom || top;
			}
			return false;
		}
		
	}
	
	private static boolean matches(char[][] wordSearch, int x, int y, char c) {
		if(x < 0 || x>= wordSearch.length || y < 0 || y >= wordSearch[x].length) {
			return false;
		}
		else {
			return wordSearch[x][y] == c;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] wordMatrix = {
				{'E','N','I','N'},
				{'T','O','N','E'},
				{'N','I','A','L'},
				{'B','A','N','L'}
				};
		String word = "TONE";
		
		System.out.println(contains(wordMatrix, word));
	}

}
