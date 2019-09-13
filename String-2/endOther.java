'''

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true

'''

public boolean endOther(String a, String b) {
  /*  Alternative
  if (a.length() < b.length()){
    String temp;
    temp = a;
    a = b.toLowerCase();
    b = temp.toLowerCase();
  }
  return a.substring(a.length()-b.length()).equals(b);
  */
  
  a = a.toLowerCase();
  b = b.toLowerCase();
  String end;
  String temp;
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen >= bLen){
    end = a.substring(aLen-bLen);
    temp = b;
  } else {
    end = b.substring(bLen-aLen);
    temp = a;
  }
  return end.equals(temp);
}

