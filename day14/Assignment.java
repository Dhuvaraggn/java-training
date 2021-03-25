package day14;


import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Assignment {
	public static void main(String [] args) {
		//List<Question> questions=new ArrayList<>();
		//questions.add(new Question(1,"what is ur name","ajith","raj","dar","nobody",1));
		Ques questions=new Questions();
		questions.putQues(new Question(1,"what is ur name","ajith","raj","dar","nobody",1));
		questions.putQues(new Question(2,"what is 2 ques","ajith","raj","dar","nobody",2));
		questions.putQues(new Question(3,"what is 3 ","ajith","raj","dar","nobody",1));
		questions.putQues(new Question(4,"what is four","ajith","raj","dar","nobody",1));
		questions.putQues(new Question(5,"where are u from","trichy","tn","dar","india",1));
		//List<Question> attempted=new ArrayList<>();
		Ques attempted=new Questions();
		Randno r=new Rando(questions.getQues().size());
		LocalDateTime now=LocalDateTime.now();
		LocalDateTime end=now.plus(1,ChronoUnit.MINUTES);
		Scanner s=new Scanner(System.in);
		Set<Integer> rand=new HashSet<>();
		while(!LocalDateTime.now().isAfter(end))
		{
			int quesno=r.getRando();
			if(!rand.contains(quesno))
			{rand.add(quesno);
			Question qa=questions.display(quesno);
			attempted.putQues(qa);
			}
			else if(rand.size()<questions.getQues().size()) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.print("timeout");
		int crctans=0;
		for(Question o:questions.getQues()) {
			for(Question o1:attempted.getQues()) {
				if(o1.compareTo(o)>0)
				{
					crctans++;
				}
			}
		}
		System.out.println("no of question attempted: "+attempted.getQues().size()+" no of crct answers: "+crctans);
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
interface Ques
{
	void putQues(Question q);
	List<Question> getQues();
	Question display(int quesno);
}
class Questions implements Ques
{
	List<Question> qs;
	public Questions()
	{
	 qs=new ArrayList<>();
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
		System.out.println(q.ques);
		System.out.println("options");
		System.out.println("1 "+q.option1);
		System.out.println("2 "+q.option2);
		System.out.println("3 "+q.option3);
		System.out.println("4 "+q.option4);
		System.out.print("enter the option no : ");
		Scanner s=new Scanner(System.in);
		int ans=s.nextInt();
		Question qa=q;
		qa.crct=ans;
		return qa;
	}
	
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
	public int compareTo(Question checkQues) {

		if( checkQues.quesid.equals(quesid)&&checkQues.crct.equals(crct)) {
			System.out.print("q");
			return 1;
		}
		return 0;
	}
}
