package questao05;

import java.time.LocalDate;

public class RegistroVacina extends Pessoa{
	
 private String id;
 private LocalDate data_vacinacao;
 private String atendante;
 private int dose;
 private String local;
 private Vacina vacina;
 private Pessoa pessoa;
 
 RegistroVacina()
 {
  super();
 }
 RegistroVacina(Pessoa pessoa, Vacina vacina,LocalDate data_vacinacao,int dose,String grupo) 
 {
  this.vacina=vacina;
  this.pessoa=pessoa;
  this.id=id;
  this.data_vacinacao=data_vacinacao;
  this.atendante=atendante;
  this.dose=dose;
  this.grupo=grupo;
		
 }
//METODOS
 
public RegistroVacina(Object setDose) {
	
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public LocalDate getData_vacinacao() {
	return data_vacinacao;
}
public void setData_vacinacao(LocalDate data_vacinacao) {
	this.data_vacinacao = data_vacinacao;
}
public String getAtendante() {
	return atendante;
}
public void setAtendante(String atendante) {
	this.atendante = atendante;
}
public int getDose() {
	return dose;
}
public void setDose(int dose) {
	this.dose = dose;
}
public String getLocal() {
	return local;
}
public void setLocal(String local) {
	this.local = local;
}
public String getGrupo() {
	return grupo;
}

public void setGrupo(String grupo) {
	this.grupo = grupo;
}

public Vacina getVacina() {
	return vacina;
}

public void setVacina(Vacina vacina) {
	this.vacina = vacina;
}
//--------------------------------------

public Pessoa getPessoa() {
	return pessoa;
}

public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}

}

