package main.java.com.cme.validator;

public class NewInputValidationException extends RuntimeException {
	
	protected NewInputValidationException(String exc) {
		//Constructor calling parent RuntimeException constructor
		super(exc);
	}
}
