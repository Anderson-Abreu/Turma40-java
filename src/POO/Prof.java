package POO;

public class Prof extends Pessoa {

	private String modulo;
	private double salario;
	
	public void aumento(double aum)
	{
		this.salario+=aum;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
