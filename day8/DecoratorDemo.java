package day8;

public class DecoratorDemo {
	public static void main(String [] args) {	
		Food f=new Rice(new Chicken(new Mutton(new Vegfry())));				// STATIC COMPOSITION
		System.out.print("cost of food of rice and chicken"+f.cost());
	}

}
abstract class Food{									//PART WHOLE HIERARCHY 
	public abstract int cost() ;
}
abstract class VegFood extends Food{
	
}
abstract class NonVegFood extends Food{
	
}

class Rice extends VegFood{
	Food food;

	public Rice() {
		
	}
	public Rice(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food!=null) {
			return 10+food.cost();
		}
		else {
		return 10;
		}
	}
}
class Daal extends VegFood{
	Food food;

	public Daal() {
		
	}
	public Daal(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food!=null) {
			return 5+food.cost();
		}
		else {
		return 5;
		}
	}
}
class Vegfry extends VegFood{
	Food food;

	public Vegfry() {
		
	}
	public Vegfry(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food!=null) {
			return 15+food.cost();
		}
		else {
		return 15;
		}
	}
}
class Chicken extends NonVegFood{
	Food food;

	public Chicken() {
		
	}
	public Chicken(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food!=null) {
			return 20+food.cost();
		}
		else {
		return 20;
		}
	}
}
class Mutton extends NonVegFood{
	Food food;

	public Mutton() {
		
	}
	public Mutton(Food food) {
		this.food=food;
	}
	@Override
	public int cost() {
		if(food!=null) {
			return 25+food.cost();
		}
		else {
		return 25;
		}
	}
}