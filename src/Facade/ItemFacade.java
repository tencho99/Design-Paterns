package Facade;

public class ItemFacade {

	private Item classic;
	private Item classicWCheese;
	private Item classicWEgg;

	public ItemFacade() {
		this.classic = new ItemClassic();
		this.classicWCheese = new ItemClassicWCheese();
		this.classicWEgg = new ItemClassicWEgg();
	}
	
	public void showClassic() {
		this.classic.show();
	}
	
	public void showClassicWCheese() {
		this.classicWCheese.show();
	}
	
	public void showClassicWEgg() {
		this.classicWEgg.show();
	}
}
