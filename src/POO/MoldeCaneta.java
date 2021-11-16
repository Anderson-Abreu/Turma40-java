package POO;

public class MoldeCaneta {
	
	// ATRIBUTOS
	
	String cor;
	private int carga;
	private boolean tampada;

	// METODOS
	
	
	public void escrever()
	{
		if(this.tampada==true)
		{
			System.out.println("Erro caneta tampada...");
		}
		else
		{
			System.out.println("Escrevendo...");
		}
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void estado()
	{
		System.out.println("A cor da caneta é: "+ this.cor);
		System.out.println("A caneta esta com a carga "+this.carga+"% completa");
		System.out.println("A caneta esta tampada? "+this.tampada);
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
}
