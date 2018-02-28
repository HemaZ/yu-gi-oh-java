package eg.edu.guc.yugioh.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import eg.edu.guc.yugioh.board.player.Player;
import eg.edu.guc.yugioh.cards.Mode;
import eg.edu.guc.yugioh.cards.MonsterCard;

public class MonstersPanel extends JPanel {
	private ArrayList<MonsterButton> monsters;
	public MonstersPanel(Player p) {
		super();
		setPreferredSize(new Dimension(500,100));
		monsters = new ArrayList<MonsterButton>();
		this.setLayout(new GridLayout(1,5));
		this.setOpaque(true);
		this.setVisible(true);
		for(int i = 0;i<5;i++){
			MonsterButton monsterbutton = new MonsterButton();
			monsters.add(monsterbutton);
			monsterbutton.setBackground(Color.GRAY);
			monsterbutton.setOpaque(false);
			this.add(monsterbutton);
			
		}
		for (int i = 0; i < p.getField().getMonstersArea().size(); i++) {
			monsters.get(i).setMonster(p.getField().getMonstersArea().get(i));
			monsters.get(i).setVisible(true);
			ImageIcon newIcon;
			if(monsters.get(i).getMonster().getMode()==Mode.ATTACK){
			ImageIcon img = new ImageIcon("Cards Images Database/Monsters/"+p.getField().getMonstersArea().get(i).getName()+".png");
			Image img2 = img.getImage();
			Image newimg = img2.getScaledInstance(62, 91,  java.awt.Image.SCALE_SMOOTH);
			newIcon = new ImageIcon(newimg);
			}else{
				ImageIcon img = new ImageIcon("Cards Images Database/Card Back  Set.png");
				Image img2 = img.getImage();
				Image newimg = img2.getScaledInstance(91, 62,  java.awt.Image.SCALE_SMOOTH);
				 newIcon = new ImageIcon(newimg);
			}
			monsters.get(i).setIcon(newIcon);
			monsters.get(i).setPreferredSize(new Dimension(62,91));
			monsters.get(i).revalidate();
			monsters.get(i).setOpaque(false);
			monsters.get(i).repaint();
		}
	}
	public ArrayList<MonsterButton> getMonsters() {
		return monsters;
	}
	public void setMonsters(ArrayList<MonsterButton> monsters) {
		this.monsters = monsters;
	}

	
	

}
