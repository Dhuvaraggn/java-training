package Project1;

import java.rmi.Remote;

public interface Email extends Remote{
	public void sendEmail() throws Exception;
}
