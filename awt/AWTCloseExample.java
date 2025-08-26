import java.awt.*;
import java.awt.event.*;

public class AWTCloseExample {
    public static void main(String[] args) {
        // Create Frame
        Frame f = new Frame("AWT Example - Close Button");

        // Create Button
        Button b = new Button("Click Me");
        b.setBounds(80, 100, 100, 40);
        f.add(b);

        // Frame settings
        f.setSize(300, 250);
        f.setLayout(null);

        // ✅ Add window closing behavior
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing...");
                f.dispose();      // Close window
                System.exit(0);   // End program
            }
        });

        // Show Frame
        f.setVisible(true);
    }
}
