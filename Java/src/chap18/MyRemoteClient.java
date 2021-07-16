package chap18;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();

	}
	
	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:8888/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
