import java.rmi.RemoteException;

import org.apache.ws.axis2.AddServiceStub;
import org.apache.ws.axis2.AddServiceStub.Add;

public class TestOperatorClassServer {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		
		AddServiceStub helloService = new AddServiceStub();
		
		Add addNo = new Add();
		addNo.setA(10);
		addNo.setB(3);
			
		System.out.println(helloService.add(addNo).get_return());
	}

}
