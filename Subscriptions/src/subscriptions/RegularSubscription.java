package subscriptions;

public class RegularSubscription extends Subscription{
	
	private int tkesto;
	
	public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, int tkesto) {
		super(lehden_nimi, tilaajan_nimi, toimitusosoite);
		this.tkesto=tkesto;
	}
	
	public void setTkesto(int tkesto) {
		this.tkesto=tkesto;
	}
	
	public int getTkesto() {
		return this.tkesto;
	}
	
	public void printInvoice() {
		double tHinta = tkesto*getKkhinta();
		System.out.println("\nNormaali tilaus\nLehden nimi: " + getLehden_nimi() + "\nTilaaja: " + getTilaajan_nimi() + 
				"\nToimitusosoite: " + getToimitusosoite() + "\nTilauksen kesto: " + this.tkesto + "\nTilauksen hinta: " + tHinta + "€\n");
		
	}
}
