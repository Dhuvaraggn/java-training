package day4;

public class Ques40 {
	public static void main(String[] args) {
		Result r=new Result("ajith",1,100,100,100);
		System.out.print(r.totalmark);
	}
}
class Student{
	String name;
	int rollno;
	public Student(String s,int r) {
		name=s;
		rollno=r;
	}
	
}
class Exam extends Student{
	int p;
	int m;
	int c;
	public Exam(String s,int r,int p,int c,int m) {
		super(s,r);
		this.p=p;
		this.c=c;
		this.m=m;
	}
	
}
class Result extends Exam{
	int totalmark;
	void calc() {
		totalmark=p+m+c;
	}
	public Result(String s,int r,int p,int c,int m) {
		super(s,r,p,c,m);
		calc();
	}
}