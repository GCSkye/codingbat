/* Given a string, return a version without the first 2 chars. Except keep 
 * the first char if it is 'a' and keep the second char if it is 'b'. The 
 * string may be any length. Harder than it looks.
 */
public String deFront(String str) {
  String holder = "";
  if (str.charAt(0) == 'a') holder+="a";
  if (str.charAt(1) == 'b') holder+="b";
  return holder += str.substring(2);
}
