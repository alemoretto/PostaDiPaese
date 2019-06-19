package it.prova;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostaDiPaese {

	private String denominazione;
	private String indirizzoSede;
	private Date dataApertura;
	private int numeroDipendenti;
	private List<Destinatario> destinatari = new ArrayList<>();
	
	public PostaDiPaese(String denominazione, String indirizzoSede, Date dataApertura, int numeroDipendenti) {
		super();
		this.denominazione = denominazione;
		this.indirizzoSede = indirizzoSede;
		this.dataApertura = dataApertura;
		this.numeroDipendenti = numeroDipendenti;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(int numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public List<Destinatario> getDestinatari() {
		return destinatari;
	}

	public void setDestinatari(List<Destinatario> destinatari) {
		this.destinatari = destinatari;
	}
	
	public String toString() {
		try {
			return "Posta: [nome=" + denominazione + ", via=" + indirizzoSede + ", apertura=" + MyDate.d2s(dataApertura) + ", numDipendenti=" + numeroDipendenti + "]" ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
