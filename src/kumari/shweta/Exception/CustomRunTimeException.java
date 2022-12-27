
package kumari.shweta.Exception;

/**
 * @author Shweta kumari
 *
 */
public class CustomRunTimeException extends RuntimeException {

	public CustomRunTimeException() {
		super();
	
	}

	public CustomRunTimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public CustomRunTimeException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public CustomRunTimeException(String message) {
		super(message);
		
	}

	public CustomRunTimeException(Throwable cause) {
		super(cause);
	
	}
	
	

}
