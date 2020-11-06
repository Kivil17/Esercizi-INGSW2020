package menage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import core.MyStrega;
import core.MyZombie;
import core.MyZucca;
import core.OggettiHalloween;

public class Client extends JPanel implements MouseListener{

static int posX,posY;
	
	static boolean okStrega=false, okZucca=false, okZombie=false;
	static int cont=0;
	
	static BufferedImage background=null;
	static BufferedImage s=null;
	static BufferedImage zu=null;
	static BufferedImage zo=null;
	
	static JButton buttonStrega;
    static JButton buttonZucca;
    static JButton buttonZombie;
	
	static OggettiHalloween ohStrega = new MyStrega();
	static OggettiHalloween ohZucca = new MyZucca();
	static OggettiHalloween ohZombie = new MyZombie();
	
	public Client() {
		try {
			background=ImageIO.read(getClass().getResource("/Immagini/halloween-background-with-ball-moon-photography-backdrop_1024x1024.jpg"));
			s=ImageIO.read(getClass().getResource("/Immagini/strega2.png"));
			zu=ImageIO.read(getClass().getResource("/Immagini/zucca2.png"));
			zo=ImageIO.read(getClass().getResource("/Immagini/zombie2.png"));
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		buttonStrega.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					OggettiHalloween ohCloned = (MyStrega) ohStrega.clone();
					ohCloned.draw();
					posX=ohCloned.getX();
					posY=ohCloned.getX();
					okStrega=true;
					repaint();
					
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
        
		buttonZucca.addActionListener(new ActionListener() {
							
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					OggettiHalloween ohCloned = (MyZucca) ohZucca.clone();
					ohCloned.draw();
					posX=ohCloned.getX();
					posY=ohCloned.getX();
					okZucca=true;
					repaint();
					
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

	buttonZombie.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				OggettiHalloween ohCloned = (MyZombie) ohZombie.clone();
				ohCloned.draw();
				posX=ohCloned.getX();
				posY=ohCloned.getX();
				okZombie=true;
				repaint();
				
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	});
   

	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, 1650, 1080, this);
		
		if (okStrega)
			g.drawImage(s, posX, posY, this);
		else if (okZombie)
			g.drawImage(zo, posX, posY, 1200, 1200, this);
		else if (okZucca)
			g.drawImage(zu, posX, posY, 1200, 1200, this);
		
		okStrega=false;
	}
		
	public static void main(String[] args) {
		
		JToolBar toolBar = new JToolBar();
	    populateIconToolBar(toolBar);
		
	    Client c=new Client();
		JFrame frame=new JFrame("Paesaggio Halloween");
			
		frame.add(c);
		frame.addMouseListener(c);
		Dimension dimensioni_finestra=new Dimension(1650,1080);
		frame.setPreferredSize(dimensioni_finestra);
		frame.setResizable(false);
		frame.getContentPane().add(toolBar, BorderLayout.WEST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void populateIconToolBar(JToolBar toolBar) {
        try {
        	buttonStrega = new JButton("Strega");
		    buttonZucca = new JButton("Zucca");
		    buttonZombie = new JButton("Zombie");
		    
		    toolBar.add(buttonStrega);
		    toolBar.add(buttonZucca);
		    toolBar.add(buttonZombie);
        } catch (Exception ex) {
                ex.printStackTrace();
        }
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
