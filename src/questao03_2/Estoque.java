package questao03_2;

public class Estoque 
{

  private int qtdAtual;
  private int qtdMinima;
  private Produto produto;
  
  Estoque()
  {
   qtdAtual=0;
   qtdMinima=0;
   produto=null;
  }

  Estoque(Produto produto, int qtdAtual, int qtdMinima)
  {
   this.produto=produto;
   this.qtdAtual=qtdAtual;
   this.qtdMinima=qtdMinima;
 
  }
  
  public void mudarQtdMinima(int qMinima)
  {
	this.qtdMinima=qMinima;
  }
  public void reporEstoque(int qtd)
  {
    this.qtdAtual=qtdAtual+qtd;
  }
  public void darBaixa(int qtd)
  {
    this.qtdAtual=qtdAtual-qtd;
  }
  public void relatorio()
  {
   System.out.println("-------------------------");
   System.out.println("Produto: "+this.produto.getNome());
   System.out.println("quantidade atual: "+this.qtdAtual);
   System.out.println("quantidade minima: "+this.qtdMinima);
   System.out.println("-------------------------");
   
  }  
  
  
}
