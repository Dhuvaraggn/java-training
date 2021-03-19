package day9lab;

public class Ques4 {
	public static void main(String [] args) {
		suma s=new suma();
		s.fm(s);
		s.tm(s);
		s.sm(s);
		s.lm(s);
	}
}
interface first{
	public void ffunc();
}
interface sec{
	public void sfunc();
}
interface third{
	public void tfunc();
}
interface whole extends first,sec,third{
	public void lfunc();

}
class suma implements whole{
	public void fm(first f) {
		f.ffunc();
	}
	public void sm(sec s) {
		s.sfunc();
	}
	public void tm(third t) {
		t.tfunc();
	}
	public void lm(whole w) {
		w.ffunc();
	}
	@Override
	public void ffunc() {
		// TODO Auto-generated method stub
		System.out.print("first");
	}
	@Override
	public void sfunc() {
		// TODO Auto-generated method stub
		System.out.print("two");
	}
	@Override
	public void tfunc() {
		// TODO Auto-generated method stub
		System.out.print("third");
	}
	@Override
	public void lfunc() {
		// TODO Auto-generated method stub
		System.out.print("last");
	}
}