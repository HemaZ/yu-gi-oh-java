package eg.edu.guc.yugioh.gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import eg.edu.guc.yugioh.board.player.Player;
import eg.edu.guc.yugioh.cards.Card;
import eg.edu.guc.yugioh.cards.MonsterCard;
import eg.edu.guc.yugioh.cards.spells.SpellCard;

public class HandPanel extends JPanel {
	private ArrayList<MonsterButton> monsterbuttons;
	private ArrayList<SpellButton> spellbuttons;
	public HandPanel(Player p) {
		super();
		update(p);
		
			
		
	}
	public ArrayList<MonsterButton> getHandButtons(){
		return this.monsterbuttons;
	}
	public void setHandButtons(ArrayList<MonsterButton> hb){
		this.monsterbuttons = hb;
	}
	
	public void update(Player p){
		this.removeAll();
		this.revalidate();
		monsterbuttons = new ArrayList<MonsterButton>(20);
		spellbuttons = new ArrayList<SpellButton>(20);
		//setPreferredSize(new Dimension(500,150));
		ArrayList<Card> hand = p.getField().getHand();
		this.setLayout(new FlowLayout());
		this.setOpaque(false);
		
		for (int i = 0; i <20; i++) {
			MonsterButton b = new MonsterButton();
			b.setVisible(false);
			this.add(b);
			monsterbuttons.add(b);		
			
		}
		for (int i = 0; i < 20; i++) {
			SpellButton s = new SpellButton();
			s.setVisible(false);
			this.add(s);
			spellbuttons.add(s);
		}
		for(int i = 0; i <hand.size();i++){
			if(hand.get(i) instanceof MonsterCard){
				//monsterbuttons.get(i).setText(hand.get(i).getName());
				monsterbuttons.get(i).setMonster((MonsterCard) hand.get(i));
				monsterbuttons.get(i).setVisible(true);
				ImageIcon img = new ImageIcon("Cards Images Database/Monsters/"+hand.get(i).getName()+".png");
				Image img2 = img.getImage();
				Image newimg = img2.getScaledInstance(100, 146,  java.awt.Image.SCALE_SMOOTH);
				ImageIcon newIcon = new ImageIcon(newimg);
				monsterbuttons.get(i).setIcon(newIcon);
				monsterbuttons.get(i).setPreferredSize(new Dimension(100,146));
				monsterbuttons.get(i).revalidate();
				monsterbuttons.get(i).setOpaque(false);
				monsterbuttons.get(i).repaint();
				//monsterbuttons.add(mb);
				//this.add(mb);
			}
			else{
				//spellbuttons.get(i).setText(hand.get(i).getName());
				spellbuttons.get(i).setSpell((SpellCard) hand.get(i));
				spellbuttons.get(i).setVisible(true);
				ImageIcon img = new ImageIcon("Cards Images Database/Spells/"+hand.get(i).getName()+".png");
				Image img2 = img.getImage();
				Image newimg = img2.getScaledInstance(100, 146,  java.awt.Image.SCALE_SMOOTH);
				ImageIcon newIcon = new ImageIcon(newimg);
				spellbuttons.get(i).setIcon(newIcon);
				spellbuttons.get(i).setPreferredSize(new Dimension(100,146));
				spellbuttons.get(i).revalidate();
				spellbuttons.get(i).setOpaque(false);
				spellbuttons.get(i).repaint();
			}
		}
	}
	public ArrayList<MonsterButton> getMonsterbuttons() {
		return monsterbuttons;
	}
	public void setMonsterbuttons(ArrayList<MonsterButton> monsterbuttons) {
		this.monsterbuttons = monsterbuttons;
	}
	public ArrayList<SpellButton> getSpellbuttons() {
		return spellbuttons;
	}
	public void setSpellbuttons(ArrayList<SpellButton> spellbuttons) {
		this.spellbuttons = spellbuttons;
	}

}
