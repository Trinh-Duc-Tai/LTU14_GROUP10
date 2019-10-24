import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {
	public static void main(String[] args) {
		try {
			Hello hello = (Hello) Naming.lookup("rmi://localhost:5000/hello");
			
			System.out.println(hello.hello("Trinh Duc Tai"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
 