package remote;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Giaotiep extends Remote , Serializable{
	public void keypress(int i) throws RemoteException ;

	public void keyReleased(int i) throws RemoteException;

	public void type(int i) throws RemoteException;
	
}
