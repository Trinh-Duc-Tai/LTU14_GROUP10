package client;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.Socket;

import javax.imageio.ImageIO;

public class Screen implements Runnable  {
	int port = 6677;
	String host = "localhost";
	static boolean run = true;
	Robot rb;
	int frame = 15;

	public static void main(String[] args) {
		Screen sc = new Screen();
		new Thread(sc).start();

	}

	public Screen() {
		try {
			rb = new Robot();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void run() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		// tạo đối tượng dismension chứa thông tin về kích thước màn hình
		Rectangle rec = new Rectangle(dim);
		// khởi tạo đối tượng Rectangle 
		int sleep = 1000 / 15;
		int h = dim.height / 2;
		int w = dim.width / 2;
		while (run) {
			try {
				Socket s = new Socket(host, port);
				// tao socket kết nối đến máy điều khiển
				BufferedImage image = rb.createScreenCapture(rec);
				// tạo image từ class robo 
				Image im = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
				// thu nho image lai voi kich thuoc = 1/2
				image=cv(im);
				// chuyen doi BufferefImage thành image
				// do BufferefImage khong implements Serializable nen khong the gui duoc 
				ImageIO.write(image, "png", s.getOutputStream());
				// gui anh với luồng ra lấy từ socket 
				try {
					Thread.sleep(sleep);
				} catch (Exception e) {
				}

				s.close();

			} catch (Exception e) {

			}
		}

	}

	public static BufferedImage cv(Image im) {
		BufferedImage bi = new BufferedImage(im.getWidth(null), im.getHeight(null), BufferedImage.TYPE_INT_RGB);
		Graphics bg = bi.getGraphics();
		bg.drawImage(im, 0, 0, im.getWidth(null), im.getHeight(null), null);
		bg.dispose();
		return bi;
	}

}
