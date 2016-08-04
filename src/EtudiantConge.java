public class EtudiantConge extends Etudiant implements Conge {
	private boolean enCong=false;
	
	public EtudiantConge(String nom, String prenom, String dateEmbauche,int etabAffectation, String dateNaissance, int tel, String email, String ecole, String dateFinContrat, String cursus){
		super(nom,prenom,dateEmbauche, etabAffectation,dateNaissance,tel,email,ecole,dateFinContrat,cursus);
	}
	
	 public void debutConge() {
		   this.enCong=true;
		}

	public void finConge() {
		   this.enCong=false;
		}

	public boolean enConge() {
		   return this.enCong;
		}
		
	public String toString(){
		  return super.toString()+ ( enConge() ? ", en congé" : "");
					
		}


	//----------------------------METHODE CALCUL PAIE CADRE---------------------------//

	public Paie calculPaie()
	{	
		return null;
	}

	@Override
	public String AjoutCadre() {
		// TODO Auto-generated method stub
		return null;
	}

}
