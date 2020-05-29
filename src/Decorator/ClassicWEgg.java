package Decorator;

public class ClassicWEgg extends BurgerDecorator {
	
	public ClassicWEgg(Burger dBurger) {
		super(dBurger);
	}
	
	public void order() {
		dBurger.order();
		setBurgerType(dBurger);
	}
	
	private void setBurgerType(Burger dBurger) {
		System.out.println("Adding egg to classic burger");//NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO eggs + burger = mistake
		
	}

}
