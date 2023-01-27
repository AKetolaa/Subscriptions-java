package subscriptions;

public class Subscription {
	
	private String lehden_nimi;
	private String tilaajan_nimi;
	private String toimitusosoite;
	private double kkhinta;
	
	public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite) {
		this.lehden_nimi = lehden_nimi;
		this.tilaajan_nimi= tilaajan_nimi;
		this.toimitusosoite = toimitusosoite;
		this.kkhinta = 10.00;
	}

	public String getLehden_nimi() {
		return lehden_nimi;
	}

	public void setLehden_nimi(String lehden_nimi) {
		this.lehden_nimi = lehden_nimi;
	}

	public String getTilaajan_nimi() {
		return tilaajan_nimi;
	}

	public void setTilaajan_nimi(String tilaajan_nimi) {
		this.tilaajan_nimi = tilaajan_nimi;
	}

	public String getToimitusosoite() {
		return toimitusosoite;
	}

	public void setToimitusosoite(String toimitusosoite) {
		this.toimitusosoite = toimitusosoite;
	}

	public double getKkhinta() {
		return kkhinta;
	}

	public void setKkhinta(double kkhinta) {
		this.kkhinta = kkhinta;
	}
	
	public void printInvoice() {
		
	}

}
