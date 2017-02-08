import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		 MyPanelClass myPanel = new MyPanelClass();
         
		JFrame myFrame = new JFrame("Luis Rivera Marquez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(635, 305);
		myFrame.setSize(450, 450);
		myFrame.getContentPane().add(myPanel);
         
		myFrame.setVisible(true);
	}
}