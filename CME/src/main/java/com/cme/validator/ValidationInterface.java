package main.java.com.cme.validator;

public interface ValidationInterface {
	
	ValidationResult isValid(String palindrome);
	
	
	/////??????????
	void throwOnInvalid(T object) throws NewInputValidationException;

	}
}
