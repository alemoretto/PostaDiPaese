package it.prova;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws Exception {

		List<PostaDiPaese> listaPoste = MockPosta.POSTE_LIST;

		System.out.println("Tutte le poste di MI");
		List<PostaDiPaese> posteMilano = listaPoste.stream().filter(p -> p.getIndirizzoSede().contains("MI")).collect(Collectors.toList());
		posteMilano.forEach(p -> System.out.println(p));
	
		System.out.println("........................................................");
		System.out.println("Tutte le poste aperte dopo l' 01/03/2019");
		Date primoMarzo2019 = MyDate.s2d("01/03/2019");
		List<PostaDiPaese> postePrimoMarzo2019 = listaPoste.stream().filter(p -> p.getDataApertura().after(primoMarzo2019)).collect(Collectors.toList());
		postePrimoMarzo2019.forEach(p -> System.out.println(p));
		
		System.out.println("........................................................");
		System.out.println("Tutte gli indirizzi di poste con più di 20 dipendenti");
		List<String> indirizziPosteDipendentiMaggiore20 = listaPoste.stream().filter(p -> p.getNumeroDipendenti() > 20).collect(Collectors.toList()).
				stream().map(p -> p.getIndirizzoSede()).collect(Collectors.toList());
		indirizziPosteDipendentiMaggiore20.forEach(p -> System.out.println(p));
		
		System.out.println("........................................................");
		System.out.println("Indirizzi destinatari di poste con più di 10 dipendenti");
		List<String> indirizziDestinatariPosteDipendentiMaggiore10 = listaPoste.stream().filter(p -> p.getNumeroDipendenti() >= 10).collect(Collectors.toList())
				.stream().flatMap(p -> p.getDestinatari().stream()).collect(Collectors.toList())
				.stream().map(d -> d.getIndirizzo()).collect(Collectors.toList());
		indirizziDestinatariPosteDipendentiMaggiore10.forEach(i -> System.out.println(i));
		
		System.out.println("........................................................");
		System.out.println("Lista destinatari di poste con 50-100 dipendenti");
		List<Destinatario> destinatariPosteDipendentiTra50E100 = listaPoste.stream().filter(p -> p.getNumeroDipendenti() >= 50 && p.getNumeroDipendenti() <= 100).collect(Collectors.toList())
				.stream().flatMap(p -> p.getDestinatari().stream()).collect(Collectors.toList())
				.stream().filter(d -> d.isPossessoreDiContoCorrente()).collect(Collectors.toList());
		destinatariPosteDipendentiTra50E100.forEach(p -> System.out.println(p.toString()));

		System.out.println("........................................................");
		System.out.println("Lista delle età dei destinatari appartenenti a poste \"CENTRALE\" aperte dal 1 gennaio 2000");
//		Date primoGennaio2000 = MyDate.s2d("01/01/2000");
		Date primoGennaio2000 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
		List<Integer> etaDestinatariPosteCentraliPrimoGennaio2000 = listaPoste.stream().filter(p -> p.getDataApertura().after(primoGennaio2000) && p.getDenominazione().contains("Centrale")).collect(Collectors.toList())
				.stream().flatMap(p -> p.getDestinatari().stream()).collect(Collectors.toList())
				.stream().map(d -> d.getEta()).collect(Collectors.toList());
		etaDestinatariPosteCentraliPrimoGennaio2000.forEach(p -> System.out.println(p));

	}

}