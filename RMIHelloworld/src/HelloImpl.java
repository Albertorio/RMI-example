import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloImpl() throws RemoteException{}
	
	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			HelloImpl obj = new HelloImpl();
			//Bind this object instance to the name "HelloServer"
			Naming.bind("HelloServer", obj);
		}catch(Exception e){
			System.out.println("HelloImpl err: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
