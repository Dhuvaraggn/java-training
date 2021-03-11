package day4;

public class Ques13 {
	public static void main(String[] args)
{
		int stud[][]=new int[][] {{10,99,100,35,55},{100,100,100,99,97},{77,88,99,100,9}};
		System.out.print("no of students:"+stud.length);
		for(int i=0;i<stud.length;i++) {
		int sum=0;
			for(int j=0;j<stud[i].length;j++)
				
			{
				sum+=stud[i][j];
			}
			System.out.print("the student "+i+1+" total is "+ sum+"\n");
		}
}}
