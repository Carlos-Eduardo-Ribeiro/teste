package questao05;

import java.time.LocalDate;

public class TesteVacinaMain {

public static void main(String[] args) 
{

	Pessoa p1= new Pessoa("José Maria",LocalDate.of(1955, 10, 06),"0333787383");
	Pessoa p2= new Pessoa("Maria José ",LocalDate.of(1953, 11, 10),"3830333787");
	Pessoa p3= new Pessoa("José Silva ",LocalDate.of(1951, 10, 10),"7870333383");
	Pessoa p4= new Pessoa("Maria Silva ",LocalDate.of(1956, 12, 10),"3787303383");
	Pessoa p5= new Pessoa("Marcos Sousa",LocalDate.of(1955, 11, 10),"4949787383");
	
	Vacina v1 = new Vacina(5562,"CORONAVAC","003");
	Vacina v2 = new Vacina(5542,"OXFORD","023");
	
	RegistroVacina rv1 = new RegistroVacina(p1,v1,LocalDate.of(2021,04,22),1,"IDOSOS");
	
	RegistroVacina rv2 = new RegistroVacina(p2,v2,LocalDate.of(2021,04,25),1,"RABALHADORES DA SAÚDE");
	
	RegistroVacina rv3 = new RegistroVacina(p3,v2,LocalDate.of(2021,04,24),1,"OUTRAS PRIORIDADES");
	
	RegistroVacina rv4 = new RegistroVacina(p4,v1,LocalDate.of(2021,04,30),1,"IDOSOS");
	
	RegistroVacina rv5 = new RegistroVacina(p5,v1,LocalDate.of(2021,04,19),1,"IDOSOS");	
	
	RegistroVacina rv6 = new RegistroVacina(p5,v1,LocalDate.of(2021,04,19),2,"IDOSOS");
	
	RelacaoVacinados rv= new RelacaoVacinados();
	
	rv.adRegistro(rv1);
	rv.adRegistro(rv2);
	rv.adRegistro(rv3);
	rv.adRegistro(rv4);
	rv.adRegistro(rv5);
	rv.adRegistro(rv6);
	
	rv.relatorio();
	rv.getlistarPessoasQueNaoTomaram2aDose();
	rv.getlistarPessoasQueTomaram2aDose();	
}
}