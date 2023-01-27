package subscriptions;

public class StandingSubscription extends Subscription{
	
	private double alennusprosentti;
	
	public StandingSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double alennusprosentti) {
		super(lehden_nimi, tilaajan_nimi, toimitusosoite);
		this.alennusprosentti = alennusprosentti;
	}
	
	public void setAlennusprosentti(double alennusprosentti) {
		this.alennusprosentti = alennusprosentti;
	}
	
	public double getAlennusprosentti() {
		return this.alennusprosentti;
	}
	
	public void printInvoice() {
		double tHinta = 12*getKkhinta()*(1.00-(getAlennusprosentti()/100));
		System.out.println("Kesto tilaus\nLehden nimi: " + getLehden_nimi() + "\nTilaaja: " + getTilaajan_nimi() + 
				"\nToimitusosoite: " + getToimitusosoite() + "\nTilauksen kesto: 12kk\nTilauksen hinta: " + tHinta + "€\n");
	}
}
