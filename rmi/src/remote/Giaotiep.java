package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Giaotiep extends Remote {
	/**
	 * thực hiện việc nhấn 1 phím
	 * 
	 * @param i
	 *            phím cần nhấn
	 * @throws RemoteException
	 */
	public void keypress(int i) throws RemoteException;


	/**
	 * thực hiện việc nhả 1 phím
	 * 
	 * @param i
	 *            phím cần nhả
	 * @throws RemoteException
	 */
	public void keyReleased(int i) throws RemoteException;

	/**
	 * chưa cần thực hiện
	 * 
	 * @param i
	 * @throws RemoteException
	 */
	public void type(int i) throws RemoteException;

	/**
	 * di chuyển con chuột
	 * 
	 * @param x
	 *            tọa độ x của con chuột
	 * @param y
	 *            tọa độ y của con chuột
	 */
	public void move(int x, int y) throws RemoteException;


	/**
	 * lăn con chuột
	 * 
	 * @param i
	 *            số lượng nhận từ các lớp bắt sự kiện
	 */
	public void wheel(int i) throws RemoteException;


	/**
	 * lấy kích thước mà hình
	 * 
	 * @return mảng chứa chiều dài và chiều rộng của màn hình
	 * @throws RemoteException
	 */
	public int[] size() throws RemoteException;


	/**
	 * thực hiện việc kích chuột
	 * 
	 * @param a
	 *            thông tin phím chuột nào bị kích
	 * @throws RemoteException
	 */
	public void mouseclick(int a) throws RemoteException;


	/**
	 * thực hiện việc nhả phím chuột
	 * 
	 * @param a
	 *            thông tin phím chuột nào được nhả
	 * @throws RemoteException
	 */
	public void mouseReleased(int a) throws RemoteException;


}
