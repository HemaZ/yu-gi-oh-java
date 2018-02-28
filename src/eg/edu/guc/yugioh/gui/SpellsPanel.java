package eg.edu.guc.yugioh.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import eg.edu.guc.yugioh.board.player.Player;
import eg.edu.guc.yugioh.cards.MonsterCard;
import eg.edu.guc.yugioh.cards.spells.SpellCard;

public class SpellsPanel extends JPanel {
	private ArrayList<JButton> spells;
	private Player p;
	
	public SpellsPanel(Player p) {
		super();
		setPreferredSize(new Dimension(500,100));
	update(p);
	}

	public ArrayList<JButton> getSpells() {
		return spells;
	}

	public void setSpells(ArrayList<JButton> spells) {
		this.spells = spells;
	}
	
	public void update(Player p){
		spells = new ArrayList<JButton>();
		this.setLayout(new GridLayout(1,5));
		this.setOpaque(false);
		this.setVisible(true);
		for(int i = 0;i<p.getField().getSpellArea().size();i++){
			if(p.getField().getSpellArea().get(i)!=null){
			SpellButton spellbutton = new SpellButton();
			ImageIcon img = new ImageIcon("Cards Images Database/Card Back  Set.png");
			Image img2 = img.getImage();
			Image newimg = img2.getScaledInstance(91, 62,  java.awt.Image.SCALE_SMOOTH);
			ImageIcon newIcon = new ImageIcon(newimg);
			spellbutton.setIcon(newIcon);
			spellbutton.setSpell(p.getField().getSpellArea().get(i));
			spellbutton.setOpaque(false);
			spells.add(spellbutton);
			this.add(spellbutton);
		
		}
		}
		for (int i = 0; i < 5-p.getField().getSpellArea().size(); i++) {
		
			JButton but = new JButton();
			but.setOpaque(false);
			but.setOpaque(false);
			spells.add(but);
			this.add(but);
		}
	}

}
