

public class ärikliendid extends kliendid {

	private double tellitud;
	private double maksta;

	public ärikliendid(int kliendinumber, double tellimusePikkus, double kokkutellitud, double tellitud) {
		super(kliendinumber, tellimusePikkus, kokkutellitud);
		this.tellitud = tellitud;
	}

	public double getTellitud() {
		return tellitud;
	}

	public void setTellitud(double tellitud) {
		this.tellitud = tellitud;
	}

	public double summa() {
		getTellimusePikkus();
		lisaleht();
		tellimusi();

		if (this.tellitud == 1) {
			System.out.println("kogusumma 15% ale'ga:  ");
			return getKokkutellitud() * 6 * getKonf() * 0.65;

		} else {

			System.out.println("saad 5lehte nädalas kokku");
			return getKokkutellitud() * getKonf() * 5 * 0.65;

		}
	}

	@Override
	public String toString() {
		return "ärikliendid: \n [tellitud pole lisalehte  \n maksta=" + summa() + ",\n getKliendinumber()="
				+ getKliendinumber() + "]";
	}

}
