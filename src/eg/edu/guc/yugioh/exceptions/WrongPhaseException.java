package eg.edu.guc.yugioh.exceptions;

@SuppressWarnings("serial")
public class WrongPhaseException extends RuntimeException {

	public WrongPhaseException() {
	}

	public WrongPhaseException(String message) {
		super(message);
	}

}
