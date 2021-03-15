package day5;

public class AbstractDemo {
	public static void main(String[] arg) {
		PaintBrush pb=new PaintBrush();
		pb.paint =new BluePaint();
		pb.doPaint();
		
	}

}
class PaintBrush{
	Paint paint;
	void doPaint() {
		System.out.print(paint);
	}
	
}
abstract class Paint {
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}