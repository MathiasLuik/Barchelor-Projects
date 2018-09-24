package praamiliiklus;

public class kohalik extends pilet {
	public long isikukood;
	public String päritMaakond;
	private static int TransportijateArv = 1;
	private int serialNumber;

	public kohalik(String kuupaev, String sihtkoht, String pilet, int reisijateArv, long isikukood,
			String päritMaakond) {
		super(kuupaev, sihtkoht, pilet, reisijateArv);
		this.isikukood = isikukood;
		this.päritMaakond = päritMaakond;
		this.serialNumber = TransportijateArv++;

	}

	public long getIsikukood() {
		return isikukood;
	}

	public String getPäritMaakond() {
		return päritMaakond;
	}

	public double kohalikule() {
		if (päritMaakond.equals("hiiu") || päritMaakond.equals("ridala")) {
			return 0.5;
		}
		return 1;
	}

	public double Kohalikukogusumma() {
		return piletitüüp() * kohalikule() + reisimisehind();
	}

	@Override
	public String toString() {
		return "kohaliku " + super.toString() + "]" + "[" + "Liiginumber " + serialNumber + ", Kohalikule hind: "
				+ Kohalikukogusumma() + ", isikukood:" + isikukood + "]";
	}

}
