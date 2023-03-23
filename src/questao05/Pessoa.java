package questao05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa 

{
  protected String cpf;  
  protected String grupo;
  protected LocalDate dataNascimento;
  protected String pessoaNome;
  
Pessoa(String pessoaNome,LocalDate dataNascimento,String cpf)
{
 this.pessoaNome=pessoaNome;
 this.dataNascimento=dataNascimento;
 this.cpf=cpf;
}

public Pessoa() {
	super();
	
}

public long calcularIdade(LocalDate dataNascimento)
{
	
 LocalDate data1 = dataNascimento ;
 LocalDate agora = LocalDate.now();
 long intervaloDeDiasTotal = ChronoUnit.YEARS.between(data1 , agora);;
 return intervaloDeDiasTotal;
 
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getGrupo() {
	return grupo;
}

public void setGrupo(String grupo) {
	this.grupo = grupo;
}

public LocalDate getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(LocalDate dataNascimento) {
	this.dataNascimento = dataNascimento;
}

//METODO CRIADO ATRAVES DE UM ATRIBUTO CRIADO

public String getPessoaNome() {
	return pessoaNome;
}

public void setPessoaNome(String pessoaNome) {
	this.pessoaNome = pessoaNome;
}
  
}
