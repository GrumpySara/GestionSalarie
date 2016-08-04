import java.sql.*;

	public class DriverModifier {

			//JDBC diver nom et database URL
			static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
			static final String DB_URL = "jdbc:mysql://localhost:8889/RH";
			
			//BDD IDs
			static final String USER ="root";
			static final String PASS="root";
			
// MODIFIER NOM CADRE
			// Modifier nom
			
			public static void idCadreNom (int idrech, String nom){
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
				      String sql = "UPDATE Cadres SET nom=? WHERE idEmp=?";
				      PreparedStatement preparedStmt = conn.prepareStatement(sql);
				      preparedStmt.setString(1,nom);
				      preparedStmt.setInt(2,idrech);
				      preparedStmt.executeUpdate();

				    //Etape 5: Nettoyage de l'environnement
				      preparedStmt.close();
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
			
		// CADRE : Modifier prenom 
			
			public static void idCadrePrenom (int idrech, String prenom){
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
				      String sql = "UPDATE Cadres SET prenom=? WHERE idEmp=?";
				      PreparedStatement preparedStmt = conn.prepareStatement(sql);
				      preparedStmt.setString(1,prenom);
				      preparedStmt.setInt(2,idrech);
				      preparedStmt.executeUpdate();

				    //Etape 5: Nettoyage de l'environnement
				      preparedStmt.close();
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
		// CADRE : modifier date d'embauche
			public static void idCadreEmbauche (int idrech, String dateEmbauche){
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
				      String sql = "UPDATE Cadres SET dateEmbauche=? WHERE idEmp=?";
				      PreparedStatement preparedStmt = conn.prepareStatement(sql);
				      preparedStmt.setString(1,dateEmbauche);
				      preparedStmt.setInt(2,idrech);
				      preparedStmt.executeUpdate();

				    //Etape 5: Nettoyage de l'environnement
				      preparedStmt.close();
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
			
			// CADRE : modifier établissement affectation
						public static void idCadreEtabAffectation (int idrech, int etabAffectation){
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
							      String sql = "UPDATE Cadres SET etabAffectation=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setInt(1,etabAffectation);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
				
				// CADRE : modifier date de naissance
						public static void idCadreDateNaissance (int idrech, String dateNaissance){
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
							      String sql = "UPDATE Cadres SET dateNaissance=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setString(1,dateNaissance);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
					
					// CADRE : modifier telephone
						public static void idCadreTel (int idrech, int tel){
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
							      String sql = "UPDATE Cadres SET tel=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setInt(1,tel);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
		
					// CADRE : modifier email
						public static void idCadreEmail (int idrech, String email){
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
							      String sql = "UPDATE Cadres SET email=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setString(1,email);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
			// CADRE : modifier le taux jour 
						public static void idCadreTauxJour (int idrech, float tauxJour){
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
							      String sql = "UPDATE Cadres SET tauxJour=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setFloat(1,tauxJour);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
						
						// CADRE : modifier conge
						public static void idCadreConge (int idrech, boolean conge){
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
							      String sql = "UPDATE Cadres SET conge=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setBoolean(1,conge);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
					
					// CADR : moEdifier cloture
						public static void idCadreCloture (int idrech, boolean cloture){
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
							      String sql = "UPDATE Cadres SET cloture=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setBoolean(1,cloture);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
						
		// MODIFIER CDD
				// CDD : Modifier nom
						
						public static void idCddNom (int idrech, String nom){
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
							      String sql = "UPDATE CDD SET nom=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setString(1,nom);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
						
					// CDD : Modifier prenom 
						
						public static void idCddPrenom (int idrech, String prenom){
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
							      String sql = "UPDATE CDD SET prenom=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setString(1,prenom);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
					// CADRE : modifier date d'embauche
						public static void idCddEmbauche (int idrech, String dateEmbauche){
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
							      String sql = "UPDATE CDD SET dateEmbauche=? WHERE idEmp=?";
							      PreparedStatement preparedStmt = conn.prepareStatement(sql);
							      preparedStmt.setString(1,dateEmbauche);
							      preparedStmt.setInt(2,idrech);
							      preparedStmt.executeUpdate();

							    //Etape 5: Nettoyage de l'environnement
							      preparedStmt.close();
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
						
						// CDD : modifier établissement affectation
									public static void idCddEtabAffectation (int idrech, int etabAffectation){
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
										      String sql = "UPDATE CDD SET etabAffectation=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setInt(1,etabAffectation);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
							
							// CDD : modifier date de naissance
									public static void idCddDateNaissance (int idrech, String dateNaissance){
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
										      String sql = "UPDATE CDD SET dateNaissance=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setString(1,dateNaissance);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
								
								// CADRE : modifier telephone
									public static void idCddTel (int idrech, int tel){
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
										      String sql = "UPDATE CDD SET tel=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setInt(1,tel);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
					
								// CDD : modifier email
									public static void idCddEmail (int idrech, String email){
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
										      String sql = "UPDATE CDD SET email=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setString(1,email);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
						// CDD : modifier salaire fixe
									public static void idCddSalaireFixe (int idrech, float salaireFixe){
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
										      String sql = "UPDATE CDD SET salaireFixe=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setFloat(1,salaireFixe);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
					// CDD : modifier salaire fixe
									public static void idCddSalaireVariable (int idrech, float salaireVariable){
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
										      String sql = "UPDATE CDD SET salaireVariable=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setFloat(1,salaireVariable);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
						// CDD : modifier conge
									public static void idCddConge (int idrech, boolean conge){
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
										      String sql = "UPDATE CDD SET conge=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setBoolean(1,conge);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
								
									// CDD : modifier cloture
									public static void idCddCloture (int idrech, boolean cloture){
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
										      String sql = "UPDATE CDD SET cloture=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setBoolean(1,cloture);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
						// MODIFIER ALTERNANT
									// ALTERNANT : Modifier nom
									
									public static void idAlternantNom (int idrech, String nom){
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
										      String sql = "UPDATE Alternants SET nom=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setString(1,nom);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
									
								// ALTERNANT : Modifier prenom 
									
									public static void idAlternantPrenom (int idrech, String prenom){
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
										      String sql = "UPDATE Alternants SET prenom=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setString(1,prenom);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
								// ALTERNANT: modifier date d'embauche
									public static void idAlternantEmbauche (int idrech, String dateEmbauche){
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
										      String sql = "UPDATE Alternants SET dateEmbauche=? WHERE idEmp=?";
										      PreparedStatement preparedStmt = conn.prepareStatement(sql);
										      preparedStmt.setString(1,dateEmbauche);
										      preparedStmt.setInt(2,idrech);
										      preparedStmt.executeUpdate();

										    //Etape 5: Nettoyage de l'environnement
										      preparedStmt.close();
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
									
									// ALTERNANT : modifier établissement affectation
												public static void idAlternantEtabAffectation (int idrech, int etabAffectation){
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
													      String sql = "UPDATE Alternants SET etabAffectation=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setInt(1,etabAffectation);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
										
										// ALTERNANT : modifier date de naissance
												public static void idAlternantDateNaissance (int idrech, String dateNaissance){
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
													      String sql = "UPDATE Alternants SET dateNaissance=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,dateNaissance);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
											
											// ALTERNANT : modifier telephone
												public static void idAlternantTel (int idrech, int tel){
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
													      String sql = "UPDATE Alternants SET tel=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setInt(1,tel);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
								
											// STAGIAIRE : modifier email
												public static void idAlternantEmail (int idrech, String email){
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
													      String sql = "UPDATE Alternants SET email=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,email);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
												// ALTERNANT : modifier ecole
												public static void idAlternantEcole (int idrech, String ecole){
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
													      String sql = "UPDATE Alternants SET ecole=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,ecole);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
										// ALTERNANT : modifier cursus
												public static void idAlternantCursus (int idrech, String cursus){
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
													      String sql = "UPDATE Alternants SET cursus=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,cursus);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
										// ALTERNANT : modifier la date de fin du contrat
												public static void idAlternantDateFinContrat (int idrech, String dateFinContrat){
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
													      String sql = "UPDATE Alternants SET dateFinContrat=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,dateFinContrat);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
									// Alternant : modifier le salaire fixe 
												public static void idAlternantSalaireFixe (int idrech, float salaireFixe){
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
													      String sql = "UPDATE Alternants SET salaireFixe=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setFloat(1,salaireFixe);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
					
												// ALTERNANT : modifier conge
												public static void idAlternantConge (int idrech, boolean conge){
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
													      String sql = "UPDATE Alternants SET conge=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setBoolean(1,conge);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
											
												// ALTERNANT : modifier cloture
												public static void idAlternantCloture (int idrech, boolean cloture){
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
													      String sql = "UPDATE Alternants SET cloture=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setBoolean(1,cloture);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
												
												
												
					// MODIFIER STAGIAIRE
												// STAGIAIRE : Modifier nom
												
												public static void idStagiaireNom (int idrech, String nom){
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
													      String sql = "UPDATE Stagiaires SET nom=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,nom);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
												
											// STAGIAIRE : Modifier prenom 
												
												public static void idStagiairePrenom (int idrech, String prenom){
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
													      String sql = "UPDATE Stagiaires SET prenom=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,prenom);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
											// STAGIAIRE : modifier date d'embauche
												public static void idStagiaireEmbauche (int idrech, String dateEmbauche){
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
													      String sql = "UPDATE Stagiaires SET dateEmbauche=? WHERE idEmp=?";
													      PreparedStatement preparedStmt = conn.prepareStatement(sql);
													      preparedStmt.setString(1,dateEmbauche);
													      preparedStmt.setInt(2,idrech);
													      preparedStmt.executeUpdate();

													    //Etape 5: Nettoyage de l'environnement
													      preparedStmt.close();
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
												
												// STAGIAIRE : modifier établissement affectation
															public static void idStagiaireEtabAffectation (int idrech, int etabAffectation){
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
																      String sql = "UPDATE Stagiaires SET etabAffectation=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setInt(1,etabAffectation);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
													
													// STAGIAIRE : modifier date de naissance
															public static void idStagiaireDateNaissance (int idrech, String dateNaissance){
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
																      String sql = "UPDATE Stagiaires SET dateNaissance=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setString(1,dateNaissance);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
														
														// STAGIAIRE : modifier telephone
															public static void idStagiaireTel (int idrech, int tel){
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
																      String sql = "UPDATE Stagiaires SET tel=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setInt(1,tel);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
											
														// STAGIAIRE : modifier email
															public static void idStagiaireEmail (int idrech, String email){
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
																      String sql = "UPDATE Stagiaires SET email=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setString(1,email);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
															// STAGIAIRE : modifier école
															public static void idStagiaireEcole (int idrech, String ecole){
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
																      String sql = "UPDATE Stagiaires SET ecole=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setString(1,ecole);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
													// STAGIAIRE : modifier cursus
															public static void idStagiaireCursus (int idrech, String cursus){
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
																      String sql = "UPDATE Stagiaires SET cursus=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setString(1,cursus);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
													// STAGIAIRE : modifier la date de fin du contrat
															public static void idStagiaireDateFinContrat (int idrech, String dateFinContrat){
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
																      String sql = "UPDATE Stagiaires SET dateFinContrat=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setString(1,dateFinContrat);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
												// STAGIAIRE : modifier le salaire fixe 
															public static void idStagiaireSalaireFixe (int idrech, float salaireFixe){
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
																      String sql = "UPDATE Cadres SET salaireFixe=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setFloat(1,salaireFixe);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
															
													// STAGIAIRE: modifier cloture
															public static void idStagiaireCloture (int idrech, boolean cloture){
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
																      String sql = "UPDATE Stagiaires SET cloture=? WHERE idEmp=?";
																      PreparedStatement preparedStmt = conn.prepareStatement(sql);
																      preparedStmt.setBoolean(1,cloture);
																      preparedStmt.setInt(2,idrech);
																      preparedStmt.executeUpdate();

																    //Etape 5: Nettoyage de l'environnement
																      preparedStmt.close();
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
	}
		



