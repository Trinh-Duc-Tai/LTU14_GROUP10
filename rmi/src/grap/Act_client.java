package grap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import client.RMIServer;

public class Act_client implements ActionListener {

	JLabel status;
	JButton bt;
	boolean op = true;

	public Act_client(JLabel a, JButton c) {
		status = a;
		bt = c;
		
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (op) {
				RMIServer.Run();
				op = false;
				status.setText("status: bat dau ket noi");
				bt.setText("disconnect");
			} else {
				RMIServer.stop();
				op=true;
				status.setText("status: ngat ket noi");
				bt.setText("connect");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
