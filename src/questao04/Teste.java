package questao04;

import java.time.LocalDate;

public class Teste {
	
	private LocalDate idade;
	
	
	public Teste(LocalDate idade) {
		super();
		this.idade = idade;
	}


	public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - idade.getYear();
    }


	public static void main(String[] args) {
		
		 Teste teste= new Teste(LocalDate.of(2000, 10, 20));
		 
		 System.out.println(teste.calcularIdade());
		

	}

}
