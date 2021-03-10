package day3;
abstract class MineBase { 
    abstract void amethod(); 
    static int i; 
}

public class Ques11 extends MineBase {
	  //void amethod() {
	//	  System.out.println("sfkjfl");
	 // }
	  public static void main(String argv[]){ 
          int[] ar=new int[5]; 
          for(i=0;i < ar.length;i++) 
                  System.out.println(ar[i]); 
          }
}
//Ans 5 0's printed also the Ques11 should declare abstract