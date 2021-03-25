package day13;

import java.util.Set;
import java.util.TreeSet;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Assignment {
	public static void main(String [] args) {
		List<Question> questions=new ArrayList<>();
		questions.add(new Question(1,"what is ur name","ajith","raj","dar","nobody",1));
		questions.add(new Question(2,"what is 2 ques","ajith","raj","dar","nobody",2));
		questions.add(new Question(3,"what is 3 ","ajith","raj","dar","nobody",1));
		questions.add(new Question(4,"what is four","ajith","raj","dar","nobody",1));
		questions.add(new Question(5,"where are u from","trichy","tn","dar","india",1));
		List<Question> attempted=new ArrayList<>();
		Random r=new Random();
		LocalDateTime now=LocalDateTime.now();
		LocalDateTime end=now.plus(1,ChronoUnit.MINUTES);
		Scanner s=new Scanner(System.in);
		Set<Integer> rand=new HashSet<>();
		while(!LocalDateTime.now().isAfter(end))
		{
			int quesno=r.nextInt(questions.size());
			if(!rand.contains(quesno))
			{rand.add(quesno);
			Question q=questions.get(quesno);
			System.out.println(q.ques);
			System.out.println("options");
			System.out.println("1 "+q.option1);
			System.out.println("2 "+q.option2);
			System.out.println("3 "+q.option3);
			System.out.println("4 "+q.option4);
			System.out.print("enter the option no : ");
			int ans=s.nextInt();
			attempted.add(new Question(q.quesid,q.ques,q.option1,q.option2,q.option3,q.option4,ans));
			}
			else if(rand.size()<questions.size()) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.print("timeout");
		int crctans=0;
		for(Question o:questions) {
			for(Question o1:attempted) {
				if(o1.compareTo(o)>0)
				{
					crctans++;
				}
			}
		}
		System.out.println("no of question attempted: "+attempted.size()+" no of crct answers: "+crctans);
	}
}
interface Questiontype
{
	void crct(Questiontype q);
}
class Question implements Comparable<Question>{
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
	public int compareTo(Question o) {

		if( o.quesid.equals(quesid)&&o.crct.equals(crct)) {
			System.out.print("q");
			return 1;
		}
		return 0;
	}
}