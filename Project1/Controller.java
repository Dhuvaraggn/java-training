package Project1;

import java.rmi.Remote;

public interface Controller extends Remote{
	public Object getDynamicObject(Controller p) throws Exception;
}
