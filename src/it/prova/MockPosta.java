package it.prova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockPosta {

	public static final List<PostaDiPaese> POSTE_LIST = new ArrayList<>();

	static {
		try {
			
		
		PostaDiPaese postaRoma1 = new PostaDiPaese("Ufficio di Roma 161", "via della Fotografia, 107 (RM)", MyDate.s2d("01/04/2019"),12);
		PostaDiPaese postaRoma2 = new PostaDiPaese("Poste Italiane Granai", "via Mario Rigamonti, 100 (RM)", MyDate.s2d("20/11/2015"),6);
		PostaDiPaese postaRoma3 = new PostaDiPaese("Poste Italiane", "via Marmorata, 4 (RM)", MyDate.s2d("03/01/2002"),15);
		PostaDiPaese postaRoma4 = new PostaDiPaese("Posta Centrale", "viale Europa, 190 (RM)", MyDate.s2d("17/05/1994"),64);
		
		PostaDiPaese postaMilano1 = new PostaDiPaese("Posta Centrale", "via Cordusio, 4 (MI)", MyDate.s2d("02/02/2001"),55);
		PostaDiPaese postaMilano2 = new PostaDiPaese("Poste Italiane", "piazza Duca D'Aosta (MI)", MyDate.s2d("07/12/2019"),31);
		PostaDiPaese postaMilano3 = new PostaDiPaese("Poste Italiane", "via Monza, 56 (MI)", MyDate.s2d("28/11/2000"),20);
		
		PostaDiPaese postaNapoli1 = new PostaDiPaese("Poste Italiane", "piazza Matteotti (NA)", MyDate.s2d("10/04/2006"),42);
		PostaDiPaese postaNapoli2 = new PostaDiPaese("Posta Centrale", "corso Meridionale (NA)", MyDate.s2d("13/05/2019"),71);
		
		
		Destinatario destinatario1 = new Destinatario("Mario", "Rossi", 30, "via Mosca", true, postaRoma1);
		Destinatario destinatario2 = new Destinatario("Carlo", "Bianchi", 25, "via Londra", false, postaRoma1);
		postaRoma1.getDestinatari().add(destinatario1);
		postaRoma1.getDestinatari().add(destinatario2);
		
		Destinatario destinatario3 = new Destinatario("Bruno", "Bruni", 40, "via Parigi", true, postaMilano1);
		postaMilano1.getDestinatari().add(destinatario3);
		
		Destinatario destinatario4 = new Destinatario("Pippo", "Gialli", 68, "via Madrid", false, postaRoma4);
		postaRoma4.getDestinatari().add(destinatario4);

		Destinatario destinatario5 = new Destinatario("Andrea", "Verdi", 68, "via Lisbona", true, postaNapoli1);
		postaNapoli1.getDestinatari().add(destinatario5);
		
		Destinatario destinatario6 = new Destinatario("Stefano", "Stefani", 82, "via Benevento", true, postaNapoli2);
		postaNapoli2.getDestinatari().add(destinatario6);
		
		List<PostaDiPaese> listaPoste = Arrays.asList(postaRoma1,postaRoma2,postaRoma3,postaRoma4,
				postaMilano1,postaMilano2,postaMilano3,postaNapoli1,postaNapoli2);
		POSTE_LIST.addAll(listaPoste);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
