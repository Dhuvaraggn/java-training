package day9;

import java.util.Scanner;

public class ExceptionHandleDemo {
	public static void main(String[] args) throws Exception {
		Child c=new Child();
		Dog d=new Dog();
		System.out.print("enter the item");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.print(str);
		Item i=(Item) Class.forName("day9.StoneItem").getConstructor().newInstance();
		c.playDog(d, i);
	}
}
class Dog
{
	public void play(Item item) throws DogException {
		item.execute();
	}
}
abstract class DogException extends Exception
{
	public abstract void exchand(Handler h);
}
class DogBiteException extends DogException
{
	
	public DogBiteException() {
		System.out.print("dog bite exception called.........");	
	}

	@Override
	public void exchand(Handler h) {
		h.handle(this)
	}
}
class DogBarkException extends DogException
{

	public DogBarkException() {
		System.out.print("dog bark exception called");
	}

	@Override
	public void exchand(Handler h) {
		h.handle(this);
	}
}
abstract class Item					//strategy pattern
{
	public abstract void execute() throws DogException;
}
class StickItem extends Item{
	public StickItem() {
		
	}
	@Override
	public void execute() throws DogException{
		throw new DogBiteException();
		
	}
	
}
class StoneItem extends Item{
	public StoneItem() {}
	@Override
	public void execute() throws DogException {
		throw new DogBarkException();
	}
	
}	
class Child
{
	public void playDog(Dog d,Item item)  {
		try {
		d.play(item);
		}
		catch(DogException de){
			de.exchand(new Handlerimp());
		}
	}
}

interface Handler{
	public abstract void handle(DogBarkException dbe);
	public abstract void handle(DogBiteException dbi);
}
class Handlerimp implements Handler{
	public void handle(DogBarkException dbe) {
		System.out.print("handle for dog bark");
	}
	public void handle(DogBiteException dbi) {
		System.out.print("handle for dog bite");
	}
}