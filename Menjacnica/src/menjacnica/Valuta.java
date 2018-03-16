package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String valuta;
	private String skracenNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		if(valuta==null) {
					System.out.println("Pogresan unos naziva valute");
						return;
					}
		this.valuta = valuta;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv==null) {
						System.out.println("Pogresan unos skracenog naziva");
						return;
					}
		this.skracenNaziv = skracenNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null) {
					System.out.println("Pogresan unos datuma");
						return;
					}
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<=0) {
					System.out.println("Pogresan unos prodajnog kursa");
						return;
					}
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<=0) {
						System.out.println("Pogresan unos kupovnog kursa");
						return;
					}
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<=0) {
						System.out.println("Pogresan unos srednjeg kursa");
						return;
					}
		this.srednjiKurs = srednjiKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skracenNaziv == null) {
			if (other.skracenNaziv != null)
				return false;
		} else if (!skracenNaziv.equals(other.skracenNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [valuta=" + valuta + ", skracenNaziv=" + skracenNaziv + ", datum=" + datum + ", prodajniKurs="
				+ prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs + "]";
	}
	
	
	
	
	
}
