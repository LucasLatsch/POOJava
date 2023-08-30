package br.com.poo.outralista;

import java.math.BigDecimal;

public class BalancoTrimestral {

	public static void main(String[] args) {
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
		
		Integer gastosTrimestre = Integer.sum(gastosJaneiro, gastosFevereiro);
		gastosTrimestre = Integer.sum(gastosTrimestre, gastosMarco);
		System.out.println("O valor total de gasto do primeiro trimestre é: " + gastosTrimestre);
		
		Double gastosJaneiroD = 15000.00;
		Double gastosFevereiroD = 23000.00;
		Double gastosMarcoD = 17000.00;
		
		Double gastosTrimestreD = Double.sum(gastosJaneiroD, gastosFevereiroD);
		gastosTrimestreD = Double.sum(gastosTrimestreD, gastosMarcoD);
		System.out.println("O valor total de gasto do primeiro trimestre é: " + gastosTrimestreD);
		
		BigDecimal gastosJaneiroBD = new BigDecimal("15000.00");
		BigDecimal gastosFevereiroBD = new BigDecimal("23000.00");
		BigDecimal gastosMarcoBD = new BigDecimal("17000.00");
		
		BigDecimal gastosTrimestreBD = gastosJaneiroBD.add(gastosFevereiroBD).add(gastosMarcoBD);
		System.out.println("O valor total de gastos do primeiro trimestre é: " + gastosTrimestreBD.toString());
	
	
	}
}
