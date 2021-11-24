package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		CalcolaValutazione[] studente = new CalcolaValutazione[20];

		int idStudente = 0, percentualeAssenze;
		float mediaVoti;
		float max = 5.0F;

		for (int i = 0; i < studente.length; i++) {
			idStudente++;
			percentualeAssenze = random.nextInt(100) + 1;
			mediaVoti = random.nextFloat() * max;
			studente[i] = new CalcolaValutazione(idStudente, percentualeAssenze, mediaVoti);
			String media2Dec = String.format("%.2f", mediaVoti);

			System.out.println("ID Studente: " + studente[i].idStudente + " con " + studente[i].percentualeAssenze
					+ " assenze" + " ha una media voto di " + media2Dec);
			if (studente[i].promossoOBocciato()) {
				System.out.println("Promosso");
			} else {
				System.out.println("Bocciato");
			}

		}

	}

}
