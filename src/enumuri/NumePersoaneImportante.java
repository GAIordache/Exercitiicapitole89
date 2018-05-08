package enumuri;

public enum NumePersoaneImportante {
	STEFAN_CEL_MARE(5,"da"),
	DRAGOS(7,"da23"),
	GIGI(56,"da4"),
	VLAD_TEPES(3,"da33"),
	BUBU(9,"da5"),
	ALIBABA(11,"da6");
	
	int anulMortii;
    String explicatie;
    // constructor enum
    private NumePersoaneImportante(int an,String exp) {
       anulMortii = an;
       explicatie = exp;
    }
    
    
    public void anulMortii() {
    	System.out.println(anulMortii);
    	System.out.println(explicatie);
    }
}
