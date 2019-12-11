package teamview.act;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;

import remote.Giaotiep;

public class KeyCapture implements KeyListener {

	Giaotiep gt;

	public KeyCapture(Giaotiep s) {
		gt = s;
	}
	
	// bat sự kiện nhấn phím 
	public void keyPressed(KeyEvent e) {
		
		int a = e.getKeyCode();
		try {

			if (!KeyMap.isControl(a))
				gt.type(a);
			// điều khiển qua rmi
			else
				gt.keypress(a);
			// điều khiển qua rmi
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	// bắt sự kiện nhả phím với các phím điều khiển , các phím thường không cần 
	public void keyReleased(KeyEvent e) {
		int a = e.getKeyCode();
		try {
			if (KeyMap.isControl(a))
				gt.keyReleased(a);
			// diều khiển qua rmi 
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	// khong dung đến do keypress đã thực hiện việc ghi thông tin 
	public void keyTyped(KeyEvent e) {
	}

}
