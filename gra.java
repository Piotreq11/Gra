package main;

import java.util.Random;
import java.util.Scanner;

public class Gra {

	private Scanner s;
	private Scanner s2;
	private static Scanner s3;
	public static void main(String[]args) {
		Gra g = new Gra();
		s3 = new Scanner(System.in);
		System.out.println("Chcesz zagrac w gre? ");
		String gra = s3.next();
		if(gra.equalsIgnoreCase("tak")) {
			g.gra(args);
		}else if(gra.equalsIgnoreCase("nie")){
			g.koniec(args);
		}
	}
	public void gra(String[]args) {
		Gra g = new Gra();
		s2 = new Scanner(System.in);
		Random rand = new Random();
		@SuppressWarnings("unused")
		int liczba = rand.nextInt(100);
		int strzal = -1;
		int strzaly = 0;
		System.out.println("Wymyslilem liczbe, zgadnij ja: ");
		int random = rand.nextInt(100);
		strzal = s2.nextInt();
		if(strzal != 1) {
			
		}
		while(strzal!=random) {
			if(strzal<0) {
				System.out.println("Panie, gramy do 0");
				strzaly = strzaly +1;
				strzal = s2.nextInt();
			}
			if(strzal>100) {
				System.out.println("No troche przestrzeliłeś kolego, gramy do 100");
				strzaly = strzaly +1;
				strzal = s2.nextInt();
			}
			if(strzal<random) {
				System.out.println("Wieksza");
				strzaly = strzaly +1;
				strzal = s2.nextInt();
			}else {
				System.out.println("Mniejsza");
				strzaly = strzaly +1;
				strzal = s2.nextInt();
			}
			if(strzal==random) {
				strzaly = strzaly +1;
				System.out.println("Wygrales!");
				System.out.println("Udalo ci sie zgadnac moja liczbe za " + strzaly + " razem!");
				g.koniec(args);
			}
		}
	}
	public void koniec(String[]args) {
		Gra g = new Gra();
		s = new Scanner(System.in);
		System.out.println("Dzięki, za grę!");
		System.out.println("Chcesz zagrac ponownie?");
		String tak = s.next();
		if(tak.equalsIgnoreCase("tak")) {
			System.out.println("Lecimy znowu");
			g.gra(args);
		}else {
			System.out.println("Nie to nie");
		}
	}
}
