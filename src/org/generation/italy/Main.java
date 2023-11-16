package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		ArrayList<Integer> mazzo  = new ArrayList<>(); 
		HashSet <Integer> cartaPescate  = new HashSet <>();
		
		int carta;
		String risposta;
		
		for (int i=0; i<40; i++)
			{
			carta=r.nextInt(40)+1; //genera una carta random all'interno dei 40
			
			if (mazzo.contains(carta))
				i--;
			else
				mazzo.add(carta);
								
				
			}           // 1 parte in cui genera il mazzo
		
		////////////////////////////////////////////////////////////////////////////////
		
		for(int n:mazzo)
		{
			System.out.println("la carta è: " + n);
			System.out.println("vuoi continuare? (s/n)");
			risposta=sc.nextLine();
			if(risposta.equals("n"))
				break;
			System.out.println("il tuo punteggio è: " + n%10);
		}
		sc.close();
	
		
	}

}
