import java.sql.*;

public class DriverLecture {

		//JDBC diver nom et database URL
		static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost:8889/RH";
		
		//BDD IDs
		static final String USER ="root";
		static final String PASS="root";


// AFFICHAGE ID ET NOM PRENOM DE TOUS LES CADRES
		public static void afficheCadre(){
			Connection conn = null;
			Statement stmt = null;
			    try {
			    //Etape 2: Enregistrement JDBC Driver
			      Class.forName("com.mysql.jdbc.Driver");
			      
			    //Etape 3: Ouverture connexion
			      conn = DriverManager.getConnection(DB_URL,USER, PASS);
			      
			    //Etape 4: Execution de la requête
			      stmt = conn.createStatement();
			      String sql;
			      sql = "(SELECT idEmp,nom,prenom FROM Cadres)";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			    //Etape 5: Extraction data du ResultSet
			      while(rs.next()){
			    	  //Retrieve par colonne
			    	  int idEmp = rs.getInt("idEmp");
			    	  String nom = rs.getString("nom");
			    	  String prenom = rs.getString("prenom");

			    	  
			    	  //affichage des valeurs de la BDD
					  System.out.print("idEmp: "+idEmp);
			    	  System.out.print(", Nom: "+nom);
			    	  System.out.println(", Prenom:"+prenom);
			      }
			      
				    //Etape 6: Nettoyage de l'environnement
				      rs.close();
				      stmt.close();
				      conn.close();		         
				    } 
				    catch (SQLException se) {
				    	//Gestion erreurs pour JDBC
				      se.printStackTrace();
				    }
				    catch (Exception e){
				    	//Gestion erreurs pour Class.forName
				    	e.printStackTrace();
				    }
				    finally{
				    	//bloc finally utilisé pour fermer les ressources
				    	try{
				    		if(stmt != null)
				    			stmt.close();
				    	}
				    	catch (SQLException se2){
				    	}//rien à faire
				    	try{
				    		if(conn != null)
				    			conn.close();
				    	}
				    	catch (SQLException se){
				    		se.printStackTrace();
				    	}
				    }	
			}
			    	  		
 // Recherche du cadre 
		public static Cadre idCadre (int idrech){
			Connection conn = null;
			Statement stmt = null;
			    try {
			    //Etape 2: Enregistrement JDBC Driver
			      Class.forName("com.mysql.jdbc.Driver");
			      System.out.println("Driver O.K.");
			      
			    //Etape 3: Ouverture connexion
			      System.out.println("Connexion à la BDD...");
			      conn = DriverManager.getConnection(DB_URL,USER, PASS);
				  System.out.println("Connexion établie...");
			      
			    //Etape 4: Execution de la requête
			      System.out.println("Création de la requête...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "(SELECT * FROM Cadres WHERE idEmp='"+idrech+"')";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			    //Etape 5: Extraction data du ResultSet
			      while(rs.next()){
			    	  //Retrieve par colonne
			    	  String nom = rs.getString("nom");
			    	  String prenom = rs.getString("prenom");
			    	  String dateEmbauche = rs.getString("dateEmbauche");
			    	  int etabAffectation = rs.getInt("etabAffectation");
			    	  String dateNaissance = rs.getString("dateNaissance");
			    	  int tel = rs.getInt("tel");
			    	  String email = rs.getString("email");
			    	  float tauxJour = rs.getFloat("tauxJour");
			    	  boolean conge = rs.getBoolean("conge");
			    	  boolean cloture = rs.getBoolean("cloture");
			    	  
			    	  //affichage des valeurs de la BDD
					  System.out.print("idEmp: "+idrech);
			    	  System.out.print(", Nom: "+nom);
			    	  System.out.print(", Prenom:"+prenom);
			    	  System.out.print(", Date d'embauche:"+dateEmbauche);
			    	  System.out.print(", Etablissement d'affectation :"+etabAffectation);
			    	  System.out.print(", Date de Naissance: "+dateNaissance);
			    	  System.out.print(", Tel: "+tel);
			    	  System.out.print(", Email:"+email);
			    	  System.out.print(", Taux jour: "+tauxJour);
			    	  System.out.print(", Congé :"+conge);
			    	  System.out.println(", Dossier cloturé :"+cloture);
			    	  return new Cadre (nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email, tauxJour);
			      }
			      
			    //Etape 6: Nettoyage de l'environnement
			      rs.close();
			      stmt.close();
			      conn.close();		         
			    } 
			    catch (SQLException se) {
			    	//Gestion erreurs pour JDBC
			      se.printStackTrace();
			    }
			    catch (Exception e){
			    	//Gestion erreurs pour Class.forName
			    	e.printStackTrace();
			    }
			    finally{
			    	//bloc finally utilisé pour fermer les ressources
			    	try{
			    		if(stmt != null)
			    			stmt.close();
			    	}
			    	catch (SQLException se2){
			    	}//rien à faire
			    	try{
			    		if(conn != null)
			    			conn.close();
			    	}
			    	catch (SQLException se){
			    		se.printStackTrace();
			    	}
			    }	

				return null;

		}

		// AFFICHAGE ID ET NOM PRENOM DE TOUS LES CDD
				public static void afficheCdd(){
					Connection conn = null;
					Statement stmt = null;
					    try {
					    //Etape 2: Enregistrement JDBC Driver
					      Class.forName("com.mysql.jdbc.Driver");
					      
					    //Etape 3: Ouverture connexion
					      conn = DriverManager.getConnection(DB_URL,USER, PASS);
					      
					    //Etape 4: Execution de la requête
					      stmt = conn.createStatement();
					      String sql;
					      sql = "(SELECT idEmp,nom,prenom FROM CDD)";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //Etape 5: Extraction data du ResultSet
					      while(rs.next()){
					    	  //Retrieve par colonne
					    	  int idEmp = rs.getInt("idEmp");
					    	  String nom = rs.getString("nom");
					    	  String prenom = rs.getString("prenom");

					    	  
					    	  //affichage des valeurs de la BDD
							  System.out.print("idEmp: "+idEmp);
					    	  System.out.print(", Nom: "+nom);
					    	  System.out.println(", Prenom:"+prenom);
					      }
					      
						    //Etape 6: Nettoyage de l'environnement
						      rs.close();
						      stmt.close();
						      conn.close();		         
						    } 
						    catch (SQLException se) {
						    	//Gestion erreurs pour JDBC
						      se.printStackTrace();
						    }
						    catch (Exception e){
						    	//Gestion erreurs pour Class.forName
						    	e.printStackTrace();
						    }
						    finally{
						    	//bloc finally utilisé pour fermer les ressources
						    	try{
						    		if(stmt != null)
						    			stmt.close();
						    	}
						    	catch (SQLException se2){
						    	}//rien à faire
						    	try{
						    		if(conn != null)
						    			conn.close();
						    	}
						    	catch (SQLException se){
						    		se.printStackTrace();
						    	}
						    }	
					}
// Recherche du CDD
		
		public static Cdd idCDD(int idrech){
			Connection conn = null;
			Statement stmt = null;
			    try {
			    //Etape 2: Enregistrement JDBC Driver
			      Class.forName("com.mysql.jdbc.Driver");
			      System.out.println("Driver O.K.");
			      
			    //Etape 3: Ouverture connexion
			      System.out.println("Connexion à la BDD...");
			      conn = DriverManager.getConnection(DB_URL,USER, PASS);
				  System.out.println("Connexion établie...");
			      
			    //Etape 4: Execution de la requête
			      System.out.println("Création de la requête...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "(SELECT * FROM CDD WHERE idEmp='"+idrech+"')";
			      ResultSet rs = stmt.executeQuery(sql);
			      
			    //Etape 5: Extraction data du ResultSet
			      while(rs.next()){
			    	  //Retrieve par colonne
			    	  String nom = rs.getString("nom");
			    	  String prenom = rs.getString("prenom");
			    	  String dateEmbauche = rs.getString("dateEmbauche");
			    	  int etabAffectation = rs.getInt("etabAffectation");
			    	  String dateNaissance = rs.getString("dateNaissance");
			    	  int tel = rs.getInt("tel");
			    	  String email = rs.getString("email");
			    	  String dateFinContrat = rs.getString("dateFinContrat");
			    	  float salaireFixe = rs.getFloat("salaireFixe");
			    	  float salaireVariable = rs.getFloat("salaireVariable");
			    	  boolean conge = rs.getBoolean("conge");
			    	  boolean cloture = rs.getBoolean("cloture");
			    	  
			    	  //affichage des valeurs de la BDD
					  System.out.print("idEmp: "+idrech);
			    	  System.out.print(", Nom: "+nom);
			    	  System.out.print(", Prenom:"+prenom);
			    	  System.out.print(", Date d'embauche:"+dateEmbauche);
			    	  System.out.print(", Etablissement d'affectation :"+etabAffectation);
			    	  System.out.print(", Date de Naissance: "+dateNaissance);
			    	  System.out.print(", Tel: "+tel);
			    	  System.out.print(", Email:"+email);
			    	  System.out.print(", Date fin de contrat:"+dateFinContrat);
			    	  System.out.print(", Salaire Fixe:"+salaireFixe);
			    	  System.out.println(", Salaire Variable:"+salaireVariable);
			    	  System.out.print(", Congé :"+conge);
			    	  System.out.println(", Dossier cloturé :"+cloture);
			    	  
			    	  return new Cdd (nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email, dateFinContrat, salaireFixe, salaireVariable);
			      }
			      
			    //Etape 6: Nettoyage de l'environnement
			      rs.close();
			      stmt.close();
			      conn.close();		         
			    } 
			    catch (SQLException se) {
			    	//Gestion erreurs pour JDBC
			      se.printStackTrace();
			    }
			    catch (Exception e){
			    	//Gestion erreurs pour Class.forName
			    	e.printStackTrace();
			    }
			    finally{
			    	//bloc finally utilisé pour fermer les ressources
			    	try{
			    		if(stmt != null)
			    			stmt.close();
			    	}
			    	catch (SQLException se2){
			    	}//rien à faire
			    	try{
			    		if(conn != null)
			    			conn.close();
			    	}
			    	catch (SQLException se){
			    		se.printStackTrace();
			    	}
			    }
			    return null;
			  }
		
		
		// AFFICHAGE ID ET NOM PRENOM DE TOUS LES ALTERNANTS
				public static void afficheAlternant(){
					Connection conn = null;
					Statement stmt = null;
					    try {
					    //Etape 2: Enregistrement JDBC Driver
					      Class.forName("com.mysql.jdbc.Driver");
					      
					    //Etape 3: Ouverture connexion
					      conn = DriverManager.getConnection(DB_URL,USER, PASS);
					      
					    //Etape 4: Execution de la requête
					      stmt = conn.createStatement();
					      String sql;
					      sql = "(SELECT idEmp,nom,prenom FROM Alternants)";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //Etape 5: Extraction data du ResultSet
					      while(rs.next()){
					    	  //Retrieve par colonne
					    	  int idEmp = rs.getInt("idEmp");
					    	  String nom = rs.getString("nom");
					    	  String prenom = rs.getString("prenom");

					    	  
					    	  //affichage des valeurs de la BDD
							  System.out.print("idEmp: "+idEmp);
					    	  System.out.print(", Nom: "+nom);
					    	  System.out.println(", Prenom:"+prenom);
					      }
					      
						    //Etape 6: Nettoyage de l'environnement
						      rs.close();
						      stmt.close();
						      conn.close();		         
						    } 
						    catch (SQLException se) {
						    	//Gestion erreurs pour JDBC
						      se.printStackTrace();
						    }
						    catch (Exception e){
						    	//Gestion erreurs pour Class.forName
						    	e.printStackTrace();
						    }
						    finally{
						    	//bloc finally utilisé pour fermer les ressources
						    	try{
						    		if(stmt != null)
						    			stmt.close();
						    	}
						    	catch (SQLException se2){
						    	}//rien à faire
						    	try{
						    		if(conn != null)
						    			conn.close();
						    	}
						    	catch (SQLException se){
						    		se.printStackTrace();
						    	}
						    }	
					}
		
				// Recherche de l'alternant 
		
				public static Alternant idAlternant(int idrech){
					Connection conn = null;
					Statement stmt = null;
					    try {
					    //Etape 2: Enregistrement JDBC Driver
					      Class.forName("com.mysql.jdbc.Driver");
					      System.out.println("Driver O.K.");
					      
					    //Etape 3: Ouverture connexion
					      System.out.println("Connexion à la BDD...");
					      conn = DriverManager.getConnection(DB_URL,USER, PASS);
						  System.out.println("Connexion établie...");
					      
					    //Etape 4: Execution de la requête
					      System.out.println("Création de la requête...");
					      stmt = conn.createStatement();
					      String sql;
					      sql = "(SELECT * FROM Alternants WHERE idEmp='"+idrech+"')";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //Etape 5: Extraction data du ResultSet
					      while(rs.next()){
					    	  //Retrieve par colonne
					    	  String nom = rs.getString("nom");
					    	  String prenom = rs.getString("prenom");
					    	  String dateEmbauche = rs.getString("dateEmbauche");
					    	  int etabAffectation = rs.getInt("etabAffectation");
					    	  String dateNaissance = rs.getString("dateNaissance");
					    	  int tel = rs.getInt("tel");
					    	  String email = rs.getString("email");
					    	  String ecole = rs.getString("ecole");
					    	  String cursus = rs.getString("cursus");
					    	  String dateFinContrat = rs.getString("dateFinContrat");
					    	  float salaireFixe = rs.getFloat("salaireFixe");
					    	  boolean conge = rs.getBoolean("conge");
					    	  boolean cloture = rs.getBoolean("cloture");
					    	  
					    	  //affichage des valeurs de la BDD
							  System.out.print("idEmp: "+idrech);
					    	  System.out.print(", Nom: "+nom);
					    	  System.out.print(", Prenom:"+prenom);
					    	  System.out.print(", Date d'embauche:"+dateEmbauche);
					    	  System.out.print(", Etablissement d'affectation :"+etabAffectation);
					    	  System.out.print(", Date de Naissance: "+dateNaissance);
					    	  System.out.print(", Tel: "+tel);
					    	  System.out.print(", Email:"+email);
					    	  System.out.print(", Ecole:"+ecole);
					    	  System.out.print(", Cursus:"+cursus);
					    	  System.out.print(", Date fin de contrat:"+dateFinContrat);
					    	  System.out.print(", Salaire Fixe:"+salaireFixe);
					    	  System.out.print(", Congé :"+conge);
					    	  System.out.println(", Dossier cloturé :"+cloture);
					    	  
					    	  return new Alternant (nom, prenom,dateEmbauche, etabAffectation, dateNaissance, tel, email, ecole, cursus, dateFinContrat, salaireFixe);
					      }
					      
					    //Etape 6: Nettoyage de l'environnement
					      rs.close();
					      stmt.close();
					      conn.close();		         
					    } 
					    catch (SQLException se) {
					    	//Gestion erreurs pour JDBC
					      se.printStackTrace();
					    }
					    catch (Exception e){
					    	//Gestion erreurs pour Class.forName
					    	e.printStackTrace();
					    }
					    finally{
					    	//bloc finally utilisé pour fermer les ressources
					    	try{
					    		if(stmt != null)
					    			stmt.close();
					    	}
					    	catch (SQLException se2){
					    	}//rien à faire
					    	try{
					    		if(conn != null)
					    			conn.close();
					    	}
					    	catch (SQLException se){
					    		se.printStackTrace();
					    	}
					    }
					    return null;
					  }	
				
				
	// AFFICHAGE ID ET NOM PRENOM DE TOUS LES STAGIAIRES
				public static void afficheStagiaire(){
					Connection conn = null;
					Statement stmt = null;
					    try {
					    //Etape 2: Enregistrement JDBC Driver
					      Class.forName("com.mysql.jdbc.Driver");
					      
					    //Etape 3: Ouverture connexion
					      conn = DriverManager.getConnection(DB_URL,USER, PASS);
					      
					    //Etape 4: Execution de la requête
					      stmt = conn.createStatement();
					      String sql;
					      sql = "(SELECT idEmp,nom,prenom FROM Stagiaires)";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //Etape 5: Extraction data du ResultSet
					      while(rs.next()){
					    	  //Retrieve par colonne
					    	  int idEmp = rs.getInt("idEmp");
					    	  String nom = rs.getString("nom");
					    	  String prenom = rs.getString("prenom");

					    	  
					    	  //affichage des valeurs de la BDD
							  System.out.print("idEmp: "+idEmp);
					    	  System.out.print(", Nom: "+nom);
					    	  System.out.println(", Prenom:"+prenom);
					      }
					      
						    //Etape 6: Nettoyage de l'environnement
						      rs.close();
						      stmt.close();
						      conn.close();		         
						    } 
						    catch (SQLException se) {
						    	//Gestion erreurs pour JDBC
						      se.printStackTrace();
						    }
						    catch (Exception e){
						    	//Gestion erreurs pour Class.forName
						    	e.printStackTrace();
						    }
						    finally{
						    	//bloc finally utilisé pour fermer les ressources
						    	try{
						    		if(stmt != null)
						    			stmt.close();
						    	}
						    	catch (SQLException se2){
						    	}//rien à faire
						    	try{
						    		if(conn != null)
						    			conn.close();
						    	}
						    	catch (SQLException se){
						    		se.printStackTrace();
						    	}
						    }	
					}
		// Recherche d'un stagiaire
				
				public static Stagiaire idStagiaire(int idrech){
					Connection conn = null;
					Statement stmt = null;
					    try {
					    //Etape 2: Enregistrement JDBC Driver
					      Class.forName("com.mysql.jdbc.Driver");
					      System.out.println("Driver O.K.");
					      
					    //Etape 3: Ouverture connexion
					      System.out.println("Connexion à la BDD...");
					      conn = DriverManager.getConnection(DB_URL,USER, PASS);
						  System.out.println("Connexion établie...");
					      
					    //Etape 4: Execution de la requête
					      System.out.println("Création de la requête...");
					      stmt = conn.createStatement();
					      String sql;
					      sql = "(SELECT * FROM Stagiaires WHERE idEmp='"+idrech+"')";
					      ResultSet rs = stmt.executeQuery(sql);
					      
					    //Etape 5: Extraction data du ResultSet
					      while(rs.next()){
					    	  //Retrieve par colonne
					    	  String nom = rs.getString("nom");
					    	  String prenom = rs.getString("prenom");
					    	  String dateEmbauche = rs.getString("dateEmbauche");
					    	  int etabAffectation = rs.getInt("etabAffectation");
					    	  String dateNaissance = rs.getString("dateNaissance");
					    	  int tel = rs.getInt("tel");
					    	  String email = rs.getString("email");
					    	  String ecole = rs.getString("ecole");
					    	  String cursus = rs.getString("cursus");
					    	  String dateFinContrat = rs.getString("dateFinContrat");
					    	  float salaireFixe = rs.getFloat("salaireFixe");
					    	  boolean cloture = rs.getBoolean("cloture");
					    	  
					    	  //affichage des valeurs de la BDD
							  System.out.print("idEmp: "+idrech);
					    	  System.out.print(", Nom: "+nom);
					    	  System.out.print(", Prenom:"+prenom);
					    	  System.out.print(", Date d'embauche:"+dateEmbauche);
					    	  System.out.print(", Etablissement d'affectation :"+etabAffectation);
					    	  System.out.print(", Date de Naissance: "+dateNaissance);
					    	  System.out.print(", Tel: "+tel);
					    	  System.out.print(", Email:"+email);
					    	  System.out.print(", Ecole:"+ecole);
					    	  System.out.print(", Cursus:"+cursus);
					    	  System.out.print(", Date fin de contrat:"+dateFinContrat);
					    	  System.out.println(", Salaire Fixe:"+salaireFixe);
					    	  System.out.println(", Dossier cloturé :"+cloture);

					    	  
					    	  return new Stagiaire (nom,prenom, dateEmbauche, etabAffectation,dateNaissance, tel, email, ecole, cursus, dateFinContrat, salaireFixe);
					      }
					      
					    //Etape 6: Nettoyage de l'environnement
					      rs.close();
					      stmt.close();
					      conn.close();		         
					    } 
					    catch (SQLException se) {
					    	//Gestion erreurs pour JDBC
					      se.printStackTrace();
					    }
					    catch (Exception e){
					    	//Gestion erreurs pour Class.forName
					    	e.printStackTrace();
					    }
					    finally{
					    	//bloc finally utilisé pour fermer les ressources
					    	try{
					    		if(stmt != null)
					    			stmt.close();
					    	}
					    	catch (SQLException se2){
					    	}//rien à faire
					    	try{
					    		if(conn != null)
					    			conn.close();
					    	}
					    	catch (SQLException se){
					    		se.printStackTrace();
					    	}
					    }
					    return null;
					  }				

}
	

