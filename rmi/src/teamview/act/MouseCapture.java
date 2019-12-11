package teamview.act;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import remote.Giaotiep;

// bắt các sự kiện click chuột 
public class MouseCapture implements MouseListener {
	Giaotiep gt;
	// class rmi dung để điều khiển

	public MouseCapture(Giaotiep s) {
		gt = s;
	}

	// bắt sự kiện nhấn chuột
	public void mouseClicked(MouseEvent e) {
		try {
			gt.mouseReleased(e.getButton());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	// bắt sự kiện nhả chuột
	public void mouseReleased(MouseEvent e) {
		try {
			gt.mouseReleased(e.getButton());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	// bắt sự kiện nhấn chuột
	public void mousePressed(MouseEvent e) {
		try {
			gt.mouseclick(e.getButton());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void mouseEntered(MouseEvent e) {

		// khong can thiet

	}

	public void mouseExited(MouseEvent e) {
		// khong can thiet

	}

}
