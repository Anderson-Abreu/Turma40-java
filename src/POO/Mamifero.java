package POO;

public  class Mamifero extends Animal{
	
	public void lactar()
	{
		System.out.println("Produzindo leite...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Sons Genericos");
	}
}
