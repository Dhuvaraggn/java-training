package day12;

public class GenericDemo {
	public static void main(String [] args) {
		PaintBrush<Paint> p=new PaintBrush();
		//p.p=new RedPaint();	
		p.setObj(new RedPaint());
		p.doPaint();
		//WaterContainer w=new WaterContainer();
		//w.w=new Water();
		//w.take();
		
		PaintBrush<Water> p1=new PaintBrush();
		p1.setObj(new Water());
		p1.doPaint();
	}
}

class PaintBrush<T>	{
	//Paint p;
	//Object obj;	//generic
	
	//real generic 
	T obj;
	
	public final T getObj() {
		return obj;
	}

	public final void setObj(T obj) {
		this.obj = obj;
	}

	public void doPaint() {
		System.out.print(obj);
	}
}
class WaterContainer{
	Water w;
	public void take() {
		System.out.print(w);
	}
}
class Water{
	
}
abstract class Paint
{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}