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
		
		System.out.println(intKm);
		System.out.println(intEta);
		
		double price = intKm * 0.21;
		
		System.out.println(price);
	}
}
