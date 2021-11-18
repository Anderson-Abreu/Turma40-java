package POO;

public class CriarSeres {

	public static void main(String[] args) {
		Mamifero a = new Mamifero();
		Cachorro c = new Cachorro();
		Gato g =new Gato();
		
		a.emitirSom();
		g.emitirSom();
		c.emitirSom();
		c.agir(false);
		c.agir(23);
		
	}

}
