

public abstract class kliendid {

	private double kliendinumber;
	private double tellimusePikkus;
	private double kokkutellitud;
	private double konf;

	public kliendid(double kliendinumber, double tellimusePikkus, double kokkutellitud) {
		super();
		this.kliendinumber = kliendinumber;
		this.tellimusePikkus = tellimusePikkus;
		this.kokkutellitud = kokkutellitud;
	}

	public double getKliendinumber() {
		return kliendinumber;
	}

	public void setKliendinumber(double kliendinumber) {
		this.kliendinumber = kliendinumber;
	}

	public double getKokkutellitud() {
		return kokkutellitud;
	}

	public double getTellimusePikkus() {
		return tellimusePikkus;
	}

	public double getKonf() {
		return konf;

	}

	public double kontroll() {
		if (!kliendinumber.length() == 6) {
			return System.out.println("See ei koosne 6 arvust");
		
	}

	public double tellimusi() {
		return kokkutellitud = 4 * tellimusePikkus;

	}

	public double lisaleht() {

		if (getTellimusePikkus() >= 3) {

			System.out.println("Sellel tellijal on tellitud vähemalt 3 kuud");
			return konf = .85;
		}
		System.out.println("See klient on tellinud alla 3 kuu");
		return konf = 1;
	}

}
