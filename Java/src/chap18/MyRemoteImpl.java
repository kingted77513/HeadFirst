package chap18;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException { }

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

	public static void main(String[] args) {
		
		try {
			MyRemote service = new MyRemoteImpl();
			LocateRegistry.createRegistry(8888);
			Naming.bind("rmi://localhost:8888/RemoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
