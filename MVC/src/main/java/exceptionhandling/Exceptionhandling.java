package exceptionhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandling {
	
	
	@ExceptionHandler(value=ArithmeticException.class)
	public String handleExveption(Exception e)
	{   
		
		System.out.println("Balance insufficient");
		return "insufficientblance";
		
		
		
	}

}
