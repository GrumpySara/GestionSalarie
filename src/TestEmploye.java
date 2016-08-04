
public class TestEmploye {

	public static void main(String[] args) 
	
	
	{
/*--------------saisir une paie---------------------------*/
		
		Cadre c3= new Cadre("Jean", "Bernard", "01/04/2010", 1, "07/01/1974", 06651420032, "jb@gmail3.com", (float) 9.67);
		c3.calculPaie("01/12/2016", 21);
		String Jean = c3.toString();
		System.out.println(Jean);
	
	    Alternant a1= new Alternant("Sophia", "Dephline", "09/09/2016", 2, "12/11/1997", 0666514201, "sd@gmail.com", "La Sorbonne", "14/09/2017", "ingenierie", (float)9.68);
		a1.calculPaie("01/12/2016", 200);
		String Delphine = a1.toString();
		System.out.println(Delphine);
		/*-------------------créer un salarié---------------------------------*/
	    Cadre c1= new Cadre("Jean", "Bernard", "01/04/2010", 1, "07/01/1974", 06651420032, "jb@gmail.com", (float) 199.67);
	    Cadre c2= new Cadre("Mathieu", "Rimel", "01/07/2012", 2, "14/09/1984", 0604210547, "mr@gmail.com", (float) 4.78);
	    Cdd cdd1= new Cdd("Racha", "Iskan", "15/08/2016", 1, "05/12/1990", 0741254615, "ri@gmail.com", "01/07/2017", 28000, 1400);
	    Cdd cdd2= new Cdd("Sarah", "Tarram", "01/07/2016", 1, "07/08/1994", 0741254132, "st@gmail.com", "14/09/2017", 35000, (float) 1700.5 );
	    Stagiaire s1= new Stagiaire ("Alexandre", "Sylvie", "04/10/2016", 1, "04/07/1996", 0641052741, "as@gmail.com", "Paris 7 ", "17/12/2017", "Marketing",(float) 12000);
	     /*------------ afficher les info perso des salariés initiés  ----------*/
	    
	    System.out.println(c1.toString());
	    System.out.println(c2.toString());
	    System.out.println(cdd1.toString());
	    System.out.println(cdd2.toString());
	    System.out.println(a1.toString());
	    System.out.println(s1.toString());
	    
	       /*------------ Changer le salaire de l'alternant  ----------*/
	   float salaire = a1.getSalaireFixe();
	    System.out.println(salaire);
	    a1.setSalaireFixe(2000);
	    System.out.println(a1.getSalaireFixe());
	         /*------------ Mettre le cadre c1 en congé et le faire revenir ----------*/
	   c1.debutConge();
	    System.out.println(c1.toString());
	    c1.finConge();
	    System.out.println(c1.toString());
	    
	       /*------------ Cloturer le dossier du cadre c1 ----------*/
	    boolean etat1= c1.estCloture();
	    System.out.println(etat1);
	    c1.cloturerDossier("29/07/2016");
	    etat1= c1.estCloture();
	    System.out.println(etat1);
	    System.out.println(c1.toString());
	    
	    
	    
	    
        /*------------ Mettre l'alternante a1 et cdd1 en congé   ----------*/
	    a1.debutConge();
	    System.out.println(a1);
	    cdd1.debutConge();
	    System.out.println(cdd1);
	    
	    /*------------- Créer un groupe et y ajouter c1,cdd1,a1 et s1 ----------------*/
	    
	    Groupe grp = new Groupe();
	    grp.ajoutEmploye(a1);
	    grp.ajoutEmploye(c1);
	    grp.ajoutEmploye(cdd1);
	    grp.ajoutEmploye(s1);
	    System.out.println(grp);
	    
	    /*---- afficher les personnes en congé du groupe ----*/
	    /*System.out.println(grp.employesEnConge());
	    
	    /*------ Calculer la paie // Fonctionne pas ------*/
	   /* System.out.println(a1.calculPaie());  */
	}

	
}
