package eg.edu.guc.yugioh.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import eg.edu.guc.yugioh.board.Board;
import eg.edu.guc.yugioh.board.player.Player;
import eg.edu.guc.yugioh.cards.Card;
import eg.edu.guc.yugioh.exceptions.UnexpectedFormatException;
import eg.edu.guc.yugioh.listeners.Controller;

public class Gui extends JFrame {
	public static Clip audioClip;
	private JPanel panel2 ;
	private SpellsPanel spellAreap1;
	private MonstersPanel monsterareap1;
	private MonstersPanel monsterAreap2;
	private SpellsPanel spellAreap2;
	public JLabel deckp1;
	public JLabel deckp2;
	public JLabel lifep1;
	public JLabel lifep2;
	private JButton gravep1;
	private JButton gravep2;
	private NextPhBut nextphase;
	private JLabel p1name;
	private JLabel p2name;
	public JLabel currphase;
	private EndTurnBut endturn;
	private JPanel panel1;
	private HandPanel handp1;
	private HandPanel handp2;
	private JScrollPane pan;
	private HiddenHandPanel p1hid;
	private HiddenHandPanel p2hid;
	private Player p1;
	private Player p2;
	private ImageIcon imgThisImg;
	private JLabel description;
	private JScrollPane sp1;
	private JScrollPane sp2;
	public static Clip getAudioClip() {
		return audioClip;
	}

	public static void setAudioClip(Clip audioClip) {
		Gui.audioClip = audioClip;
	}

	public JScrollPane getSp1() {
		return sp1;
	}

	public void setSp1(JScrollPane sp1) {
		this.sp1 = sp1;
	}

	public JScrollPane getSp2() {
		return sp2;
	}

	public void setSp2(JScrollPane sp2) {
		this.sp2 = sp2;
	}

	public HiddenHandPanel getP1hid() {
		return p1hid;
	}

	public void setP1hid(HiddenHandPanel p1hid) {
		this.p1hid = p1hid;
	}

	public HiddenHandPanel getP2hid() {
		return p2hid;
	}

	public void setP2hid(HiddenHandPanel p2hid) {
		this.p2hid = p2hid;
	}

	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}

	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}

	public SpellsPanel getSpellAreap1() {
		return spellAreap1;
	}

	public void setSpellAreap1(SpellsPanel spellAreap1) {
		this.spellAreap1 = spellAreap1;
	}

	public MonstersPanel getMonsterareap1() {
		return monsterareap1;
	}

	public void setMonsterareap1(MonstersPanel monsterareap1) {
		this.monsterareap1 = monsterareap1;
	}

	public MonstersPanel getMonsterAreap2() {
		return monsterAreap2;
	}

	public void setMonsterAreap2(MonstersPanel monsterAreap2) {
		this.monsterAreap2 = monsterAreap2;
	}

	public SpellsPanel getSpellAreap2() {
		return spellAreap2;
	}

	public void setSpellAreap2(SpellsPanel spellAreap2) {
		this.spellAreap2 = spellAreap2;
	}

	public JLabel getDeckp1() {
		return deckp1;
	}

	public void setDeckp1(JLabel deckp1) {
		this.deckp1 = deckp1;
	}

	public JLabel getDeckp2() {
		return deckp2;
	}

	public void setDeckp2(JLabel deckp2) {
		this.deckp2 = deckp2;
	}

	public JLabel getLifep1() {
		return lifep1;
	}

	public void setLifep1(JLabel lifep1) {
		this.lifep1 = lifep1;
	}

	public JLabel getLifep2() {
		return lifep2;
	}

	public void setLifep2(JLabel lifep2) {
		this.lifep2 = lifep2;
	}

	public JButton getGravep1() {
		return gravep1;
	}

	public void setGravep1(JButton gravep1) {
		this.gravep1 = gravep1;
	}

	public JButton getGravep2() {
		return gravep2;
	}

	public void setGravep2(JButton gravep2) {
		this.gravep2 = gravep2;
	}

	public NextPhBut getNextphase() {
		return nextphase;
	}

	public void setNextphase(NextPhBut nextphase) {
		this.nextphase = nextphase;
	}

	public JLabel getP1name() {
		return p1name;
	}

	public void setP1name(JLabel p1name) {
		this.p1name = p1name;
	}

	public JLabel getP2name() {
		return p2name;
	}

	public void setP2name(JLabel p2name) {
		this.p2name = p2name;
	}

	public JLabel getCurrphase() {
		return currphase;
	}

	public void setCurrphase(JLabel currphase) {
		this.currphase = currphase;
	}

	public EndTurnBut getEndturn() {
		return endturn;
	}

	public void setEndturn(EndTurnBut endturn) {
		this.endturn = endturn;
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public HandPanel getHandp1() {
		return handp1;
	}

	public void setHandp1(HandPanel handp1) {
		this.handp1 = handp1;
	}

	public HandPanel getHandp2() {
		return handp2;
	}

	public void setHandp2(HandPanel handp2) {
		this.handp2 = handp2;
	}

	public JScrollPane getPan() {
		return pan;
	}

	public void setPan(JScrollPane pan) {
		this.pan = pan;
	}

	public Gui(Player p1,Player p2) throws IOException, UnexpectedFormatException{
		super("Yu-Gi-OH");
		Board b = new Board();
		b.startGame(p1, p2);
		setP1(p1);
		setP2(p2);
		ImageIcon bg = new ImageIcon("src/bg.png");
		JLabel g = new JLabel(bg);
		g.setVisible(true);
		try {
		    final Image backgroundImage = javax.imageio.ImageIO.read(new File("bg2.png"));
		    setContentPane(new JPanel(new BorderLayout()) {
		        @Override public void paintComponent(Graphics g) {
		            g.drawImage(backgroundImage, 0, 0, null);
		        }
		    });
		} catch (IOException e) {
		    throw new RuntimeException(e);
		}
		this.add(g);
		setResizable(false); 
		setSize(1366, 768);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		monsterareap1=new MonstersPanel(p1);
		monsterAreap2 = new MonstersPanel(p2);
		spellAreap1= new SpellsPanel(p1);
		spellAreap2 = new SpellsPanel(p2);
		monsterareap1= new MonstersPanel(p1);
		monsterAreap2 = new MonstersPanel(p2);
		nextphase = new NextPhBut("Next Phase");
		endturn = new EndTurnBut("End Turn");
		p1name=new JLabel(p1.getName());
		p2name = new JLabel(p2.getName());
		gravep1 = new JButton();
		gravep2 = new JButton();
		lifep1= new JLabel("Life Points:"+p1.getLifePoints());
		lifep2 = new JLabel("Life Ponts:"+p2.getLifePoints());
		deckp1 = new JLabel(p1.getField().getDeck().getDeck().size()+"");
		deckp2 = new JLabel(""+p2.getField().getDeck().getDeck().size());
		handp1 = new HandPanel(p1);
		handp2 = new HandPanel(p2);
		currphase = new JLabel(Card.getBoard().getActivePlayer().getField().getPhase().name());
		
		
		
		
		
		
		
		
		deckp1.setFont(new Font("Ariel", Font.BOLD, 15));
		deckp1.setForeground(Color.WHITE);
		deckp2.setFont(new Font("Ariel", Font.BOLD, 15));
		deckp2.setForeground(Color.WHITE);
		ImageIcon grave = new ImageIcon("Cards Images Database/Graveyard.png");
		gravep1.setIcon(grave);
		gravep2.setIcon(grave);
		
		description = new JLabel();
		p1hid = new HiddenHandPanel(p1);
		p2hid = new HiddenHandPanel(p2);
		
		p2name.setFont(new Font("Century Gothic", Font.BOLD, 25));
		p2name.setForeground(Color.BLACK);
		
		lifep1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lifep1.setForeground(Color.BLACK);
		
		lifep2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lifep2.setForeground(Color.BLACK);
		
		p1name.setFont(new Font("Century Gothic", Font.BOLD, 25));
		p1name.setForeground(Color.BLACK);
		
		currphase.setFont(new Font("Century Gothic", Font.BOLD, 20));
		currphase.setForeground(Color.BLACK);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(monsterareap1,BorderLayout.NORTH);
		panel1.add(spellAreap1,BorderLayout.CENTER);
		panel1.setOpaque(false);
		
		
		if(p1==Card.getBoard().getActivePlayer()){
			sp1 = new JScrollPane(handp1);
			sp1.setBorder(null);
			sp1.getViewport().setOpaque(false);
			 sp1.setPreferredSize(new Dimension(500,150));
			sp1.setOpaque(false);
			sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
			panel1.add(sp1,BorderLayout.SOUTH);
		this.revalidate();
		}else{
		    sp1 = new JScrollPane(p1hid);
		    sp1.setBorder(null);
			sp1.getViewport().setOpaque(false);
		    sp1.setPreferredSize(new Dimension(500,150));
			sp1.setOpaque(false);
			sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
			panel1.add(sp1,BorderLayout.SOUTH);
			this.revalidate();
		}
		
		

		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(monsterAreap2,BorderLayout.SOUTH);
		panel2.add(spellAreap2,BorderLayout.CENTER);
		panel2.setOpaque(false);
		
	
		if(p2==Card.getBoard().getActivePlayer()){
		    sp2 = new JScrollPane(handp2);
		    sp2.setBorder(null);
			sp2.getViewport().setOpaque(false);
		    sp2.setPreferredSize(new Dimension(500,150));
			sp2.setOpaque(false);
			sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
			panel2.add(sp2,BorderLayout.NORTH);
		this.revalidate();
		}else{
			sp2 = new JScrollPane(p2hid);
			sp2.setBorder(null);
			sp2.getViewport().setOpaque(false);
			 sp2.setPreferredSize(new Dimension(500,150));
			sp2.setOpaque(false);
			sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
			panel2.add(sp2,BorderLayout.NORTH);
			this.revalidate();
		}
		
		
		JPanel panel3 = new JPanel();
		panel3.setOpaque(false);
		panel3.setLayout(null);
		panel3.add(p2name);
		panel3.add(lifep2);
		panel3.add(endturn);
		panel3.add(nextphase);
		panel3.add(lifep1);
		panel3.add(p1name);
		this.add(panel3);
		panel3.setBounds(0, 0, 200, 700);
		p2name.setBounds(2, 150, 311, 57);
		lifep2.setBounds(2, 200, 311, 57);
		endturn.setBounds(5, 300, 157, 39);
		nextphase.setBounds(5, 400, 157, 39);
		p1name.setBounds(2, 500, 311, 57);
		lifep1.setBounds(2, 550, 311, 57);
		
		
		
		imgThisImg = new ImageIcon("Cards Images Database/Card Back.png");
		description.setIcon(imgThisImg);
		
		
		
		
		
		
		
		
		
		this.add(panel1);
		panel1.setBounds(280, 380, 700, 350);
		this.add(panel2);
		panel2.setBounds(280, 0, 700, 350);
		this.add(deckp1);
		deckp1.setBounds(1277, 645, 100, 100);
		this.add(deckp2);
		deckp2.setBounds(1277,25,100,100);
		this.add(gravep1);
		gravep1.setBounds(1150, 645,62,91);
		this.add(gravep2);
		gravep2.setBounds(1150,25,62,91);
		this.add(description);
		description.setBounds(1050,140,300,438);
		this.add(currphase);
		currphase.setBounds(583, 315, 300, 100);
		
		this.validate();
		new Controller(b, this);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public ImageIcon getImgThisImg() {
		return imgThisImg;
	}

	public void setImgThisImg(ImageIcon imgThisImg) {
		this.imgThisImg = imgThisImg;
	}

	public JLabel getDescription() {
		return description;
	}

	public void setDescription(JLabel description) {
		this.description = description;
	}

public static void main(String[]args) throws IOException, UnexpectedFormatException {
		
	File audioFile = new File("pain.wav");
	boolean playCompleted = false;
	 
    try {
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

        AudioFormat format = audioStream.getFormat();

        DataLine.Info info = new DataLine.Info(Clip.class, format);

         audioClip = (Clip) AudioSystem.getLine(info);

        

        audioClip.open(audioStream);
         
        audioClip.start();
         
        audioClip.loop(100);
        
         
        //
         
    } catch (UnsupportedAudioFileException ex) {
        System.out.println("The specified audio file is not supported.");
        ex.printStackTrace();
    } catch (LineUnavailableException ex) {
        System.out.println("Audio line for playing back is unavailable.");
        ex.printStackTrace();
    } catch (IOException ex) {
        System.out.println("Error playing the audio file.");
        ex.printStackTrace();
    }
     

	
	
	
	JFrame start = new JFrame();
		start.setSize(1366, 768);
		start.setVisible(true);
		
		start.setContentPane(new JLabel(new ImageIcon("Start Game.png")));
		
		start.revalidate();
		start.setLayout(null);
		JTextField p1  =new JTextField();
		start.add(p1);
		p1.setBounds(475, 350, 400, 50);
		
		JTextField p2  =new JTextField();
		start.add(p2);
		p2.setBounds(475, 520, 400, 50);
		
		JButton startbut = new JButton(new ImageIcon("Start Button.png"));
		startbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(p1.getText().length()==0 || p2.getText().length()==0){
					JOptionPane.showMessageDialog(start, "All Fields Are Required");
				}else if (p1.getText().length()>=14 || p2.getText().length()>=14){
					JOptionPane.showMessageDialog(start, "Maximum Length for name is 14 digits");
				}else{
					start.setVisible(false);
					try {
						Gui gui = new Gui(new Player(p1.getText()), new Player(p2.getText()));
					} catch (IOException | UnexpectedFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		startbut.setBounds(510, 637, 311, 57);
		startbut.setVisible(true);
		startbut.setOpaque(true);
		startbut.revalidate();
		startbut.repaint();
		start.add(startbut);
		start.validate();
		System.out.println(p1.getText());
		//Gui gui = new Gui();
	}

	
	
}
