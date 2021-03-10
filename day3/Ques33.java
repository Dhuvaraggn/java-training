package day3;

public class Ques33 implements Runnable{ 
		  int i=0; 
		  public int run(){ 
		         while(true){ 
		                i++; 
		                System.out.println("i="+i); 
		            } //End while
		     return 1;
		     }//End run 
		}//End class
}
//ans int run is wrong void run should be