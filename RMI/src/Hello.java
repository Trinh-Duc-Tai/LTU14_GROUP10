import java.rmi.Remote;
import java.rmi.RemoteException;
//dung RMI phai co interface nay
public interface Hello extends Remote {
	public String hello(String name) throws RemoteException;
}
