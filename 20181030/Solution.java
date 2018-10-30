import java.util.*;
import java.util.regex.*;

/*
 * Leetcode problem: leetcode.com/problems/unique-email-addresses/
 * Given an array of Strings, which represent emails, do the following:
 * Each email is split into a local and domain string, domain is after @
 * For the local string, remove any periods and if there is a + sign, remove everything after it but NOT the domain string
 * Domain string is not affected by either of these.
 * Return the number of non duplicate emails left in the array.
 */

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String, Integer> parsedEmails = new HashMap<>();
        for(String currentEmail: emails){

		String[] fullEmail = currentEmail.split("@");
		fullEmail[0] = fullEmail[0].replace(".", "");
		fullEmail[0] = fullEmail[0].replaceAll("\\+.*", "");
		String finalEmail = String.join("@", fullEmail);
		parsedEmails.put(finalEmail, 1);
        }
        return parsedEmails.size();
    }
    public static void main(String[] args){
	    String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        
	    Solution sol = new Solution();

            int ret = sol.numUniqueEmails(emails);
            
            System.out.println(ret);
            
    }
}
