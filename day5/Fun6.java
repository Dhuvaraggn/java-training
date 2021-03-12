package day5;
import java.io.Console;
public class Fun6 {
	public static void main(String[] arg)
{
		Console cons;
		if((cons=System.console())!=null){
			char[] password=null;
			try {
				password=cons.readPassword("input your passwordd");
				System.out.print("yr password "+ new String(password));
			}
			finally {
				if (password != null) {
					 java.util.Arrays.fill(password, ' ');
					 }
				else {
					throw new RuntimeException("Can't get password ");
				}
			}
			}
		}
	}
