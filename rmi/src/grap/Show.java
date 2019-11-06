package grap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import client.RMIServer;

public class Show extends JFrame implements ActionListener {
	String title ="design by:dang cong can - nhom 11";
	public static void main(String[] args) {
		new Show();
	}

	public Show() {
		this.setTitle(title);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initser();
		initclient();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnTool = new JMenu("tool");
		menuBar.add(mnTool);

		mntmClient = new JMenuItem("client");
		mnTool.add(mntmClient);
		mntmClient.addActionListener(this);
		mntmServer = new JMenuItem("server");
		mnTool.add(mntmServer);
		mntmServer.addActionListener(this);
		showser();
	}

	void showclient() {
		pserver.setVisible(false);
		pclient.setVisible(true);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(pclient, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addContainerGap().addComponent(pclient, GroupLayout.DEFAULT_SIZE,
						240, Short.MAX_VALUE)));

		getContentPane().setLayout(groupLayout);
	}

	void initclient() {
		RMIServer.init();
		pclient = new JPanel();
		JButton btnNewButton = new JButton("connect");

		JLabel lblNewLabel = new JLabel("ip : " + RMIServer.getHost());

		JLabel lblStatus = new JLabel("status");
		GroupLayout gl_pclient = new GroupLayout(pclient);
		gl_pclient.setHorizontalGroup(gl_pclient.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pclient.createSequentialGroup()
						.addGroup(gl_pclient.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pclient.createSequentialGroup().addGap(43)
										.addGroup(gl_pclient.createParallelGroup(Alignment.LEADING)
												.addComponent(lblStatus).addComponent(lblNewLabel)))
								.addGroup(gl_pclient.createSequentialGroup().addGap(123).addComponent(btnNewButton)))
						.addContainerGap(159, Short.MAX_VALUE)));
		gl_pclient.setVerticalGroup(gl_pclient.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_pclient.createSequentialGroup().addGap(44).addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE).addComponent(lblStatus)
						.addGap(46).addComponent(btnNewButton).addGap(58)));
		pclient.setLayout(gl_pclient);
		Act_client ac = new Act_client(lblStatus, btnNewButton);
		btnNewButton.addActionListener(ac);
		pclient.setVisible(false);
	}

	private void showser() {

		pclient.setVisible(false);
		pserver.setVisible(true);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(pserver, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup()
						.addContainerGap().addComponent(pserver, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)));
		getContentPane().setLayout(groupLayout);
	}

	private void initser() {

		pserver = new JPanel();
		pserver.setVisible(false);
		JLabel lblConnectToIp = new JLabel("connect to ip");

		JTextField textField = new JTextField();
		textField.setColumns(10);

		JButton btnStart = new JButton("start");

		JLabel lblStart = new JLabel("status");
		GroupLayout gl_pserver = new GroupLayout(pserver);
		gl_pserver.setHorizontalGroup(gl_pserver.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pserver.createSequentialGroup().addContainerGap()
						.addGroup(gl_pserver.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pserver.createSequentialGroup()
										.addGroup(gl_pserver.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 290,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblConnectToIp))
										.addContainerGap(68, Short.MAX_VALUE))
								.addComponent(btnStart).addGroup(gl_pserver.createSequentialGroup()
										.addComponent(lblStart).addContainerGap(315, Short.MAX_VALUE)))));
		gl_pserver.setVerticalGroup(gl_pserver.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pserver.createSequentialGroup().addContainerGap().addComponent(lblConnectToIp).addGap(18)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE).addComponent(lblStart)
						.addGap(30).addComponent(btnStart).addGap(57)));
		pserver.setLayout(gl_pserver);
		Act_server ac = new Act_server(btnStart, textField, lblStart);
		btnStart.addActionListener(ac);

	}

	private static final long serialVersionUID = 1L;
	private JMenuItem mntmClient;
	private JMenuItem mntmServer;
	private JPanel pserver;
	private JPanel pclient;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (this.getTitle().equals("design by:dang cong can - nhom 11")) {
			if (e.getSource() == mntmClient)
				showclient();
			else
				showser();
		}
	}
}
