import java.util.ArrayList;
import java.util.List;

public class Muncitor extends Angajat {
	private List<String> responsabilitati;
	String nume;
	String prenume;
	double salariu;
	int vechime;

	public Muncitor(String nume, String prenume, double salariu, int vechime) {
		super(nume, prenume, salariu, vechime);
		this.responsabilitati = new ArrayList<>();
	}
	public void adaugaResponsabilitate(String responsabilitate) {
		responsabilitati.add(responsabilitate);
	}
	
	public String numeIntreg() {
		return nume + "" + prenume + "(Muncitor)";
	}

}
