import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import javax.swing.Timer;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class ShapeDriver extends JPanel implements KeyListener, ActionListener {
	private Timer timer;
	Random random = new Random();
	private ArrayList<Shape> myShapes = new ArrayList<Shape>(); //array list of circles

	//Constructor
	public ShapeDriver() {
		super(); 
		this.setBackground(Color.cyan); 
		Dimension myDimension = new Dimension(Constants.FRAME_HEIGHT, Constants.FRAME_WIDTH); 
		this.setPreferredSize(myDimension); 
		this.addKeyListener(this);
		this.setFocusable(true);
		timer = new Timer(1000/60, this);
		timer.start();
	} 

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		if(!myShapes.isEmpty())
			for(Shape shape : myShapes)
				shape.draw(g);
	}

	public void actionPerformed(ActionEvent e) { 
		if(!myShapes.isEmpty()) {

			for(int i = 0; i < myShapes.size(); i++) { //go through each shapes
				Shape s1 = myShapes.get(i); //create a shape variable
				Color temp = s1.getFillColor(); //save shape 1's color to a temp variable

				for(int j = i + 1; j < myShapes.size(); j++) {  //compare a shape with other shapes
					Shape s2 = myShapes.get(j); //create a second circle variable
					
					//Change directions and swap color if shapes bump with each other
					if(s1.obj.intersects(s2.obj)) {
						s1.changeDirX();
						s1.changeDirY();
						s2.changeDirX();
						s2.changeDirY();
						s1.setFillColor(s2.getFillColor());
						s2.setFillColor(temp);
					}
				}
				
				//Bounce off left/right frame if hit
				if(s1.getX() <= 0 || s1.getX() + s1.obj.width >= Constants.FRAME_WIDTH) 
					s1.changeDirX();

				//Bounce off top/bottom frame if hit
				if(s1.getY() <= 0 || s1.getY() + s1.obj.height >= Constants.FRAME_HEIGHT)
					s1.changeDirY();

				//moves shape
				s1.moveLoc(1, 1); 
			}  
		}
		
		this.repaint();
	}

	@Override
	//draw different shape when a particular key is pressed 
	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar(); //declares and sets value of variable key of type char

		Color randColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)); //creates new random color for fillColor
		int randX = random.nextInt(Constants.FRAME_WIDTH); //a random x coordinate
		int randY = random.nextInt(Constants.FRAME_HEIGHT); //a random y coordinate
		int randSize1 = random.nextInt((Constants.FRAME_WIDTH/20) + 5); //a random shape size

		if(key == 'c') //create a circle when c is pressed 
			myShapes.add(new Circle(randColor, randX, randY, randSize1, 1, 1));
		else if(key == 's') //create a square when s is pressed
			myShapes.add(new Square(randColor, randX, randY, randSize1, 1, 1));
		else if(key == 'r') { //create a rectangle when r is pressed
			int randSize2 = random.nextInt((Constants.FRAME_WIDTH/20) + 5); //a random shape size
			myShapes.add(new MyRectangle(randColor, randX, randY, randSize1, randSize2, 1, 1));
		}
		
		repaint();
	} 

	@Override
	public void keyReleased(KeyEvent e) {} //do nothing

	@Override
	public void keyTyped(KeyEvent e) {} //do nothing
}