/*
 * Name Card with Clownfish, Malaysian flag and some patterns
 * by Alina Hazirah Ramlan on 2 November 2019
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;



public class NameCard extends JFrame  {
	public NameCard(){
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void paint(Graphics h) {
    //Font and Color Settings
	
    Font school = new Font("Verdana",Font.PLAIN, 15);
    Font college = new Font("Verdana", Font.PLAIN, 13);
	Font name = new Font ("Copperplate",Font.PLAIN, 20);
	Font intro = new Font("Copperplate",Font.PLAIN, 16);
	Color bottomtext = new Color(153,0,0);
	int textxpos = 60;
	
	//Text for introduction (Name,college,etc..)
	h.setFont(name);
	h.setColor(Color.black);
	h.drawString("Alina Hazirah Ramlan", textxpos, 185);
	h.setFont(school);
	h.setColor(Color.darkGray);
	h.drawString("1st Year Student", textxpos, 210);
	h.drawString("ID no. 26001904077", textxpos, 225);
	h.setFont(college);
	h.drawString("College of Information Science and Engineering", textxpos, 240);
	h.setFont(school);
	h.drawString("Ritsumeikan University", textxpos, 255);
	h.setFont(intro);
	h.setColor(bottomtext);
	h.drawString("Malaysian", textxpos, 278);
	
	
	//Clownfish image
	
	Color nemo = new Color(255,153,51);
	/*int[]x = {70,90,120};
    int[]y = {150,100,150};
	h.drawPolygon(x,y,3);
	*/
	h.setColor(Color.black);
	h.fillOval(78, 57, 184, 76);//black outline for body
	h.fillOval(145,43,65,62);//black outline for top fin
	h.fillArc(172, 55, 123, 90,-45, 90);//black outline for tail190
	h.fillOval(257, 73, 34, 54);//black outline for back fin
	h.fillArc(148, 108, 54, 40,-35,330);//black outline for bottom fin
	
	h.setColor(nemo);
	h.fillOval(80,60,180,70);//orange body
	h.fillOval(260,75,30,50);//orange tail
	h.fillOval(155,45,47,50);//orange top fin
	h.fillArc(150, 100, 50, 43,-35,310);//orange bottom fin
	h.setColor(Color.white);
	h.fillOval(240, 85, 30, 25);//white stripe (tail)
	h.fillOval(225, 75, 32, 40);//white stripe (tail) #2
	
	h.setColor(Color.black);
	h.fillArc(260, 70, 34, 60, 135, 90);// black stripe (tail, right side)
	h.fillOval(119, 62, 36, 66);//black stripe (head, right side)
	h.fillArc(180,60,40,70,86,192);//black stripe (body,left side)
	
	h.setColor(nemo);
	h.fillArc(263, 70, 30, 60, 135, 90);//orange tail (top layer)
	
	
	h.setColor(Color.white);
	h.fillOval(185, 62, 40, 66);//white stripe (body)
	h.fillOval(115, 62, 35, 66);//white stripe (head)
	h.fillOval(182,69,30,52);//white stripe (body) #2
	
	h.setColor(Color.black);
	h.fillArc(200,65, 50, 60, -50, 100);//black stripe(tail, left side)	
	h.fillArc(206, 50, 70, 90, 135, 90);//black stripe (body, right side)
	h.fillArc(75, 60, 67, 70, -62, 124);//black stripe(head,left side)
	
	
	h.setColor(nemo);
	h.fillArc(210, 50, 60, 90, 137, 86);//orange top layer (body, right side)
	h.fillArc(200,65, 46, 60, -50, 100);//orange top layer (tail, left side)
	h.fillOval(220, 70, 20, 50);//orange layer(tail)
	h.fillArc(75, 60, 62, 70,-62,124);//orange top layer (head)
	
	h.setColor(Color.black);
    h.fillOval(160,83,36,40);//black stripe (side fin)	
    h.fillOval(100,81,10,10);//eye
    
    h.setColor(nemo);
    h.fillArc(140, 83, 50, 40, -60, 120);//orange layer (side fin)
	h.fillOval(159, 87, 32, 32);//orange layer (side fin) #2
	h.setColor(Color.white);
	h.fillOval(102, 82, 4, 4);//eye (white part)
	
	//Ritsumeikan logo
	Font ritsu = new Font("Avenir Next",Font.PLAIN,30);
	h.setFont(ritsu);
	h.setColor(bottomtext);
	h.drawString("R", 20, 235);
	
	//Malaysia Flag
	Color blueM = new Color(0,0,102);
	Color redM = new Color(204,0,0);
	h.setColor(blueM);
	h.fillRect(16, 265, 34, 20);
	//red lines
	h.setColor(redM);
	h.fillRect(34, 265, 16, 2);
	h.fillRect(34, 269, 16, 2);
	h.fillRect(34, 273, 16, 2);
	h.fillRect(16, 277, 34, 2);
	h.fillRect(16, 281, 34, 2);
	h.drawLine(16, 285, 49, 285);
	
	//white lines
	h.setColor(Color.white);
	h.fillRect(34, 267, 16, 2);
	h.fillRect(34, 271, 16, 2);
	h.fillRect(34, 275, 16, 2);
	h.fillRect(16, 279, 34, 2);
	h.fillRect(16, 283, 34, 2);
	
	//star and moon
	h.setColor(Color.yellow);
	h.fillOval(19,266,6,10);
	h.setColor(blueM);
	h.fillArc(21, 266, 10, 10, 90, 180);
	h.setColor(Color.yellow);
	h.drawLine(25, 271, 31, 271);//28,271(centre point)
	h.drawLine(28, 274, 28, 268);
	h.drawLine(26, 273, 30, 269);
	h.drawLine(26,269,30,273);
	
	//outlines
	h.setColor(Color.darkGray);
	h.drawRect(15, 264, 35, 22);
	h.setColor(Color.lightGray);
	h.drawLine(25, 260, 370, 260);
	h.drawLine(25, 194, 370, 194);
	
	//patterns
	Color pattern = new Color(51,153,255);
	h.setColor(pattern);
	int[] x1 = {14,16,22,27,370,362,367,357};
	int[] y1 = {153,140,145,149,35,43,48,38};
	
	for(int i=0; i<x1.length ; i++) {
	    h.drawRect(x1[i], y1[i], 10, 10);
	}
	h.drawLine(21,140,21,110);
	h.drawLine(38, 154, 58, 154);
	h.drawLine(372, 59, 372, 89);
	h.drawLine(337, 43, 357, 43);
	
	
	
	
	}
	
	

	public static void main(String[] args) {
		new NameCard();

	}

}
