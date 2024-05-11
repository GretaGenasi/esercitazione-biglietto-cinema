package org.italy.generation;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int eta = 0;
		int prezzo = 0;
		String giorno;
		String risposta = "s"; 
		
		
		do {
		System.out.print("Salve, inserire l'età: ");
		eta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Inserire il giorno: ");
		giorno = sc.nextLine();
		
		if (eta < 10) {
			prezzo = 0;
			
		} else if (eta>=10 && eta <14) {
			prezzo = 6;
			
		} else if (eta >= 15) {
			prezzo = 8;
			
		}
		
		if (giorno.equalsIgnoreCase("Mercoledì")) {
			prezzo = prezzo-2;
			System.out.println("L'entrata è scontata ed è di: "+prezzo + " euro");
		} else
			System.out.println("L'entrata è di: "+prezzo +" euro");
			
			System.out.println("Vuoi effettuare un'altra ricerca? (s/n)");
			risposta = sc.nextLine();
			
		} while (risposta.equalsIgnoreCase("s"));
			
		System.out.println("Grazie e arrivederci.");
		
				
		

		
		
		
		
	} //Chiusura main

}
