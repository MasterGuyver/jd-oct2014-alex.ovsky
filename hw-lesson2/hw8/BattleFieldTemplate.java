/*
 * Copyright (c) 2014 kademika.com
 */
package hw8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	
	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	int tankDirection=1;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 10;
	String[][] battleField = {{"","","","","","","","",""},
							  {"B","B","B","","","","B","B","B"},
							  {"","","B","B","B","B","","",""},
							  {"","","","","","","B","B","B"},
							  {"B","B","B","B","B","B","B","B","B"},
							  {"","B","B","B","B","","","",""},
							  {"B","B","","B","","","","",""},
							  {"","","","","","B","","B","B"},
							  {"B","","B","","B","","","",""}};
	
	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {
		movetoQuadrant(1,3);
		movetoQuadrant(2,5);
		movetoQuadrant(5,1);
			}
	String getQuadrant(int v,int h) {
		return (v-1)*64+"_"+(h-1)*64;
		}
	void turn(int direction) {
		tankDirection = direction;
	}
	void move(int direction) throws Exception {
		int step = 1;
		int covered = 0;
		
		turn(direction);
		
		while(covered<64) {
		if(direction == 1) {
			if(tankY - step >= 0) tankY -= step; 
		} 
		else if(direction == 2) {
			if(tankY + step <= 512) tankY += step;
		}
		else if(direction == 3) {
			if(tankX - step >= 0) tankX -= step;
		}
		else if(direction == 4) {
			if(tankX + step <=512) tankX += step;
		}
		covered+=step;
		repaint();
		Thread.sleep(speed);		}
	}
	void moveRandom() throws Exception {
		while(true) {
		String gen = String.valueOf(System.currentTimeMillis());
		int len = gen.length();
		int d;
		while(len>=2) {
		  len--;	
		  d = Integer.parseInt(gen.substring(len-1,len));
		  if(d>=1 && d<=4) { move(d);}
		  Thread.sleep(speed);
	}
	}
	}
	void movetoQuadrant(int v, int h) throws Exception {
		String coordinats = getQuadrant(v,h);
		int x = Integer.parseInt(coordinats.substring(0,coordinats.indexOf('_')));
		int y = Integer.parseInt(coordinats.substring(coordinats.indexOf('_')+1,coordinats.length()));
		System.out.println(x+":"+y);
		while(tankX < x) {
			move(4);
			Thread.sleep(speed);
		}
		while(tankY < y) {
			move(2);
			Thread.sleep(speed);
		}
		while(tankX > x) {
			move(3);
			Thread.sleep(speed);
		}
		while(tankY > y) {
			move(1);
			Thread.sleep(speed);
		}
	}
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}
