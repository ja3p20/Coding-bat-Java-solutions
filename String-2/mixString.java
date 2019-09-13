'''
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

'''

public String mixString(String a, String b) {
  StringBuilder sb = new StringBuilder();
  int aLen = a.length();
  int bLen = b.length();
  int i = 0;
  for(; i<aLen && i<bLen; i++){
    sb.append(a.charAt(i));
    sb.append(b.charAt(i));
  }
  for(; i<aLen; i++){
    sb.append(a.charAt(i));
  }
  for(; i<bLen; i++){
    sb.append(b.charAt(i));
  }
  return sb.toString();
}

