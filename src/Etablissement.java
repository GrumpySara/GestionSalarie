
public class Etablissement 
{
 private int idEtab;
 private String adr;
 private static int cpt = 0;

 
 public Etablissement (int idEtab, String adr)
 {
 	 this.idEtab = cpt++;
	 this.adr = adr;
	 
 }
 
 public String toString() {
	 return "n°Etab : " + idEtab+"\n"+
			 "Adresse : "+ adr +"\n";
 }

}
