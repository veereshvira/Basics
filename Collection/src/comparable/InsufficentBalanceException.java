package comparable;

import java.util.Scanner;

public class InsufficentBalanceException extends RuntimeException {
	private String message;

	public InsufficentBalanceException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}


