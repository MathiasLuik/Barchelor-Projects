package praamiliiklus;

public class transport extends pilet {

	public boolean transport;
	public String transpordiviis;
	public String autonumber;
	public double kaal;
	private static int TransportijateArv = 1;
	private int serialNumber;

	public transport(String kuupaev, String sihtkoht, String pilet, int reisijateArv, boolean transport,
			String transpordiviis, String autonumber, double kaal) {
		super(kuupaev, sihtkoht, pilet, reisijateArv);
		this.transport = transport;
		this.transpordiviis = transpordiviis;
		this.autonumber = autonumber;
		this.kaal = kaal;
		this.serialNumber = TransportijateArv++;
	}

	public boolean isTransport() {
		return transport;
	}

	public String getTranspordiviis() {
		return transpordiviis;
	}

	public String getAutonumber() {
		return autonumber;
	}

	public double getKaal() {
		return kaal;
	}

	@Override
	public int reisimisehind() {
		// boolean transport = false;
		// super(transport);
		if (this.transport == true) {
			if (transpordiviis.equals("ratas")) {
				return 1;
			} else if (transpordiviis.equals("auto") && kaal <= 1.2) {
				return 10;
			} else if (transpordiviis.equals("väikebuss") && kaal <= 2.5) {
				return 10;
			} else if (transpordiviis.equals("n2") && kaal <= 7) {
				return 20;
			} else if (transpordiviis.equals("n3")) {
				return 40;
			} else if (transpordiviis.equals("mootorratas") && kaal <= 1) {
				return 5;
			} else if (transpordiviis.equals("buss")) {
				if (getReisijateArv() <= 21 && kaal <= 12) {
					return 20;
				} else if (getReisijateArv() > 21) {
					return 40;
				}
			}
		}
		return 0;
	}

	public double transpordiKoguhind() {
		if (getReisijateArv() >= 10 && transpordiviis.equals("buss")) {
			return getReisijateArv() * piletitüüp() - piletitüüp() + reisimisehind();
		}
		return getReisijateArv() * piletitüüp() + reisimisehind();
	}

	@Override
	public String toString() {
		return "Transport + " + super.toString() + "[" + "Liiginumber " + serialNumber + ", transpordiviis: "
				+ transpordiviis + ", kaal - " + kaal + " tonni" + ", autonumber " + autonumber
				+ ", Transport + reisijate koguhind: " + transpordiKoguhind() + "]";
	}
}
