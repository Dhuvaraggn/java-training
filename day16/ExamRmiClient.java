package day16;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExamRmiClient {
	public static void main(String [] args) throws Exception {
		Ques questions=(Ques)Naming.lookup("rmi://localhost/examrmiserver/question");
		//attempted.clearData();
		List<Question> attempted=new ArrayList<>();
		Randno r=new Rando(questions.getQues().size());
		try {
		LocalDateTime now=LocalDateTime.now();
		LocalDateTime end=now.plus(1,ChronoUnit.MINUTES);
		Scanner s=new Scanner(System.in);
		Set<Integer> rand=new HashSet<>();
		int count=0;
		while(!LocalDateTime.now().isAfter(end))
		{
			int quesno=r.getRando();
			if(!rand.contains(quesno))
			{rand.add(quesno);
			Question q=questions.display(quesno);
			System.out.println(count);
			count++;
			System.out.println(q.ques);
			System.out.println("options");
			System.out.println("1 "+q.option1);
			System.out.println("2 "+q.option2);
			System.out.println("3 "+q.option3);
			System.out.println("4 "+q.option4);
			System.out.print("enter the option no : ");
		
			int ans=s.nextInt();
			Question qa=q;
			qa.crct=ans;
			attempted.add(qa);
			}
			else if(rand.size()<questions.getQues().size()) {
				continue;
			}
			else {
				break;
			}
		}
		int c=questions.checkQues(questions, attempted);
		System.out.print("no of crct answer"+c);
		System.out.print("timeout");
		}catch(Exception e) {System.out.print(e);}
	}
	
}
