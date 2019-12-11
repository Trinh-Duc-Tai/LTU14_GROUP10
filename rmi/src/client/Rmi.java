package client;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

import remote.Giaotiep;

//lớp cài đặt rmi để thực hiện điều khiển 
public class Rmi implements Giaotiep {
	Robot robo;
	int h, w;
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec;
	protected static boolean run = true;

	public Rmi(Dimension dim) {
		try {
			robo = new Robot();
			h = dim.height;
			w = dim.width;
			rec = new Rectangle(dim);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Rmi() {
		try {
			robo = new Robot();
			h = dim.height;
			w = dim.width;
			rec = new Rectangle(dim);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// thực hiện nhấn phím
	public void keypress(int i) throws RemoteException {
		if (run)
			robo.keyPress(i);
	}

	// nha phim
	public void keyReleased(int i) throws RemoteException {
		// TODO Auto-generated method stub
		if (run)
			robo.keyRelease(i);

	}

	// viết 1 ký tự ra ngoài
	public void type(int code) throws RemoteException {
		// TODO Auto-generated method stub
		if (run)
			robo.keyPress(code);
		if (run)
			robo.keyRelease(code);
	}

	public void move(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		if (run)
			robo.mouseMove(x, y);
		// BufferedImage screenFullImage = robo.
	}

	public void wheel(int i) throws RemoteException {
		if (run)
			robo.mouseWheel(i);

	}

	/**
	 * lấy kích thước màn hình
	 */
	public int[] size() throws RemoteException {
		int[] k = new int[2];
		k[0] = w;
		k[1] = h;
		return k;
	}

	public void mouseclick(int a) throws RemoteException {
		/*
		 * để thực hiện chính xác việc phím nào bị nhấn thì cần so sánh với các sự kiện
		 * trong MouseEvent và lấy ra các sự kiện BUTTON_DOWN_MASK tương ứng
		 */
		if (run) {
			if (a == MouseEvent.BUTTON1)
				robo.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
			else if (a == MouseEvent.BUTTON2)
				robo.mousePress(MouseEvent.BUTTON2_DOWN_MASK);
			else if (a == MouseEvent.BUTTON3)
				robo.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
		}
	}

	public void mouseReleased(int a) throws RemoteException {
		if (run) {
			if (a == MouseEvent.BUTTON1)
				robo.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
			else if (a == MouseEvent.BUTTON2)
				robo.mouseRelease(MouseEvent.BUTTON2_DOWN_MASK);
			else if (a == MouseEvent.BUTTON3)
				robo.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);
		}
	}

}
