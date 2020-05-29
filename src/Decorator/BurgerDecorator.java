package Decorator;

public abstract class BurgerDecorator implements Burger {

	protected Burger dBurger;
	
	public BurgerDecorator(Burger dBurger) {
		this.dBurger = dBurger;
	}
	
	@Override
	public void order() {
		this.dBurger.order();
	}

}
