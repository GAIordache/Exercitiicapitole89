package enumuri;

public class Main {
	
	public enum Planeta {MERCUR, VENUS, PAMANT,
        MARTE, JUPITER, SATURN, URANUS,
        NEPTUN, PLUTO_NU_E_PLANETA
	}
	
	public static void main(String[] args) {
		AfiseazaNumele(NumePersoaneImportante.values());
		
		NumePersoaneImportante.STEFAN_CEL_MARE.anulMortii();
		NumePersoaneImportante.DRAGOS.anulMortii();
		NumePersoaneImportante.GIGI.anulMortii();
		NumePersoaneImportante.VLAD_TEPES.anulMortii();
		NumePersoaneImportante.ALIBABA.anulMortii();
		
		
		Planeta p1 = Planeta.MERCUR;
	    Planeta p2  = Planeta.VENUS;
	    System.out.print(p1 == Planeta.MERCUR); 
	    System.out.print(p1.equals(p2));

	}
	
	static void AfiseazaNumele(NumePersoaneImportante[] pPersoane) {
		for (NumePersoaneImportante p: pPersoane ) {
			System.out.println("Pozitia in enum:" + p.ordinal() + " cu valoarea:" + p);
		}
	}

}
