import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Circle extends Shape {
	private int diameter;

	//The three constructors initialize the instance fields and sends fillColor, borderColor, x, and y to the super class constructor
	public Circle(Color fillColor, Color borderColor, int x, int y, int diameter, int dirX, int dirY) {
		super(fillColor, borderColor, x, y, dirX, dirY);
		this.diameter = diameter;
		this.obj = new Rectangle(x, y, diameter, diameter);
	}

	//Set borderColor to Black since not provided and sends fillColor, x, and y to the super class constructor
	public Circle(Color fillColor, int x, int y, int diameter, int dirX, int dirY) {
		super(fillColor, x, y, dirX, dirY);
		this.diameter = diameter;
		this.obj = new Rectangle(x, y, diameter, diameter);
	}

	//Set fillColor to white, border color to black, and sends x and y to the super class constructor
	public Circle(int x, int y, int diameter, int dirX, int dirY) {
		super(x, y, dirX, dirY);
		this.diameter = diameter;
		this.obj = new Rectangle(x, y, diameter, diameter);
	}
	
	//return the circle's diameter
	public int getDiameter() {
		return this.diameter;
	}
	
	//move location and center by dx and dy
	public void moveLoc(int dx, int dy) {
		super.moveLoc(dx, dy);
		this.obj = new Rectangle(getX() + dx, getY() + dy, diameter, diameter);
	} 
	
	//Draw circles
	void draw(Graphics g) {
		g.setColor(getFillColor());
		g.fillOval(getX(), getY(), this.diameter, this.diameter);
		g.setColor(getBorderColor());
		g.drawOval(getX(), getY(), this.diameter, this.diameter);
	} 
	
	//return rectangle object
	Rectangle getRect() {
		return this.obj;
	}
}