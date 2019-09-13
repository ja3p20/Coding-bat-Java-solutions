'''

We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false

'''

public boolean xyBalance(String str) {
  int len = str.length() - 1;
    char ch;
    for(int i = len; i >= 0; i--)
    {
	ch = str.charAt(i);
	if(ch == 'x')
	  return false;
	else if(ch == 'y')
	  return true;
    }
    return true;
}

