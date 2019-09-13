'''

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

'''

public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    result = result + str.charAt(i) + str.charAt(i);
    // Alternately:
    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
  }
  return result;
  
  /*
  // use StringBuilder because it consumes less memory
  int len = str.length();
  StringBuilder st = new StringBuilder(len*2);
  char ch;
  for (int i=0; i<len; i++){
    ch = str.charAt(i);
    st.append(ch);
    st.append(ch);
  }
  return st.toString();
  */
}

