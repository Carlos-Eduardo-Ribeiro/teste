package questao05;

public class Vacina 

{
 private int codigo;
 private String nome;
 private String lot;

Vacina(int codigo,String nome,String lot)
{
 this.codigo=codigo;
 this.nome=nome;
 this.lot=lot;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getLot() {
	return lot;
}

public void setLot(String lot) {
	this.lot = lot;
}

}