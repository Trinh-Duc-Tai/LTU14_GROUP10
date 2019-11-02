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

	

	@Override
	public void keyReleased(KeyEvent e) {
		int a = e.getKeyCode();
		try {
			if (KeyMap.isControl(a))
				gt.keyReleased(a);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
