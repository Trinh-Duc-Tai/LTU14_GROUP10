package teamview;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import remote.Giaotiep;

public class GetRmi {

	/**
	 * lấy class rmi từ bên client 
	 * @param s địa chỉ ip 
	 * @return remote object 
	 */
	public static Giaotiep get(String s) {
		try {
			Registry registry;
			registry = LocateRegistry.getRegistry(s, 8888);
			Giaotiep c = (Giaotiep) registry.lookup("Hello");
			System.out.println("tao thanh cong");
			return c;
		} catch (Exception e) {
			return null ;
		}
	}

}
