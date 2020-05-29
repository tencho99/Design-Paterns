package Facade;

public class FacadeMain {

	public static void main(String[] args) {
		ItemFacade itemFacade = new ItemFacade();
		itemFacade.showClassic();
		itemFacade.showClassicWCheese();
		itemFacade.showClassicWEgg();

	}

}
