package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Giaotiep extends Remote {
	public void keypress(int i) throws RemoteException;

	public void keyReleased(int i) throws RemoteException;
}
