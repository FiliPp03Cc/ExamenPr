import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	private List<Angajat> angajati;
	private List<Client> clienti;
	private List<Act> acte;

	public Fabrica() {
		this.angajati = new ArrayList<>();
		this.clienti = new ArrayList<>();
		this.acte = new ArrayList<>();
	}
	
	public void adaugaAngajat(Angajat angajat) {
		angajati.add(angajat);
	}
	
	public void adaugaClient(Client client) {
		clienti.add(client);
	}
	
	public void adaugaAct(Act act) {
		acte.add(act);
	}
	public List<Angajat> getAngajati(){
		return angajati;
	}
	
	public List<Client> getClienti(){
		return clienti;
	}
	public List<Act> getActe(){
		return acte;
	}

}
