package Project1;
import java.io.FileInputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class EmailImpl extends UnicastRemoteObject implements Email,Serializable{
	public EmailImpl() throws RemoteException {
		
	}
	public static void main(String [] args) throws RemoteException, MalformedURLException, AlreadyBoundException  {
		EmailImpl email=new EmailImpl();
		LocateRegistry.createRegistry(5000);
		Naming.bind("rmi://localhost:5000/service/email", email);
	}
	@Override
	public void sendEmail() throws Exception
	{
		String to="121003013@sastra.ac.in";
		String from="dhuvaraggnajithraj@gmail.com";
		String host="localhost";
		Properties p=System.getProperties();
		p.put("smtp.gmail.com", host);
		p.put("mail.smtp.port", "587");
		Session s = Session.getInstance(p, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
			    return new PasswordAuthentication("dhuvaraggnajithraj@gmail.com", "dartheinspiron");
			} 
			}); 
		try {
			//for(int i=0;i<10;i++) {
			MimeMessage msg=new MimeMessage(s);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject("ajith is hacking ur account");
			msg.setText("thank you for using this service provided by ajithraj");

	        Transport transport = s.getTransport("smtps");
	        Properties prop=new Properties();
	        prop.load(new FileInputStream("mail.properties"));
	        String mail=(String) prop.get("mail");
	        String pass=(String) prop.get("pass");
	        transport.connect("smtp.gmail.com",mail , pass);
			transport.sendMessage(msg,msg.getAllRecipients());
			//}
		}catch(MessagingException me) {
			me.printStackTrace();
			
		}
	}
}
 