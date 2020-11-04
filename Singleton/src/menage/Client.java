package menage;

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
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import core.AbstractFactory;
import core.BMW;
import core.BMWFactory;
import core.Fiat;
import core.FiatFactory;
import core.Mercedes;
import core.MercedesFactory;


public class Client extends JPanel implements MouseListener{
	
	BufferedImage background=null;
	BufferedImage end=null;
	boolean fine=false;
	
	public Client() {
		try {
			background=ImageIO.read(getClass().getResource("/Immagini/background.jpg"));
			end=ImageIO.read(getClass().getResource("/Immagini/fine.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		JButton fiatModello1=new JButton("Fiat Berlina");
		fiatModello1.setFocusable(false);
		JButton fiatModello2=new JButton("Fiat Station wagon");
		fiatModello2.setFocusable(false);
		
		
		JButton bmwModello1=new JButton("BMW Berlina");
		bmwModello1.setFocusable(false);
		JButton bmwModello2=new JButton("BMW Station wagon");
		bmwModello2.setFocusable(false);
		
		
		JButton mercedesModello1=new JButton("Mercedes Berlina");
		mercedesModello1.setFocusable(false);
		JButton mercedesModello2=new JButton("Mercedes Station wagon");
		mercedesModello2.setFocusable(false);
		
		JLabel content = new JLabel();
		
		
		fiatModello1.setFont(new Font("Courier", Font.ITALIC, 15));
		fiatModello2.setFont(new Font("Courier", Font.ITALIC, 15));
		
		
		bmwModello1.setFont(new Font("Courier", Font.ITALIC, 15));
		bmwModello2.setFont(new Font("Courier", Font.ITALIC, 15));
		
		mercedesModello1.setFont(new Font("Courier", Font.ITALIC, 15));
		mercedesModello2.setFont(new Font("Courier", Font.ITALIC, 15));
		
		
		fiatModello1.setBackground(Color.yellow);
		fiatModello2.setBackground(Color.yellow);
		
		bmwModello1.setBackground(Color.white);
		bmwModello2.setBackground(Color.white);
		
		mercedesModello1.setBackground(Color.gray);
		mercedesModello2.setBackground(Color.gray);
		
		content.setLayout(new GridLayout(3,1,3,50));
		
		content.add(fiatModello1);
		content.add(fiatModello2);
		
		content.add(bmwModello1);
		content.add(bmwModello2);
		
		content.add(mercedesModello1);
		content.add(mercedesModello2);
		
		this.setLayout(null);
		this.add(content);
		content.setBounds(200,100,500,200);
		
		fiatModello1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				//prima dela creazione di ogni fabbrica che si susseguira vado ad impostare la classe di inizializzazione
				//utilizzando la metodologia singleton
				
				AbstractFactory.init("core.FiatFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				Fiat fiat = (Fiat) factory.create(1200, 5, "berlina");
				fiat.caratteristiche();
				content.setText(fiat.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.yellow);
				repaint();
			}
		});

		fiatModello2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				AbstractFactory.init("core.FiatFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				Fiat fiat = (Fiat) factory.create(3200, 5, "station wagon");
				fiat.caratteristiche();
				content.setText(fiat.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.yellow);
				repaint();
			}
		});

		
		bmwModello1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				AbstractFactory.init("core.BMWFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				BMW bmw = (BMW) factory.create(5200, 5, "berlina");
				bmw.caratteristiche();
				content.setText(bmw.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.white);
				repaint();
			}
		});

		bmwModello2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				AbstractFactory.init("core.BMWFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				BMW bmw = (BMW) factory.create(7200, 5, "station wagon");
				bmw.caratteristiche();
				content.setText(bmw.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.white);
				repaint();
			}
		});

		
		mercedesModello1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				AbstractFactory.init("core.MercedesFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				Mercedes mercedes = (Mercedes) factory.create(8200, 5, "berlina");
				mercedes.caratteristiche();
				content.setText(mercedes.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.RED);
				repaint();
			}
		});

		mercedesModello2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				content.remove(mercedesModello1);
				content.remove(mercedesModello2);
				content.remove(bmwModello1);
				content.remove(bmwModello2);
				content.remove(fiatModello1);
				content.remove(fiatModello2);
				
				fine =true;
				
				AbstractFactory.init("core.MercedesFactory");
				AbstractFactory factory = AbstractFactory.getInstance();
				Mercedes mercedes = (Mercedes) factory.create(10200, 5, "station wagon");
				mercedes.caratteristiche();
				content.setText(mercedes.toString());
				content.setFont(new Font("Courier", Font.ITALIC, 20));
				content.setBounds(50,25,1100,200);
				content.setForeground(Color.RED);
				repaint();
			}
		});

	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 1200, 1200, this);
		
		if(fine)
			g.drawImage(end, 0, 0, 1200, 1200, this);
		
			
			
	}
		
	public static void main(String[] args) {
		Client c=new Client();
		AbstractFactory factory;
			
		JFrame frame=new JFrame("Automobili Da Mario");
			
		frame.add(c);
		frame.addMouseListener(c);
		Dimension dimensioni_finestra=new Dimension(1200,1200);
		frame.setPreferredSize(dimensioni_finestra);
		frame.setResizable(false);
			
		frame.pack();
		frame.setVisible(true);
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
