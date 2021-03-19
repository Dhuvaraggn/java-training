package day10;

public class BuilderDemo {
	public static void main(String [] args) {
		Computer c=new Computer.ComputerBuilder("i7 process","8gb").build();
		System.out.print(c);
		Computer c1=new Computer.ComputerBuilder("i9 procees","16gb").setGraphicscard("amd radeon")
													.setHdd("1tb").build();
		System.out.print(c1);
	}
}
class Computer{
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
	public Computer(ComputerBuilder builder) {
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
	public static class ComputerBuilder{
		private String processor;
		private String ram;
		
		private String graphicscard;
		private String hdd;
		public ComputerBuilder(String p,String ram) {
			this.processor=p;
			this.ram=ram;
		}
		public final String getGraphicscard() {
			return graphicscard;
		}
		public final String getHdd() {
			return hdd;
		}
		public final ComputerBuilder setGraphicscard(String graphicscard) {
			this.graphicscard = graphicscard;
			return this;
		}
		public final ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}
	
	
}