'''

Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

'''

public boolean xyzMiddle(String str) {
  if(str.length()<3) return false;
  int mid1 = str.length()/2-2;
  int mid2 = str.length()/2-1;
  if (str.length()%2==0)
    return str.substring(mid1,mid1+3).equals("xyz") || 
      str.substring(mid2,mid2+3).equals("xyz");
  return str.substring(mid2,mid2+3).equals("xyz");
}

