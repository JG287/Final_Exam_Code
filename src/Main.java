public class Main {
	
	public static void main(String[] args) {
		
		int myNumbers = 1;
		try {
			if (myNumbers == 1)
				throw new CustomExceptionExample();
		} catch (CustomExceptionExample e) {
		}
	}
}