package main.java.com.cme.palindrome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PalindromeCheckerImp implements PalindromeCheckerInterface {
	
	private static Logger LOG = LoggerFactory.getLogger(Startup.class);
	
	@Override
	public boolean isPalindrome(String palindrome) {
		StringBuilder palindromeSb = new StringBuilder(palindrome);
		//using .equals as comparing literals and not references
		if(palindromeSb.reverse().equals(palindrome)) {
			LOG.info("The input provided:" + palindrome + "is a palindrome");
			return true;
		} else {
			LOG.info("The input provided:" + palindrome + "is not a palindrome");
			return false;
		}
	}
	
	@Override
	public boolean isValidInput(String palindrome) {
        if(palindrome == null){
        	LOG.error("The input provided cannot be null");
            return false; "Palindrome cannot be null");
        }
        if(palindrome.isBlank()){
        	LOG.error("The input provided cannot be an empty string");
            return false;
        }

        if(findNumber.matcher(palindrome).find()){
            return new ValidationResult(false, "Palindrome cannot have number in it");
        }

        if(findWhiteSpace.matcher(palindrome.trim()).find()){
            return new ValidationResult(false, "Palindrome cannot have white space in it");
        }

        return new ValidationResult(true, null);
    }
	}
}
