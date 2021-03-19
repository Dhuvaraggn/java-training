package day9lab;

public class Ques2 {
	public static void main(String [] args) {
			Circle c=new Circle(5);
			c.area();
			c.perimeter();
			
	}
}
class Circle implements calculate{
	int r;
	public Circle(int r) {
		this.r=r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.print(3.14*r*r);
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.print("");
	}

	@Override
	public void surfacearea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.print(2*3.14*r);
	}
	
}
interface calculate{
	public void area();
	public void volume();
	public void surfacearea();
	public void perimeter();
}

/*
class Circle implements calculate{

	@Override
	public float calcarea(int r, int b) {
		// TODO Auto-generated method stub
		return  (float)(2*3.14*r);
	}

	@Override
	public float calcvolume(int r, int b, int h) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcperimeter(int r, int b) {
		// TODO Auto-generated method stub
		return (float)3.14*r*r;
	}

	@Override
	public float surfacearea(int r) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class Rectangle implements calculate{

	@Override
	public float calcarea(int r, int b) {
		// TODO Auto-generated method stub
		return  (float)(r*b);
	}

	@Override
	public float calcvolume(int r, int b, int h) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcperimeter(int r, int b) {
		// TODO Auto-generated method stub
		return (float)(2*(r+b));
	}

	@Override
	public float surfacearea(int r) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class Sphere implements calculate{

	@Override
	public float calcarea(int r, int b) {
		// TODO Auto-generated method stub
		return  (float)(3.14*r*r);
	}

	@Override
	public float calcvolume(int r, int b, int h) {
		// TODO Auto-generated method stub
		return (float)(2*3.14*r);
	}

	@Override
	public float calcperimeter(int r, int b) {
		// TODO Auto-generated method stub
		return (float)(4*3.14*r*r);
	}

	@Override
	public float surfacearea(int r) {
		// TODO Auto-generated method stub
		return (float)((4/3)*3.14*r*r);
	}
	
}
interface calculate{
	public float calcarea(int r,int b);
	public float calcvolume(int r,int b,int h);
	public float calcperimeter(int r,int b);
	public float surfacearea(int r);
}*/