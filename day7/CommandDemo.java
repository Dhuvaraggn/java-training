package day7;

public class CommandDemo {
	public static void main(String [] args) {
		Tv t=new Tv();
		SetTopBox s=new SetTopBox();
		VGame v=new VGame();
		FatherNewsChannel fnc=new FatherNewsChannel(t,s,v);
		MotherSerialChannel msc=new MotherSerialChannel(t,s,v);
		FatherVgameChannel fvc=new FatherVgameChannel(t,s,v);
		UniversalRemote u=new UniversalRemote();
		u.setCommand(1, fnc);
		u.setCommand(2, msc);
		u.setCommand(3, fvc);
		u.executeCommand(1);
	}
}
class UniversalRemote{
	Command c[]=new Command[5];
	public UniversalRemote() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
		}
	}
	public void setCommand(int i,Command c) {
		this.c[i]=c;
	}
	public void executeCommand(int i) {
		this.c[i].execute();
	}
}
class DummyCommand extends Command
{
	public void execute() {
		System.out.print("this is a dummy command not initialized");
	}
}
abstract class Command{
	private Tv tv;
	private SetTopBox settopbox;
	private VGame vgame;
	public Command() {
		
	}
	public Command(Tv tv,SetTopBox settopbox,VGame vgame)
	{
		this.tv=tv;
		this.settopbox=settopbox;
		this.vgame=vgame;
	}
	public final Tv getTv() {
		return tv;
	}
	public final SetTopBox getSettopbox() {
		return settopbox;
	}
	public final VGame getVgame() {
		return vgame;
	}
	public abstract void execute();
}
class FatherNewsChannel extends Command{
	public FatherNewsChannel(Tv tv,SetTopBox settopbox,VGame vgame) {
		super(tv,settopbox,vgame);
	}
	public void execute() {
		System.out.print(" Starting father news chanenlll .................");
		getTv().tvOn();getSettopbox().newChannel();
		System.out.print("started ..........");
	}
}
class MotherSerialChannel extends Command{
	public MotherSerialChannel(Tv tv,SetTopBox settopbox,VGame vgame) {
		super(tv,settopbox,vgame);
	}
	public void execute() {
		System.out.print("starting  serial for mother ...............");
		getTv().tvOn();getSettopbox().serialChannel();
		System.out.print("started  ...............");
	}
}
class FatherVgameChannel extends Command{
	public FatherVgameChannel(Tv tv,SetTopBox settopbox,VGame vgame) {
		super(tv,settopbox,vgame);
	}
	public void execute() {
		System.out.print("starting vgame mode in tv");
		getTv().tvOn();getVgame().playTennis();
		System.out.print("started games ......");
	}
}
class Tv{
	public void tvOn(){
		System.out.print("tv is on. ................");
	}
	public void tvOff() {
		System.out.print("tv is off..............");
	}
}
class SetTopBox{
	public void newChannel() {
		System.out.print("started dispaly news channel");
	}
	public void serialChannel() {
		System.out.print("started display serial channel");
	}
}
class VGame{
	public void playTennis() {
		System.out.print("welcome to play tennis ...........");
	}
}