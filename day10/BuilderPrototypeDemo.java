package day10;

import day10.Computer.ComputerBuilder;

public class BuilderPrototypeDemo {
	public static void main(String [] args) throws Exception{
	/*	Computer c=new Computer.ComputerBuilder("i7 process","8gb").build();
		System.out.print(c);
		Computer c1=new Computer.ComputerBuilder("i9 procees","16gb").setGraphicscard("amd radeon")
													.setHdd("1tb").build();
		System.out.print(c1);
		*/
		Computer1 c=Computer1.createBuild(Computer1.ComputerBuilder1.createBuild("i7 process", "8gb").setGraphicscard("amd radeon").setHdd("1tb"));
		System.out.print(c);

		Computer1 c1=Computer1.createBuild(Computer1.ComputerBuilder1.createBuild("i9 process", "16gb").setGraphicscard("nvidia").setHdd("1tb"));
		System.out.print(c);
	}
}
class Computer1 implements Cloneable{
	private String processor;
	private String ram;
	
	private String graphicscard;
	private String hdd;
	
	public final String getProcessor() {
		return processor;
	}
	public final void setProcessor(String processor) {
		this.processor = processor;
	}
	public final String getRam() {
		return ram;
	}
	public final void setRam(String ram) {
		this.ram = ram;
	}
	public final String getGraphicscard() {
		return graphicscard;
	}
	public final void setGraphicscard(String graphicscard) {
		this.graphicscard = graphicscard;
	}
	public final String getHdd() {
		return hdd;
	}
	public final void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public Computer1(ComputerBuilder1 builder) {
		System.out.print("comp cons called");
		this.processor=builder.processor;
		this.ram=builder.ram;
		this.graphicscard=builder.graphicscard;
		this.hdd=builder.hdd;
	}
	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", ram=" + ram + ", graphicscard=" + graphicscard + ", hdd=" + hdd
				+ "]";
	}

	private static Computer1 cobj;
	synchronized static public Computer1 createBuild(ComputerBuilder1 cb) throws Exception
	{if(cobj==null) {
		cobj=new Computer1(cb);
	}
	return cobj.createClone();
	}
	
	private Computer1 createClone() throws Exception {

		return (Computer1)super.clone();
	}
	public static class ComputerBuilder1 implements Cloneable{
		private String processor;
		private String ram;
		
		private String graphicscard;
		private String hdd;
		public ComputerBuilder1(String p,String ram) {
			System.out.print("compbuildercons called");
			this.processor=p;
			this.ram=ram;
			
		}
		public final String getGraphicscard() {
			return graphicscard;
		}
		public final String getHdd() {
			return hdd;
		}
		public final ComputerBuilder1 setGraphicscard(String graphicscard) {
			this.graphicscard = graphicscard;
			return this;
		}
		public final ComputerBuilder1 setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		
		private static ComputerBuilder1 cbobj;
		synchronized static public ComputerBuilder1 createBuild(String p,String r) throws Exception
		{if(cbobj==null) {
			cbobj=new ComputerBuilder1(p,r);
			
		}
		return cbobj.createClone();
		}
		
		private ComputerBuilder1 createClone() throws Exception {
			// TODO Auto-generated method stub
			return (ComputerBuilder1)super.clone();
		}
		
	}
	
	
}

