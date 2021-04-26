class OverloadingMethods {
	
	public void characterInfo(int age) {
		
		System.out.println(age);
	}

	public void characterInfo(int age, String height) {
		
		System.out.println(age + " " + height);
	}

	public void characterInfo(int age, String height, String name) {
		
		System.out.println(age + " " + height + " " + name);
	}
}
public class Overloading {
	
	public static void main(String[] args) {
		
		OverloadingMethods NPC = new OverloadingMethods();
		
		NPC.characterInfo(17);
		NPC.characterInfo(17, "72 inches");
		NPC.characterInfo(17, "72 inches", "Vladek Spiegelman");
	}
}