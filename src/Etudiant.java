public abstract class Etudiant extends Employe
{
 protected String ecole;
 protected String dateFinContrat;
 protected String cursus;

 
 public Etudiant (String nom, String prenom, String dateEmbauche,int etabAffectation, String dateNaissance, int tel, String email, String ecole, String dateFinContrat, String cursus)
 {
	 super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email);
 	 this.ecole = ecole;
 	 this.dateFinContrat = dateFinContrat;
 	 this.cursus = cursus;
 }

public String getEcole(){
   return ecole;
}

public String getDateFinContrat(){
   return dateFinContrat;
}
public String getCursus(){
   return cursus;
}

public void setEcole(String ecole){
 this.ecole = ecole;
}

public void setDateFinContrat(String dateFinContrat){
 this.dateFinContrat = dateFinContrat;
}

public void setCursus(String cursus){
 this.cursus = cursus;
}

public String toString(){
	return super.toString()+"\n"+
			"date Fin Contrat : "+ dateFinContrat +"\n"+
			"école : "+ ecole+"\n"+
			"cursus : "+cursus+"\n";
}

public abstract Paie calculPaie();
}

