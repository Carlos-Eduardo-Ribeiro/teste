package questao03_2;

public class Produto 
{
  private String tipoDoMaterial;
  private String nome;
  private String codigo;
  private Estoque Estoque;
   
  Produto()
  {
	codigo="";
    nome="";
    tipoDoMaterial="";
	  
  }
  Produto(String codigo,String nome)
  {
	this.codigo=codigo;
    this.nome=nome;
  }
   
  public void mudarNome(String nome)
  {
    this.nome=nome;
  }
  //----------------------
  public String getNome()
  {
   return this.nome;
  }

	
}
