package day3;
import java.io.*;
public class Ques15 {
	public static void main(String argv[]){
        Ques15 m=new Ques15(); 
        System.out.println(m.amethod()); 
	}
	public int amethod() { 
        try {
                FileInputStream dis=new FileInputStream("Hello.txt"); 
                }catch (FileNotFoundException fne) { 
                        System.out.println("No such file found"); 
                        return -1; 
                        }catch(IOException ioe) { 
                        } finally{ 
        System.out.println("Doing finally"); 
        } 
        return 0; 
        } 

}
//Ans No such file found, Doing finally, -1 