import java.util.ArrayList;

public class Paie 
{
	private ArrayList<Paie> paies=new ArrayList<Paie>();

	 public float salaireVariable;
	 public float salaireFixe;
	 public float salaireMensuel;
	 public String perpaie;
	 
	 public Paie()
		{
			perpaie = "";
			salaireFixe = 0;
			salaireVariable = 0;
			salaireMensuel = 0;
		}
	 
	 public Paie (String perpaie, float salaireMensuel, float salaireFixe, float salaireVariable)
	 {
		 this.perpaie = perpaie;
		 this.salaireFixe = salaireFixe;
		 this.salaireVariable = salaireVariable;
		 this.salaireMensuel = salaireFixe + salaireVariable;
	 }

	
	 public String ToString ()
	 {
		 return "Période de paie : "+this.perpaie +" Salaire mensuel : "+
	 this.salaireMensuel+" Montant du salaire fixe : "+ this.salaireFixe +" Part variable : "+ this.salaireVariable;
	 }
	 
	 
	 public Paie somme(Paie that){
			return new Paie(this.perpaie,this.salaireFixe+that.salaireFixe, 
					this.salaireVariable+that.salaireVariable, this.salaireMensuel+that.salaireMensuel);
		}
	 
	 public Paie cloturePaie(Paie that)
	 {
		 return new Paie(this.perpaie = "31/12/2999", this.salaireMensuel = 0, this.salaireFixe = 0, this.salaireVariable = 0);
	 }
	 
	 
//-----------------------------Modifier l'objet Paie-----------------------//

	 public void setperpaie(String Pperpaie)
	 {
		this.perpaie = Pperpaie ;
	 }
	 
	 public void setsalaireFixe(float PsalaireFixe)
	 {
		this.salaireFixe = PsalaireFixe ; 
	 }
	 
	 public void setsalaireVariable(float PsalaireVariable)
	 {
		this.salaireVariable = PsalaireVariable; 
	 }

}
