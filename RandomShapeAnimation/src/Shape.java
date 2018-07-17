import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Rectangle;

abstract class Shape {
	//instance fields
	private Color fillColor;     
	private Color borderColor;     
	private Boolean isFilled;
	private int x;
	private int y;
	private int dirX;
	private int dirY;
	Rectangle obj;
	Random rand = new Random();

	//Constructors
	public Shape(Color fillColor, Color borderColor, int x, int y, int dirX, int dirY) {
		this.fillColor = fillColor;
		this.borderColor = borderColor;
		this.x = x;
		this.y = y;
		this.dirX = 1;
		this.dirY = 1;
		this.isFilled = false;
	}
	
	public Shape(Color fillColor, int x, int y, int dirX, int dirY) {
		this.fillColor = fillColor;
		this.borderColor = Color.black;
		this.x = x;
		this.y = y;
		this.dirX = 1;
		this.dirY = 1;
		this.isFilled = false;
	}
	
	public Shape(int x, int y, int dirX, int dirY) {
		this.fillColor = Color.white;
		this.borderColor = Color.black;
		this.x = x;
		this.y = y;
		this.dirX = 1;
		this.dirY = 1;
		this.isFilled = true;
	}

	//Set c to fillColor
	public void setFillColor(Color c) {
		fillColor = c; 
	} 

	//Return the object's fill color in type Color
	public Color getFillColor() {
		return fillColor;
	}
	
	//Set border color to c
	public void setBorderColor(Color c) {
		borderColor = c; 
	} 

	//Return the object's border color in type Color
	public Color getBorderColor() { 
		return borderColor;
	} 

	//Get the x value from the private Point instance field
	public int getX() { 
		return this.x;
	} 
	
	//Get the y value from the private Point instance field 
	public int getY() { 
		return this.y;
	} 
    
	//If fillColor is white returns true, else returns false 
	public boolean isFilled() {
		if(fillColor.equals(Color.white)) {
			isFilled = true;
		} else {
		isFilled = false;
		}
		return isFilled;
	} 

	//Change the direction of X to the opposite
	public void changeDirX(){
		this.dirX = dirX * -1;
	}
	
	//Change the direction of Y to the opposite
	public void changeDirY(){
		this.dirY = dirY * -1;
	}
	
	//Move location by dx and dy
	public void moveLoc(int dx, int dy) {
		this.x = this.x + (dx * dirX);
		this.y = this.y + (dy * dirY);
	}
	
	abstract void draw(Graphics g); //Draw the shapes
	abstract Rectangle getRect(); //Return a new rectangle
}
