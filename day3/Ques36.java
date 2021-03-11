package day3;

public class Ques36 {
	public static void main(String argv[]){ 
	    Ques36 e=new Ques36(); 
	    }
	Ques36(){ 
	    String s="Java"; 
	    String s2="java"; 
	    //if(s==s2){
	    //if(s.equals(s2)) {
	    if(s.equalsIgnoreCase(s2)) {
	    //if(s.noCaseMatch(s2)) {
	    System.out.println("Equal"); 
	        }else 
	        { 
	        System.out.println("Not equal"); 
	        }
	     } 
}
