package Project1;

import java.rmi.Remote;
import java.util.Map;

public interface Excel extends Remote {
	public void intoExcel(Map m,long mt) throws Exception;
	public void readExcel() throws Exception;
}
