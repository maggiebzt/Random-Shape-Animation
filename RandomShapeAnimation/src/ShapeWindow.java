import javax.swing.JFrame;

public class ShapeWindow extends JFrame {
 
	JFrame frame;
	
	//Constructor
    public ShapeWindow() {
        super();
        frame = new JFrame(); //create frame
        frame.setTitle(Constants.TITLE); //set frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set application to exit when frame is closed
        
        ShapeDriver component = new ShapeDriver(); //creates panel
        frame.add(component); //adds panel to frame
        frame.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT); //sets frame's size
    }
    
    //set panel and frame to be visible
    public void run() {
        frame.setVisible(true); 
    }

    public static void main(String[] args) {
        ShapeWindow shapeWindow = new ShapeWindow(); 
        shapeWindow.run();
    }
}