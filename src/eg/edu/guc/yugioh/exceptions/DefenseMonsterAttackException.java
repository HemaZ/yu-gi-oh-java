package eg.edu.guc.yugioh.exceptions;

@SuppressWarnings("serial")
public class DefenseMonsterAttackException extends RuntimeException {

	public DefenseMonsterAttackException() {
	}

	public DefenseMonsterAttackException(String message) {
		super(message);
	}
	
}
