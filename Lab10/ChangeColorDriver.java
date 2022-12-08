import javax.swing.JFrame;

public class ChangeColorDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("My Color Buttons");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(250, 300);
		changeColour.setVisible(true);
	}
}
    

