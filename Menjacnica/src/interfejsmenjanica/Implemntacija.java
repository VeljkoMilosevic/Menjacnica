package interfejsmenjanica;

import java.util.LinkedList;

import menjacnica.Valuta;

public class Implemntacija implements Interfejs {
	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodadavanjeKursa(Valuta m) {
		for(int i=0;i<valute.size();i++) {
						if(valute.get(i).equals(m)) {
							System.out.println("Lista vec sadrzi unetu valutu");
							return;
						}
					}
					valute.add(m);
	}

	@Override
	public void brisanjeKursa(Valuta m) {
		valute.remove(m);
	}

	@Override
	public Valuta pronalazanjeKursa(String naziv) {
		for(int i=0;i<valute.size();i++) {
						if(valute.get(i).getValuta().equals(naziv)) {
							return valute.get(i);
						}
				}
		return null;
	}

}
