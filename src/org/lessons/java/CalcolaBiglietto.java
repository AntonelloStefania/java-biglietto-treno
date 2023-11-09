package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Km da percorrere: ");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		

		System.out.print("la tua eta': ");
		String strEta = in.nextLine();
		int intEta = Integer.valueOf(strEta);
				
		in.close();
		double tariffa = 0.21;
		double price = intKm * tariffa;
		
		System.out.println("il prezzo intero e'" + price + "€");
		double newPrice = 0;
		if(intEta < 18) {
			 newPrice = price * 0.8;
			
		}else if (intEta > 65) {
			 newPrice = price * 0.6;
		} else {
			 newPrice = price;
		}
		
		String formattedPrice = String.format("%.2f", newPrice);
		
		System.out.println("il prezzo del tuo biglietto e'" + formattedPrice + "€");
	}
}
