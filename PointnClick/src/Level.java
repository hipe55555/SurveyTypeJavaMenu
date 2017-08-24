import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Level {
	static Boolean hasTicked = false;
	static Boolean hasTickedp = false;
	static Boolean hasTickedm = false;
	static Boolean hasTickedt = false;
	static Boolean hasTickedd = false;
	public static void run(){

		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		JTextField t1 = new JTextField("");
		t1.setFont(font1);
		JTextField t2 = new JTextField("");
		t2.setFont(font1);
		JTextField t3 = new JTextField("");	
		t3.setFont(font1);
		JTextField t4 = new JTextField("");
		t4.setFont(font1);
		JButton b7 = new JButton("7");
		ImageIcon bp7 = new ImageIcon("src/pic/number7.png");
		b7.setIcon(bp7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "7");		
				}else{
					t3.setText(t3.getText() + "7");	
				}
			}			
		});
		JButton b8 = new JButton("8");
		ImageIcon bp8 = new ImageIcon("src/pic/number8.png");
		b8.setIcon(bp8);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "8");		
				}else{
					t3.setText(t3.getText() + "8");	}			
			}			
		});

		JButton b9 = new JButton("9");
		ImageIcon bp9 = new ImageIcon("src/pic/number9.png");
		b9.setIcon(bp9);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "9");		
				}else{
					t3.setText(t3.getText() + "9");		}			
			}			
		});

		JButton b4 = new JButton("4");
		ImageIcon bp4 = new ImageIcon("src/pic/number4.png");
		b4.setIcon(bp4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "4");		
				}else{
					t3.setText(t3.getText() + "4");		}		
			}			
		});

		JButton b5 = new JButton("5");
		ImageIcon bp5 = new ImageIcon("src/pic/number5.png");
		b5.setIcon(bp5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "5");		
				}else{
					t3.setText(t3.getText() + "5");		}		
			}			
		});

		JButton b6 = new JButton("6");
		ImageIcon bp6 = new ImageIcon("src/pic/number6.png");
		b6.setIcon(bp6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "6");		
				}else{
					t3.setText(t3.getText() + "6");	}			
			}			
		});

		JButton b1 = new JButton("1");
		ImageIcon bp1 = new ImageIcon("src/pic/number1.png");
		b1.setIcon(bp1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "1");		
				}else{
					t3.setText(t3.getText() + "1");	}
			}			
		});

		JButton b2 = new JButton("2");
		ImageIcon bp2 = new ImageIcon("src/pic/number2.png");
		b2.setIcon(bp2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "2");		
				}else{
					t3.setText(t3.getText() + "2");	}			
			}			
		});

		JButton b3 = new JButton("3");
		ImageIcon bp3 = new ImageIcon("src/pic/number3.png");
		b3.setIcon(bp3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "3");		
				}else{
					t3.setText(t3.getText() + "3");		}			
			}			
		});

		JButton bp = new JButton("+");
		ImageIcon bpp = new ImageIcon("src/pic/number+.png");
		bp.setIcon(bpp);
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				t2.setText("+");	
				hasTicked = true;
				hasTickedp = true;
				hasTickedm = false;
				hasTickedt = false;
				hasTickedd = false;
			}			
		});	
		JButton bm = new JButton("_");
		ImageIcon bpm = new ImageIcon("src/pic/number-.png");
		bm.setIcon(bpm);
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				t2.setText("-");
				hasTicked = true;
				hasTickedm = true;
				hasTickedp = false;
				hasTickedt = false;
				hasTickedd = false;
			}			
		});		
		JButton bt = new JButton("*");
		ImageIcon bpt = new ImageIcon("src/pic/numberx.png");
		bt.setIcon(bpt);
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				t2.setText("*");
				hasTicked = true;
				hasTickedm = false;
				hasTickedp = false;	
				hasTickedt = true;
				hasTickedd = false;
			}
		});	

		JButton bd = new JButton("/");
		ImageIcon bpd = new ImageIcon("src/pic/numberd.png");
		bd.setIcon(bpd);
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				t2.setText("/");
				hasTicked = true;
				hasTickedm = false;
				hasTickedp = false;	
				hasTickedt = false;
				hasTickedd = true;
			}
		});			
		JButton be = new JButton("=");
		ImageIcon bpe = new ImageIcon("src/pic/number=.png");
		be.setIcon(bpe);
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				hasTicked = false;
				if(hasTickedp){
					int t11 = Integer.parseInt(t1.getText());
					int t33 = Integer.parseInt(t3.getText());
					t4.setText(t11 + t33 + "");
				}else if(hasTickedm){
					int t11 = Integer.parseInt(t1.getText());
					int t33 = Integer.parseInt(t3.getText());
					t4.setText(t11 - t33 + "");
				}else if(hasTickedt){
					double t11 = Double.parseDouble(t1.getText());
					double t33 = Double.parseDouble(t3.getText());
					t4.setText(t11 * t33 + "");
				}else{
					double t11 = Double.parseDouble(t1.getText());
					double t33 = Double.parseDouble(t3.getText());
					t4.setText(t11 / t33 + "");
				}
				hasTicked = false;
				t1.setText("");
				t2.setText("");
				t3.setText("");
				hasTickedp = false;
				hasTickedm = false;
				hasTickedt = false;
				hasTickedd = false;
			}			
		});	
		JButton b0 = new JButton("0");
		ImageIcon bp0 = new ImageIcon("src/pic/number0.png");
		b0.setIcon(bp0);
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(hasTicked != true){
					t1.setText(t1.getText() + "0");		
				}else{
					t3.setText(t3.getText() + "0");		}			
			}			
		});

		f.setLayout(new GridLayout(0, 1));
		p.setLayout(new GridLayout(3, 4));
		p2.setLayout(new GridLayout(0, 4));
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		p2.add(t4);
		f.add(p2);
		f.add(p);
		//Beginning of calculator
		p.add(b7);
		p.add(b8);	
		p.add(b9);
		p.add(bp);
		p.add(bt);
		//Top row of calculator
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(bd);
		//second row of calculator
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b0);
		p.add(be);
		//last row of calculator
		f.setSize(1920, 1080);
		f.setResizable(true);
		f.setTitle("FRESHSTART, COME GET YOUR FRESH START");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}




}
