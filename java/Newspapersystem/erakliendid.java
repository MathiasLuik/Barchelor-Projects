

public class erakliendid extends kliendid {

	private double maksta;

	public erakliendid(int kliendinumber, double tellimusePikkus, double kokkutellitud) {
		super(kliendinumber, tellimusePikkus, kokkutellitud);
	}

	public double getMaksta() {
		return maksta;
	}

	public void setMaksta(double maksta) {
		this.maksta = maksta;
	}

	public double summa() {
		lisaleht();
		tellimusi();

		return getKokkutellitud() * 6 * getKonf() * 0.65;

	}

	@Override
	public String toString() {
		return "erakliendid [maksta=" + summa() + ", getKliendinumber()= \n" + getKliendinumber() + "]\n";
	}

}
