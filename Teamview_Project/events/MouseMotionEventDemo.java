package events;

/*
 * MouseMotionEventDemo.java
 *
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

import javax.swing.*;

public class MouseMotionEventDemo extends JPanel implements MouseMotionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6113212665095948095L;
	BlankArea blankArea;
	JTextArea textArea;
	static final String NEWLINE = System.getProperty("line.separator");

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {

			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	

	public MouseMotionEventDemo() {
		super(new GridLayout(0, 1));
		blankArea = new BlankArea(Color.YELLOW);
		add(blankArea);

		textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(200, 75));

		add(scrollPane);

		// Register for mouse events on blankArea and panel.
		blankArea.addMouseMotionListener(this);
		addMouseMotionListener(this);

		setPreferredSize(new Dimension(450, 450));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}

	void eventOutput(String eventDescription, MouseEvent e) {
		textArea.append(eventDescription + " (" + e.getX() + "," + e.getY() + ")" + " detected on "
				+ e.getComponent().getClass().getName() + NEWLINE);
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public void mouseMoved(MouseEvent e) {
		eventOutput("Mouse moved", e);
	}

	public void mouseDragged(MouseEvent e) {
		eventOutput("Mouse dragged", e);
	}
}