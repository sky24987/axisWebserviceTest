package DefaultNamespace;

import java.rmi.RemoteException;

public class test {
	public static void main(String a[]){
		SayHelloProxy say = new SayHelloProxy();
		try {
			System.out.println(say.say());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
