package questao04;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class JavaTime {
	
public void diasUteis(LocalDate data1,LocalDate data2) {
		
		long intervaloDeDiasTotal = ChronoUnit.DAYS.between(data1 , data2);

		long sabadoEdomingo = 0;
		 
	    for (LocalDate dataP = data1 ; dataP.isBefore(data2); dataP = dataP.plusDays(1)) {
	         if (dataP.getDayOfWeek().getValue() > 5) {
	             sabadoEdomingo++;   
	     }
	     }
	     long diasDaSemanaEntre= intervaloDeDiasTotal - sabadoEdomingo;
	     System.out.println("\nO número de dias dias úteis (excluindo sábados e domingos) de: " + data1 + " a " + data2 + " é de: " + diasDaSemanaEntre+" dias.");
	
	}

public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a data no formato (YYYY-MM-DD): ");
	String dataString = scanner.nextLine();
	LocalDate data = LocalDate.parse(dataString);
	System.out.println("\nData do objeto: " + data);
	
	//----------------------------------------------------
	
	LocalDate a = LocalDate.now();
	long diasDeDifernca = a.until(data, ChronoUnit.DAYS);
	System.out.println("\nDiferença de dias entre a data: "+a+" para data: "+data+" equivale a:"+diasDeDifernca+" dias.");
	 
    //-----------------------------------------------
	
	LocalDate dataMaisDias = data.plusDays(110);
	System.out.println("\nA data:"+data+" + 110 dias é igual a: "+dataMaisDias);
	
	//--------------------------------------------
	
	LocalDate dataAgosto = data.withMonth(8);
	System.out.println("\nData com o mês modificado para agosto: "+dataAgosto);
	
	//--------------------------------------------
	
	DateTimeFormatter dataM = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String resultado= dataM.format(dataAgosto);
	System.out.println("\nData no formato dd/mm/yyyy: "+resultado);
	
	//--------------------------------------------
	
	System.out.print("\nDigite a data 1 no formato (YYYY-MM-DD): ");
	LocalDate data1 = LocalDate.parse(scanner.nextLine());

	System.out.print("Digite a data 2 no formato (YYYY-MM-DD): ");
	LocalDate data2 = LocalDate.parse(scanner.nextLine());
	
	JavaTime time = new JavaTime();
	time.diasUteis(data1, data2);
	
}
}


