package exercicio_3;

public class Aluno {

	String rm;
	String nome;
	String curso;

	public Aluno(String rm, String nome, String curso) {
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Matrícula: " + rm + "\nNome: " + nome + "\nCurso: " + curso + "\n";
	}

}
