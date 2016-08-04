
public class Alternant extends EtudiantConge
{

	private float tauxHoraire;
	private float salaireFixe;


//--------ATTRIBUTS CALCULPAIE-----------//
  
	private float salaireVariable;
	private float salaireMensuel;
	private String perpaie;


	public Alternant (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance,int tel, String email, String ecole, String dateFinContrat, String cursus, float salaireFixe){
		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email,ecole, dateFinContrat, cursus);		
		this.salaireFixe = salaireFixe;
	}

	public float getSalaireFixe(){
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}
	
	public float getSalaireVariable(){
		return salaireVariable;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
	}

	public String toString(){
		  return ( enConge() ? " en congé" : "")+" "+ super.toString()+"salaire : "+salaireMensuel+"\n";
					
		}
	
	public Paie calculPaie(String perpaie, float salaireVariable)
	{	
		//this.salaireFixe = ;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
		return new Paie();
	}


}
