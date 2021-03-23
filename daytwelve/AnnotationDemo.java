package daytwelve;

import java.lang.reflect.Field;

public class AnnotationDemo {
	public static void main(String [] args) throws Exception {
		PaintBrush1<Paint1> brush=PaintContainer1.getPaintBrush();
		Paint1 p=(Paint1)brush.obj;
		System.out.print(brush.getObj());
		
		PaintBrush1<Water1> wbrush=WaterContainer1.getPaintBrush();
		Water1 w=(Water1)wbrush.getObj();
		System.out.print(w+""+wbrush.getObj());
	}
}
class PaintBrush1<T>	{
	//Paint p;
	//Object obj;	//generic
	
	//real generic 
	
	@InAnnotation//("helloWorld")
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

class PaintContainer1{
	public static PaintBrush1<Paint1> getPaintBrush() throws Exception{
		PaintBrush1<Paint1> pb=new PaintBrush1<>();
		Paint1 obj=new RedPaint1();
		//pb.setObj(obj);		//dependency injection
		
		Field f=pb.getClass().getDeclaredField("obj");
		f.setAccessible(true);
		InAnnotation in=f.getAnnotation(InAnnotation.class);
		if(in!=null) {
			String s=in.value();
			System.out.print(s+"\n");
			pb.setObj(obj); // dependency injection
		}
		
		return pb;
	}
}
class WaterContainer1{
	public static PaintBrush1<Water1> getPaintBrush() throws Exception{
		PaintBrush1<Water1> pb=new PaintBrush1<>();
		Water1 obj =new Water1();
		//pb.setObj(obj);		//dependency injection
		
		Field f=pb.getClass().getDeclaredField("obj");
		f.setAccessible(true);
		InAnnotation in=f.getAnnotation(InAnnotation.class);
		if(in!=null) {
			pb.setObj(obj);
		}
		return pb;
	}
}
class Water1{
	
}
abstract class Paint1
{
	
}
class RedPaint1 extends Paint1{
	
}
class BluePaint1 extends Paint1{
	
}