import java.lang.StringBuffer;

/*
 * https://leetcode.com/problems/to-lower-case/
 *
 * Author: Colin Swan
 *
 * Pretty straightforward, implement a toLowerCase method to convert a given String to be all lower case.
 */
public class ToLowerCase {
    public static String toLowerCase(String str) {
        StringBuffer newString = new StringBuffer(str);
        for(int i = 0; i < newString.length(); i++){
            char curr = newString.charAt(i);
            if(curr >= 'A' && curr < '['){
                newString.setCharAt(i,(char)((int)curr + 32));
            }
        }
        return newString.toString();
        
   }

   public static void main(String[] args){
	   System.out.println(ToLowerCase.toLowerCase("piTAsTeEsT"));
   }

}
