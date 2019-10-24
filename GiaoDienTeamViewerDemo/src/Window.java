import javax.swing.*;
import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.Scanner;

public class Window extends JFrame implements ActionListener {
	class Surface extends JPanel {
		 
	    private void doDrawing(Graphics g) {
	 
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setPaint(Color.red);
//	        g2d.drawLine(x1, y1, x2, y2);
	        g2d.drawLine(200, 30, 200, 200);
//	        g2d.drawLine(200, 30, 30, 200);
//	        g2d.drawLine(30, 200, 200, 200);
//	        g2d.drawLine(200, 200, 30, 30);
	    }
	 
	    @Override
	    public void paintComponent(Graphics g) {
	 
	        super.paintComponent(g);
	        doDrawing(g);
	    }
	}
	
    public static void main(String[] args) {
        new Window();
    }
    
    JFrame frame;
    JPanel panel;
    JTextField textYourID,textParterID,pattern,result,patternPartner;
    JLabel titlePasswordPartner,titleYourID,titlePassword,titleAllowControl,madeby,titleControlRemoteComputer,titleParterID;
    JButton btnMatch,btnLoadFile,btnClear,btnConnect,btnSave;
    String[] algorithmString = {"Boyer Moore","Knuth–Morris–Pratt"};
    JComboBox algorithmList ;
    ImageIcon img,imgBTN;
    Font f1,f2;

    public Window(){
    	add(new Surface());
//    	panel.add(new Surface());
    	f1 = new Font("Lato", Font.BOLD, 14);
    	f2 = new Font("Lato", Font.BOLD, 11);
        img = new ImageIcon("logoBK.png");
        frame = new JFrame("TeamViewer BK ");
        frame.setLayout(null);
        frame.setSize(595, 359);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIconImage(img.getImage());
        
        panel = new JPanel(null);
        panel.setBounds(0, 0, 595, 330);

        Color  color = Color.decode("#00B0FF");
        panel.setBackground(color);

        titleAllowControl = new JLabel("Allow Remote Control");
        titleAllowControl.setFont(f1);
        titleAllowControl.setBounds(40,10,400,30);
        panel.add(titleAllowControl);

        titleControlRemoteComputer = new JLabel("Control Remote Computer");
        titleControlRemoteComputer.setFont(f1);
        titleControlRemoteComputer.setBounds(330,10,400,30);
        panel.add(titleControlRemoteComputer);
//        algorithmList = new JComboBox(algorithmString);
//        algorithmList.setBounds(120,20,140,30);
//        panel.add(algorithmList);
        //Clear
        btnClear = new JButton("CLEAR");
        btnClear.setBounds(488,60,80,25);
        btnClear.setFont(f2);
        panel.add(btnClear);
        btnClear.addActionListener(this);

        titleYourID = new JLabel("Your ID:");
        titleYourID.setBounds(65, 35, 120, 40);
        panel.add(titleYourID);

        textYourID = new JTextField();
        textYourID.setBounds(65, 65, 120, 20);
        panel.add(textYourID);

        //Password
        titlePassword = new JLabel("Password:");
        titlePassword.setBounds(65, 80, 150, 40);
        panel.add(titlePassword);
        

        pattern = new JTextField();
        pattern.setBounds(65, 110, 120, 20);
        panel.add(pattern);

        //Parter ID
        titleParterID = new JLabel("Parter ID:");
        titleParterID.setBounds(345, 35, 120, 40);
        panel.add(titleParterID);

        textParterID = new JTextField();
        textParterID.setBounds(345, 65, 120, 20);
        panel.add(textParterID);
        
      //title PassPart
        titlePasswordPartner = new JLabel("Password Partner:");
        titlePasswordPartner.setBounds(345, 80, 150, 40);
        panel.add(titlePasswordPartner);
        
        patternPartner = new JTextField();
        patternPartner.setBounds(345, 115, 120, 20);
        panel.add(patternPartner);
        
        panel.add(new Surface());
        
        btnConnect = new JButton("Connect");
        btnConnect.setBounds(345,160,100,25);
        panel.add(btnConnect);
        btnConnect.addActionListener(this);
        
        btnSave = new JButton("Save");
        btnSave.setBounds(65,160,100,25);
        panel.add(btnSave);
        btnSave.addActionListener(this);
        Graphics2D g;
		g = new Graphics2D() {
			
			@Override
			public void setXORMode(Color c1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPaintMode() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFont(Font font) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setColor(Color c) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClip(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClip(Shape clip) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public FontMetrics getFontMetrics(Font f) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Font getFont() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Color getColor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Rectangle getClipBounds() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Shape getClip() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawOval(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawLine(int x1, int y1, int x2, int y2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
					Color bgcolor, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
					ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Graphics create() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void copyArea(int x, int y, int width, int height, int dx, int dy) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clipRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearRect(int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void translate(double tx, double ty) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void translate(int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void transform(AffineTransform Tx) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void shear(double shx, double shy) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTransform(AffineTransform Tx) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStroke(Stroke s) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRenderingHints(Map<?, ?> hints) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRenderingHint(Key hintKey, Object hintValue) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPaint(Paint paint) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setComposite(Composite comp) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBackground(Color color) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void scale(double sx, double sy) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rotate(double theta, double x, double y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rotate(double theta) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public AffineTransform getTransform() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Stroke getStroke() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RenderingHints getRenderingHints() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getRenderingHint(Key hintKey) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Paint getPaint() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public FontRenderContext getFontRenderContext() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public GraphicsConfiguration getDeviceConfiguration() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Composite getComposite() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Color getBackground() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void fill(Shape s) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(AttributedCharacterIterator iterator, float x, float y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(AttributedCharacterIterator iterator, int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(String str, float x, float y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(String str, int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void drawGlyphVector(GlyphVector g, float x, float y) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void draw(Shape s) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clip(Shape s) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addRenderingHints(Map<?, ?> hints) {
				// TODO Auto-generated method stub
				
			}
		};
		g.setColor(Color.red);
        g.drawLine(200, 30, 200, 200);
        
        madeby = new JLabel("Made by Tài, Thúy, Huyền");
        madeby.setBounds(430,300, 300, 20);
        panel.add(madeby);
        frame.add(panel);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==btnClear) {
            textParterID.setText("");
            patternPartner.setText("");
            
        }
        
    }
}

