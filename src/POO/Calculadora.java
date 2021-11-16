package POO;

public class Calculadora {

	public static void main(String[] args) {
		
		Sobrecarga calcula = new Sobrecarga();
		
		System.out.println(calcula.soma(5,10));
		System.out.println(calcula.soma(15,20,10));
		System.out.println(calcula.soma(1.8,3.5));
	}

}
