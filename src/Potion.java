
public class Potion extends Item {

	public void usage() {
		System.out.println("Potions may only be used when you are not at full health.\n");
	}
	public void amount() {
		System.out.println("You can hold up to 5 potions in your inventory.\n");
	}
}
