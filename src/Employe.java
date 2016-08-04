
public abstract class Employe 
{
 protected int idEmp;
 private static int cpt=0;
 protected String nom;
 protected String prenom;
 protected String dateEmbauche;
 protected String dateNaissance;
 protected int tel;
 protected String email;
 protected int etabAffectation;
 protected String dateClotureDossier;
 private boolean dossierCloture;
 
 public Employe (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email)
  {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.dateEmbauche = dateEmbauche;
	 this.dateNaissance = dateNaissance;
	 this.etabAffectation = etabAffectation;
	 this.tel = tel;
	 this.email = email;
 	 this.idEmp = cpt++;
 	 this.dateClotureDossier= "";
 	 this.dossierCloture = false;

  }
 

	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getPrenom(){
		return prenom;
	}

	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public String getDateEmbauche(){
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche){
		this.dateEmbauche = dateEmbauche;
	}

	public int getEtabAffectation(){
		return etabAffectation;
	}
	
	public void setEtabAffectation(int etabAffectation){
		this.etabAffectation = etabAffectation;
	}
	
	public String getDateNaissance(){
		return dateNaissance;
	}
	

	public void setDateNaissance(String dateNaissance){
		this.dateNaissance = dateNaissance;
	}
	
	public int getTel(){
		return tel;
	}

	public void setTel(int tel){
		this.tel = tel;
	}
	
	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public String getDateClotureDossier(){
		return dateClotureDossier;
	}

	public void setDateClotureDossier(String dcd){
		this.dateClotureDossier = dcd;
	}
	
	public void cloturerDossier (String dcd){ 
		setDateClotureDossier(dcd);
		this.dossierCloture = true;
		
	}
	public boolean estCloture() {
		   return this.dossierCloture;
		}
	
		
 public String toString(){
 	if (dossierCloture==true)
		return "n°" + idEmp+"\n"+
				nom +" "+ prenom + "né le " + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'embauche: " + dateEmbauche + "\n"+
				"ce dossier a été cloturé le " + dateClotureDossier+ "\n";
	else
		return "n°" + idEmp+"\n"+
				nom +" "+ prenom + "né le " + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'embauche: " + dateEmbauche + "\n";
				
					
	}

 public abstract Paie calculPaie();
}
