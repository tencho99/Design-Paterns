package Decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		Burger burger = new Classic();
		burger.order();
		
		Burger burger2 = new Classic();
		Burger burgerCheese = new ClassicWCheese(burger2);
		burgerCheese.order();
		
		Burger burgerEuu = new Classic();
		Burger burgerEgg = new ClassicWEgg(burgerEuu);
		burgerEgg.order();

	}

}
