package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
	//esercizio 3
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Scrivi la prima parola:");
		 String parola1 = sc.nextLine();
		 System.out.print("Scrivi la seconda parola:");
		 String parola2 = sc.nextLine();
		 System.out.print("Scrivi la terza parola:");
		 String parola3 = sc.nextLine();
		 sc.close();
		 
		 String ordineInserimento = parola1 + " " + parola2 + " " + parola3;
		 System.out.println("le parole in ordine di inserimento sono:" + ordineInserimento);
		 String inserimentoInverso = parola3 + " " + parola2 + " " + parola1;
		 System.out.println("se invertiamo l'ordine abbiamo:" + inserimentoInverso);
		 
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		// esercizio 1a
		System.out.println("il risultato della moltiplicazione è" + moltiplica(3,5));
		// esercizio 1b
		System.out.println(concatena("ciao dopo di me c'è un numero ", 12));
		// esercizio 1c
		String[]arrayIniziale = {"A", "B", "C", "D", "E"};
		String nuovaStr = "F";
		String[] returnArr = inserisciInArray(arrayIniziale, nuovaStr);
		System.out.println("La lunghezza del nuovo array è: " + returnArr.length);
		for (int i = 0; i < returnArr.length; i++) {
			System.out.println(i + ": " + returnArr[i]);			
		}
		// esercizio 4a 
		System.out.println("Il perimetro del rettangolo è di " + perimetroRettangolo(4.5, 6.7) + " cm");
		// esercizio 4b 
		System.out.println(pariDispari(3));
		// esercizio 4c
		System.out.println("l'area del triangolo è di " + areaTriangolo(7, 10, 12) + "cm2");
		}

public static int moltiplica ( int num1, int num2) {
	return num1*num2;
}

public static String concatena(String str, int num) {
	return str + num;
}

public static double perimetroRettangolo (double lato1, double lato2) {
	double sommaLati = lato1 + lato2;
	return (sommaLati * 2);
}

public static int pariDispari (int numero) {
	if (numero % 2 == 0) {
		return 0;
	}else {
		return 1;
	}
}

public static double areaTriangolo (double lat1, double lat2, double lat3) {
	double semiP = (lat1 + lat2 + lat3)/ 2;
	double area = Math.sqrt(semiP * (semiP - lat1)*(semiP - lat2)*(semiP - lat3));
	
	return area;
}

public static String[] inserisciInArray(String[] arrayIniziale, String nuovaStr) {
	String[] newArray = new String [6];
	newArray[0]= arrayIniziale[0];
	newArray[1]= arrayIniziale[1];
	newArray[2]= arrayIniziale[2];
	newArray[3]= nuovaStr;
	newArray[4]= arrayIniziale[3];
	newArray[5]= arrayIniziale[4];
	
	return newArray;
}

}



