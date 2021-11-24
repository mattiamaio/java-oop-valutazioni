package it.corso.valutazioni;

public class CalcolaValutazione {

	// costruttore
	CalcolaValutazione(int idStudente, int percentualeAssenze, float mediaVoti) {
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}

	// attributi
	int idStudente;
	int percentualeAssenze;
	float mediaVoti;

	// metodo
	boolean promossoOBocciato() {
		boolean promossoOBocciato;
		if (percentualeAssenze > 50) {
			promossoOBocciato = false;
		} else if (percentualeAssenze < 50 && percentualeAssenze >= 25 && mediaVoti > 2.0D) {
			promossoOBocciato = true;
		} else if (percentualeAssenze < 25 && mediaVoti >= 2.0D) {
			promossoOBocciato = true;
		} else {
			promossoOBocciato = false;
		}
		return promossoOBocciato;
	}

}
