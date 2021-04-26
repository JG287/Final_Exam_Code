
public class Generics<T> {

	private T examples;

	public Generics(T examples) {

		this.examples = examples;
	}

	public T showExamples() {

		return examples;
	}
}

class GenericsExample {
	
	public static void main(String[] args) {
		
		Generics<Integer> I = new Generics<>(7);
		Generics<String> S = new Generics<>("Seven");
		Generics<Double> D = new Generics<>(7.0);
		Generics<Character> Ch = new Generics<>('S');
		Generics<Boolean> B = new Generics<>(true);
		System.out.println(I.showExamples());
		System.out.println(S.showExamples());
		System.out.println(D.showExamples());
		System.out.println(Ch.showExamples());
		System.out.println(B.showExamples());
	}
}