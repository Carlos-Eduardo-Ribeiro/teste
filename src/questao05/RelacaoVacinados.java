package questao05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelacaoVacinados {
	
 private List<RegistroVacina>vacinados;
 private RegistroVacina RV;
 
 RelacaoVacinados()
{
 vacinados=new ArrayList(); 
}
 
 public void adRegistro(RegistroVacina registro)
{
 vacinados.add(registro);
}
 //---------------------------
 
 public  int gettVAcimaDaIdade()
{
 int total=0;
 
 for(RegistroVacina a : vacinados)
 {
  long dataP=a.getPessoa().calcularIdade(a.getPessoa().dataNascimento);
  if(dataP > 65 && a.getDose()!=2) {
  total++;
 }
 }
 return total;
}
public int  gettotalPessoasQueNãoTomaram2aDose()
{
 int totalND2=0;
 
 for(RegistroVacina a : vacinados)
 {
  if(a.getDose()!=2) {totalND2++;}
  if(a.getDose()==2) {totalND2--;}
 }
 return totalND2;
}

public int gettotalPessoasQueTomaram2aDose()
{ 
 int totalD2=0;
 for(RegistroVacina a : vacinados)
  {
  if( a.getDose() == 2) {totalD2++;}
  }
  return totalD2;
}

public void getlistarPessoasQueTomaram2aDose()
{ 
 String tb="\t";
 int i=0;
 System.out.println("--------------------------------------------------------------------");
 System.out.printf("|          --LISTA DE PESSOAS QUE TOMARAM A 2a DOSE--              |\n");
 System.out.println("--------------------------------------------------------------------");
 System.out.println("NOME"+tb+tb+" |"+" VACINA");
 System.out.println("--------------------------------------------------------------------");
 for(RegistroVacina a : vacinados)
 {
  if( a.getDose() == 2&&a.getPessoa().getPessoaNome()!=null) 
  {
   System.out.println(a.getPessoa().getPessoaNome()+tb+" | "+a.getVacina().getNome());i++;
  }
 }
   if(i==0) {System.out.println("Nenhuma pessoa foi vacinada com a segunda dose.");}
   System.out.println("--------------------------------------------------------------------\n");
}
public void getlistarPessoasQueNaoTomaram2aDose()
{ 
 String tb="\t";
 System.out.println("--------------------------------------------------------------------");
 System.out.println("|        --LISTA DE PESSOAS QUE NÃO TOMARAM A 2a DOSE--"+"            |");
 System.out.println("--------------------------------------------------------------------");
 System.out.println("NOME"+tb+tb+" | "+"DATA PARA INDICADA PARA 2A DOSE"+" |"+" VACINA");
 System.out.println("--------------------------------------------------------------------");
 for(RegistroVacina a : vacinados)
  {
   if( a.getDose() == 1)
   { 
   LocalDate dataMais21= a.getData_vacinacao().plusDays(21);
   DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
   
   String resultado =formatado.format(dataMais21);
   System.out.println(a.getPessoa().getPessoaNome()+tb+" |"+tb+tb+tb+resultado+" "+"| "+a.getVacina().getNome());
   }
 }
 System.out.println("--------------------------------------------------------------------\n");
}

public void relatorio() {
	   String tb="\t";
	   System.out.println("-------------------------------------------------------------------");
	   System.out.printf("CPF"+tb+tb+" | "+" NOME   "+tb+" |"+" IDADE "+"|"+" Data Indicada p. 2a Dose\n");
       System.out.println("-------------------------------------------------------------------");
	   for(RegistroVacina a : vacinados) 
	   {
	   long dataP=a.getPessoa().calcularIdade(a.getPessoa().dataNascimento);
	   if(a.getDose() == 1) 
	    {   	
		LocalDate dataMais21= a.getData_vacinacao().plusDays(21);
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		String resultado =formatado.format(dataMais21);
	    System.out.println(a.getPessoa().getCpf()+tb+" | "+a.getPessoa().getPessoaNome()+tb+" |  "+" "+dataP+tb+" | "+tb+tb+resultado);
	    }  
	   }
	    System.out.println("--------------------------------------------------------------------");
	    System.out.println("Total de vacinados acima de 65 anos: "+gettVAcimaDaIdade());
	    System.out.println("Total de vacinados que não tomaram a 2a. dose: "+gettotalPessoasQueNãoTomaram2aDose());
	    System.out.println("Total de vacinados que tomaram a 2a. dose: "+gettotalPessoasQueTomaram2aDose());
	    System.out.println("--------------------------------------------------------------------\n");
	}

public List<RegistroVacina> getVacinados() {
	return vacinados;
}

public void setVacinados(List<RegistroVacina> vacinados) {
	this.vacinados = vacinados;
}

//RV

public RegistroVacina getRV() {
	return RV;
}

public void setRV(RegistroVacina rV) {
	RV = rV;
}


}