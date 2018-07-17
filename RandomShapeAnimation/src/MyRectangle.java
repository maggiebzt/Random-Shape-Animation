import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MyRectangle extends Shape {
	private int length;
	private int width;

	//Constructors
	public MyRectangle(Color fillColor, Color borderColor, int x, int y, int length, int width, int dirX, int dirY) {
		super(fillColor, borderColor, x, y, dirX, dirY);
		this.length = length;
		this.width = width;
		this.obj = new Rectangle(x, y, width, length);
	} 

	public MyRectangle(Color fillColor, int x, int y, int length, int width, int dirX, int dirY) {
		super(fillColor, x, y, dirX, dirY);
		this.length = length;
		this.width = width;
		this.obj = new Rectangle(x, y, width, length);
	}

	public MyRectangle(int x, int y, int length, int width, int dirX, int dirY) {
		super(x, y, dirX, dirY);
		this.length = length;
		this.width = width;
		this.obj = new Rectangle(x, y, width, length);
	}
	
	//Draw rectangles
	void draw(Graphics g) {
		g.setColor(getFillColor());
		g.fillRect(getX(), getY(), this.width, this.length);
		g.setColor(getBorderColor());
		g.drawRect(getX(), getY(), this.width, this.length);
	}
	
	//Return rectangle object
	Rectangle getRect() {
		return this.obj;
	}
	
	//move location and center by dx and dy
	public void moveLoc(int dx, int dy) {
		super.moveLoc(dx, dy);
		this.obj = new Rectangle(getX() + dx, getY() + dy, width, length);
	} 
}