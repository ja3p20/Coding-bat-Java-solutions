'''

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

'''

public boolean xyzThere(String str) {
  if (str.length()>=3 && str.substring(0,3).equals("xyz") )
    return true;
  for (int i=0; i<str.length()-3; i++){
    if( str.charAt(i) !='.' && str.substring(i+1,i+4).equals("xyz")){
      return true;
    }
  }
  return false;
}

/*
  for(int i = 0; i < str.length()-2 ; i++) {
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z') {
      if(i == 0 || str.charAt(i-1) != '.')
	return true;
    }
    return false;
*/
