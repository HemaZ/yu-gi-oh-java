package eg.edu.guc.yugioh.gui;

import javax.swing.JButton;

import eg.edu.guc.yugioh.cards.spells.SpellCard;

public class SpellButton extends JButton {
private SpellCard spell;
	public SpellCard getSpell() {
	return spell;
}
public void setSpell(SpellCard spell) {
	this.spell = spell;
}
	public SpellButton() {
		super();
		this.setVisible(true);
		
	}
	public SpellButton(SpellCard spell){
		this.setVisible(true);
		this.setName(spell.getName());
		this.setOpaque(false);
	}
	public SpellButton(String name){
		
		super(name);
	}
}
