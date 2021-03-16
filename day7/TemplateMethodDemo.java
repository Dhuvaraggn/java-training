package day7;

public class TemplateMethodDemo {
	public static void main(String [] args) {
		Dominos dominos=new AjithPizza();
		dominos.dominosprocess();
	}
}
abstract class Dominos
{
	final public void processToCook() {							//template method part
		System.out.print("Dominos cook is ready to start cooking");
	}
	final public void processAddIngredients(){
		System.out.print("Dominos cook started adding ingredients");
	}
	final public void processPacking(){
		System.out.print("Pizza is started packaging");
	}
	final private void processAccounting() {
		System.out.print("Pizza profits and investments are calculated");
	}
	abstract void cookPizza();
	abstract void deliverPizza();
	final public void dominosprocess() { 				//template method whole
		cookPizza();
		deliverPizza();
		processAccounting();
	}
}
class AjithPizza extends Dominos{
	@Override
	public void cookPizza() {
		System.out.print("an order for pizza is given process started");
		processToCook();
		processAddIngredients();
		System.out.print("the pizza is readyy to dispatch");
	}
	@Override
	public void deliverPizza() {
		System.out.print("the pizza is ready for delivery");
		processPacking();
		System.out.print("the pizza is deliverd");
	}
}