package teamview.act;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import remote.Giaotiep;

public class MoveCapture implements MouseMotionListener {
	int h, w;
	Giaotiep gt;
	JPanel jp;

	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		int p = x * w / jp.getWidth(), q = y * h / jp.getHeight();
		try {
			gt.move(p, q);
			Thread.sleep(15);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		int p = x * w / jp.getWidth(), q = y * h / jp.getHeight();
		try {
			gt.move(p, q);
			Thread.sleep(15);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
