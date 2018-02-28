package eg.edu.guc.yugioh.exceptions;

@SuppressWarnings("serial")
public class MonsterMultipleAttackException extends RuntimeException {

	public MonsterMultipleAttackException() {
	}

	public MonsterMultipleAttackException(String message) {
		super(message);
	}

}
