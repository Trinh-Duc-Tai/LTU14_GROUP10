
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
class Surface extends JPanel {
 
    private void doDrawing(Graphics g) {
 
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        g2d.drawLine(200, 30, 200, 200);

    }
 
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        doDrawing(g);
    }
}
 
public class TestLine extends JFrame {
 
    public TestLine() {
 
        initUI();
    }
 
    private void initUI() {
 
        add(new Surface());
 
        setTitle("Lines");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 
                TestLine ex = new TestLine();
                ex.setVisible(true);
            }
        });
    }
}
