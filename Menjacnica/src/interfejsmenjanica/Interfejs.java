package interfejsmenjanica;

import menjacnica.Valuta;

public interface Interfejs {

	public void dodadavanjeKursa(Valuta m);
	public void brisanjeKursa(Valuta m);
	public Valuta pronalazanjeKursa(String naziv);
	
}
