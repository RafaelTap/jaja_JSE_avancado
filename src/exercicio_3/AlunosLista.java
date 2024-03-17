package exercicio_3;

import java.util.ArrayList;
import java.util.List;

public class AlunosLista {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("45678", "João Marcos", "Programação com Java"));
		alunos.add(new Aluno("45876", "Bruna Carla", "Programação com Python"));
		alunos.add(new Aluno("45768", "Helder Câmara", "Programação com .Net"));
		alunos.add(new Aluno("45867", "Marcela Andrade", "Programação com c++"));
		alunos.add(new Aluno("45786", "Julio César", "Programação com PHP"));

		for (Aluno aluno : alunos) {
			System.out.println(aluno);

		}
	}

}
