package teamview.act;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import remote.Giaotiep;

// bắt sự kiện lăn chuột 
public class WheelCapture implements MouseWheelListener {
	Giaotiep gt;
	// class rmi

	public WheelCapture(Giaotiep s) {
		gt = s;
	}

	// bắt sự kiện lăn chuột
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		int not = e.getWheelRotation();
		// lấy tham số của con lăn chuột
		try {
			gt.wheel(not);
			// điều kiển con lăn chuột 
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

}
