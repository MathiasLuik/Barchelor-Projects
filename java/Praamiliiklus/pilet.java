package praamiliiklus;

public class pilet {

	private String kuupaev;
	private String sihtkoht;
	private String pilet;
	private int reisijateArv;
	private static int nextNumber = 1;
	private int serialNumber;

	public pilet(String kuupaev, String sihtkoht, String pilet, int reisijateArv) {
		super();
		this.kuupaev = kuupaev;
		this.sihtkoht = sihtkoht;
		this.pilet = pilet;
		this.reisijateArv = reisijateArv;
		this.serialNumber = nextNumber++;
		if (piletitüüp() == 0) {
			throw new IllegalArgumentException("Ebakorrektne väli" + this.serialNumber);
		}
	}

	public String getKuupaev() {
		return kuupaev;
	}

	public String getSihtkoht() {
		return sihtkoht;
	}

	public String getPilet() {
		return pilet;
	}

	public int getReisijateArv() {
		return reisijateArv;
	}

	public double piletitüüp() {
		if (pilet == "reisijapilet") {
			return 5;
		} else if (pilet == "oppuripilet" || pilet == "pensionär") {
			return 2.5;
		} else if (pilet == "laps") {
			return 0;
		}
		return 0;

	}

	@Override
	public String toString() {
		return "Pilet [" + "Number=" + serialNumber + ", kuupaev=" + kuupaev + ", sihtkoht=" + sihtkoht + ", pilet="
				+ pilet + ", Piletitüübi eest=" + piletitüüp() + "$, reisijateArv=" + reisijateArv + "]";
	}

	public int reisimisehind() {

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.equals(null))
			return false;

		if (!(obj instanceof pilet))
			return false;

		pilet t = (pilet) obj; // downcasting

		return this.serialNumber == t.serialNumber;
	}

}
