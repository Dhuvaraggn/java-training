package day16;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class ExamRmiServer extends UnicastRemoteObject implements Ques{
	List<Question> qs;
	public ExamRmiServer() throws RemoteException
	{	
	qs=new ArrayList<>();
	}
	public static void main(String[] args)throws Exception
	{
		Ques questions=(Ques) new ExamRmiServer();
		questions.push();
		LocateRegistry.createRegistry(1099);
		Naming.bind("rmi://localhost/examrmiserver/question", questions);
	}
	@Override
	public void push() {
		putQues(new Question(1,"what is ur name","ajith","raj","dar","nobody",1));
		putQues(new Question(2,"what is 2 ques","ajith","raj","dar","nobody",2));
		putQues(new Question(3,"what is 3 ","ajith","raj","dar","nobody",1));
		putQues(new Question(4,"what is four","ajith","raj","dar","nobody",1));
		putQues(new Question(5,"where are u from","trichy","tn","dar","india",1));	
	}
	@Override
	public void clearData() {
		qs.clear();
	}
	
	@Override
	public void putQues(Question q) {
	qs.add(q);
	}

	@Override
	public List<Question> getQues() {
	return qs;

	}
	@Override
	public Question display(int quesno) {
	Question q=this.qs.get(quesno);
	return q;
	}
	@Override
	public int checkQues(Ques q1, List<Question> q) throws Exception {
		int crctans=0;
		for(Question o:this.getQues()) {
			for(Question o1:q) {
				if(o1.compareTo(o)>0)
				{
					crctans++;
				}
			}
		}
		return crctans;
	}

	
}
interface Randno
{
int getRando();
}
class Rando implements Randno
{
Random r;
int size=0;
Rando(int s)
{r=new Random();
this.size=s;
}
@Override
public int getRando() {
// TODO Auto-generated method stub
return r.nextInt(size);
}

}
interface	QuesCheck
{
int crct(Question q);
}
class CheckQues implements QuesCheck
{
Question q;
CheckQues(Question q)
	{
this.q=q;
	}
@Override
public int crct(Question q) {
return q.compareTo(this.q);
}

}
interface Ques extends Remote
{
void putQues(Question q) throws Exception;
List<Question> getQues()throws Exception;
Question display(int quesno)throws Exception;
int checkQues(Ques q1,List<Question> q) throws Exception;
void clearData() throws Exception;
void push() throws Exception;
}

class Question  implements  Serializable,Comparable<Question>{
Integer quesid;
String ques;
String option1;
String option2;
String option3;
String option4;
Integer crct;
public Question(Integer q,String qu,String o1,String o2,String o3,String o4,Integer crct) {
this.quesid=q;this.ques=qu;this.option1=o1;this.option2=o2;this.option3=o3;this.option4=o4;this.crct=crct;
}
@Override
public int compareTo(Question checkQues) {

if( checkQues.quesid.equals(quesid)&&checkQues.crct.equals(crct)) {
	return 1;
}
return 0;
}
}
