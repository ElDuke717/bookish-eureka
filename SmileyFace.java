import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class SmileyFace extends Canvas {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new SmileyFace();
        canvas.setSize(200, 200);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics c) {
        // Draw the outline of the face
        c.setColor(Color.YELLOW);
        c.fillOval(50, 50, 100, 100);  // Change coordinates and size as needed

        // Draw the eyes
        c.setColor(Color.BLACK);
        c.fillOval(85, 75, 10, 10);    // Left Eye
        c.fillOval(105, 75, 10, 10);   // Right Eye

        // Draw the mouth
        c.drawArc(75, 75, 50, 50, 0, -180);  // Smiling mouth
    }
}
