
public class Cadre extends EmployeConge {
 	 
		private float salaireVariable;
		private float salaireFixe;
		private float salaireMensuel;
		private String perpaie;
		float tauxJour;
		int jourPresence;

		
	public Cadre(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email,float tauxJour)
	{
		super(nom,prenom,dateEmbauche,etabAffectation, dateNaissance,tel,email);
		this.tauxJour = tauxJour;
	}
 
//------------------METHODES PAIE-------------------------//
	
	public float getSalaireFixe(){
		return salaireFixe;
	}

 
	public float getSalaireVariable(){
		return this.salaireVariable;
	}
 
	
	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
	}
	
	public String toString(){
		return super.toString()+"\n"+ "salaire Mensuel (Fixe: "+salaireFixe+ " + Variable : "+salaireVariable+ ") = "+ salaireMensuel+ "\n";
	
	}
	

	public Paie calculPaie(String perpaie, int jourPresence)
	{	
		this.salaireFixe = tauxJour * jourPresence;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
		
		return new Paie();
	}
	
	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
 
 public float getTauxJour(){
  return tauxJour;
 }
 
  public int getJourPresence(){
  return jourPresence;
 }
 public void setTauxJour(float tj){
   this.tauxJour = tj;
}

 public void setJourPresence(int jp){
   this.jourPresence = jp;
}


}

