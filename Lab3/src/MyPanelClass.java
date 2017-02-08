import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right-1 ;
                        int y2 = getHeight() - myInsets.bottom-1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.PINK);
                        g.fillRect(x1, y1, width+1, height+1);
                        //Added Rectangles
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                        g.setColor(Color.BLUE);
                        g.drawRect(x1+5, y1+5, width-10, height-10);
                        
                        //Added Lines
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.BLACK);
//                        g.drawLine(width, myInsets.top, myInsets.left, height);
//                        
                        //Added Oval
                        g.setColor(Color.BLACK);
                        g.fillOval(width/2,height/2,55,55);
                        
            }
}