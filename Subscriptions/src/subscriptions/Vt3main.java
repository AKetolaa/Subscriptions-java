package subscriptions;

import java.util.Scanner;

public class Vt3main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anna normitilauksen tiedot");
		System.out.println("Anna lehden nimi > ");
		String lehden_nimi = scanner.nextLine();
		
		System.out.println("Anna tilaajan nimi");
		String tilaajan_nimi = scanner.nextLine();
		
		System.out.println("Anna toimitusosoite");
		String toimitusosoite = scanner.nextLine();
		
		System.out.println("Anna tilauksen kesto");
		int tkesto = scanner.nextInt();
		
		while(tkesto < 1) {
			System.out.println("Keston taytyy olla vahintaan 1kk");
			tkesto = scanner.nextInt();
		}
		
		System.out.println("Anna kestotilauksen tiedot");
		System.out.println("Anna lehden nimi");
		scanner.nextLine();
		String kestoLehti = scanner.nextLine();
		
		System.out.println("Anna tilaajan nimi");
		String kestoTilaaja = scanner.nextLine();
		
		System.out.println("Anna toimitusosoite");
		String kestoToimitusosoite = scanner.nextLine();
		
		System.out.println("Anna alennusprosentti");
		double alennusprosentti = scanner.nextDouble();
		while(alennusprosentti<0) {
			System.out.println("alennusprosentti ei voi olla negatiivinen");
			alennusprosentti = scanner.nextDouble();
		}
		
		Subscription [] subs = new Subscription [2];
		subs[0] = new RegularSubscription(lehden_nimi,tilaajan_nimi,toimitusosoite,tkesto);
		subs[1] = new StandingSubscription(kestoLehti,kestoTilaaja,kestoToimitusosoite,alennusprosentti);
		
		printSubscriptionInvoice(subs);
		
		scanner.close();
		
		
	}	
	public static void printSubscriptionInvoice(Subscription[] subs) {	
		subs[0].printInvoice();
		subs[1].printInvoice();
			
	}

}
