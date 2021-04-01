package Project1;

import java.rmi.Remote;

public interface Sms extends Remote {
	public void sendSms() throws Exception;
}	
