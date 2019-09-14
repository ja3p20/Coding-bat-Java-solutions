'''

Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"

'''

public String wordEnds(String str, String word) {
  int len = str.length();
	int wLen = word.length();
	int pos = str.indexOf(word);
	int i = 0;
	StringBuilder stbuild = new StringBuilder(len);
	while(pos != -1)
	{
		i = pos + wLen;
		if(pos >= 1)
			stbuild.append(str.charAt(pos-1));
		if(i < len)
			stbuild.append(str.charAt(pos+wLen));
		pos = str.indexOf(word, i);	
	}
	return stbuild.toString();
}
