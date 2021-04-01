package Project1;

import java.rmi.Remote;
import java.util.Map;

public interface Pdf extends Remote {
	public void createPdf(Map m,long mt) throws Exception;
}
