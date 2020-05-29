package Decorator;

public class ClassicWCheese extends BurgerDecorator {

	public ClassicWCheese(Burger dBurger) {
		super(dBurger);
	}
	
	public void order() {
		dBurger.order();
		setBurgerType(dBurger);
	}
	
	private void setBurgerType(Burger dBurger) {
		System.out.println("Adding cheese to classic burger");
		
	}
}
