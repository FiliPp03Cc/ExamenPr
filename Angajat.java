public class Angajat {
	String nume;
	String prenume;
	double salariu;
	int vechime;

	public Angajat(String nume, String prenume, double salariu, int vechime) {
		this.nume = nume;
		this.prenume = prenume;
		this.salariu = salariu;
		this.vechime = vechime;
	}
	public double salariu() {
		return salariu * (1 + 0.1 * vechime);
	}
	public String numeIntreg() {
		return nume + "" + prenume + "(Angajat)";
	}

}
