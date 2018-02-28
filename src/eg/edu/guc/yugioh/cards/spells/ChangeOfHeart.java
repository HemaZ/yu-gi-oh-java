package eg.edu.guc.yugioh.cards.spells;

import eg.edu.guc.yugioh.cards.Card;
import eg.edu.guc.yugioh.cards.MonsterCard;

public class ChangeOfHeart extends SpellCard {

	public ChangeOfHeart(String name, String desc) {

		super(name, desc);

	}

	public void action(MonsterCard monster) {

		Card.getBoard().getOpponentPlayer().getField().getMonstersArea()
				.remove(monster);

		monster.setHidden(false);

		Card.getBoard().getActivePlayer().getField().getMonstersArea()
				.add(monster);

	}

}
