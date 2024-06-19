import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat {
	private List<Muncitor>subordonati;

	public Manager(String nume, String prenume, double salariu, int vechime) {
		super(nume, prenume, salariu, vechime);
		this.subordonati = new ArrayList<>();			
	}
	public void adaugaSubordonat (Muncitor subordonat) {
		subordonati.add(subordonat);
	}
	public String numeIntreg() {
		return nume + "" + prenume + "(Manager)";
	}

}
