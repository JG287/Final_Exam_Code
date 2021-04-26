
public class Overriding {

	public static void main(String[] args) {
		
		Item A = new Item();
		Item B = new Sword();
		Item C = new Potion();
		
		A.usage();
		A.amount();
		B.usage();
		B.amount();
		C.usage();
		C.amount();
	}
}
