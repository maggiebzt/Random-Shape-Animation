import java.awt.Color;

public class Square extends MyRectangle {
	
	//The three constructors initialize the instance fields and sends fillColor, borderColor, x, and y to the super class constructor
	public Square(Color fillColor, Color borderColor, int x, int y, int side, int dirX, int dirY) {
		super(fillColor, borderColor, x, y, side, side, dirX, dirY);
	} 

	//Set borderColor to Black since not provided and sends fillColor, x, and y to the super class constructor
	public Square(Color fillColor, int x, int y, int side, int dirX, int dirY) {
		super(fillColor, x, y, side, side, dirX, dirY);
	}

	//Set fillColor to white and border color to black and sends x and y to the super class constructor
	public Square(int x, int y, int side, int dirX, int dirY) {
		super(x, y, side, side, dirX, dirY);
	}
}