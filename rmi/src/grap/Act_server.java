package grap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import teamview.App;

public class Act_server implements ActionListener {
	JButton start;
	JTextField tf;
	JLabel lb;
	App ap = null;
	boolean run = true;

	public Act_server(JButton a, JTextField c, JLabel d) {
		start = a;
		tf = c;
		lb = d;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (run) {
				run = false;
				if (ap == null) {
					String s=  tf.getText();
					if(s.equals("")) s="127.0.0.1";
					ap = new App(s);
					if (App.status == "ok")

					{
						lb.setText("ket noi thanh cong");
					} else {
						lb.setText("khong co ket noi");
					}
					start.setText("stop");
				}
			} else {
				ap.dispatchEvent(new WindowEvent(ap, WindowEvent.WINDOW_CLOSING));
				run = true;
				ap = null;
				System.gc();
				lb.setText("ca map can cap");
				start.setText("start");
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}

	}

}
