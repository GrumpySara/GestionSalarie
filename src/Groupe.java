import java.util.ArrayList;


public class Groupe {
	private ArrayList<Employe> employes=new ArrayList<Employe>();
	
	public void ajoutEmploye(Employe a){
		employes.add(a);
	}

	public Paie calculPaieTotale(){
		Paie p = new Paie();
		for(Employe a : employes ){
				p= p.somme(a.calculPaie());
		}
		return p;
	}	

	public int nbsalariesGroupe(){
		int i= employes.size();
		return i;
	}
	
	public String toString(){
		String s = new String();
		for(Employe a : employes ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String employesEnConge(){
		String s = new String();
		s = "En congé : ";
		for(Employe a : employes ){
			if (a instanceof Conge)
				if (((Conge) a).enConge())
					s= s+"n°"+a.idEmp +" "+ a.nom+ a.prenom +" ; ";
		}
		return s;
	}
	
	public int nbemployesEnConge(){
		int i = 0;
		for(Employe a : employes ){
			if (a instanceof Conge)
				if (((Conge) a).enConge())
					i= i+1;
		}
		return i;
	}
	
	
	
	
}
