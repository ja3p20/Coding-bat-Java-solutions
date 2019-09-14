'''

A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

'''

public String getSandwich(String str) {
  int ifirst = str.indexOf("bread");
  int ilast = str.lastIndexOf("bread");
  if(ifirst != -1 && ilast != -1 && ifirst!=ilast)
    return str.substring(ifirst+5,ilast);
  return "";
}
