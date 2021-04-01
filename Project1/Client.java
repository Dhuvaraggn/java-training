package Project1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {
	public static void main(String [] args) throws Exception {
		Controller controller=(Controller)Naming.lookup("rmi://localhost:2000/service/controller");
		System.out.print(controller);
		Object object=controller.getDynamicObject(controller);
		Sms t=(Sms)object;
		t.sendSms();
		System.out.print(t);
		Excel e=(Excel)object;
		System.out.print(e);
		Email em=(Email)object;
		em.sendEmail();
		System.out.print(em);
		Pdf p=(Pdf)object;
		System.out.print(p);
		/*BillPayment billpay=(BillPayment)object;
		billpay.payBill(100);
		NumberPortability np=(NumberPortability)object;
		np.portNumber(94923749, "jio");
		AddService ads=(AddService)object;
		ads.changeAddress(new Address());*/
	}
}
