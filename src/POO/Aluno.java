package POO;

public class Aluno extends Pessoa {

	//ATRIBUTOS
	
	private int mat;
	private String curso;
	
	//METODOS
	
	public void atividade()
	{
		System.out.println("Atividade entregue com sucesso!!!");
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
