package Project1;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsImpl extends UnicastRemoteObject implements Sms,Serializable {
	public SmsImpl()  throws RemoteException{
	}
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    //public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String ACCOUNT_SID ="AC10d4834c174535bedcda0ec701cfb36c";
    //public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
	public static final String AUTH_TOKEN ="7ab271f3dac8cce427a479fd94e47974";
    public static void main(String[] args) throws Exception {
        SmsImpl sms=new SmsImpl();
       // sms.sendSms();
        LocateRegistry.createRegistry(6000);
        Naming.bind("rmi://localhost:6000/service/sms", sms);
       
    }
	@Override
	public void sendSms() throws Exception {
		System.out.print("nsg started");
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+917904123779"),  
               new com.twilio.type.PhoneNumber("+15188325309"),
        		"podaaaaa ppppppppppppppppppppppp")
            .create();

        System.out.println(message.getSid());
        System.out.print("sent");
	}
}