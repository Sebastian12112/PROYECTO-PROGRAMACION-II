package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionMarca {

		private final String DRIVER = "com.mysql.jdbc.Driver";
		private final String URL = "jdbc:mysql://localhost:3306/perecederos?useSSL=false";
		private final String USER = "root";
		private final String PASSWORD ="MyNicolas1";
				
	public Connection  cadenaMarca;
	
	
	public conexionMarca () {
		this.cadenaMarca = null;
	}
	
	 public Connection conectarmeMarca() {
		 
	     try {
			Class.forName(DRIVER);
			this.cadenaMarca = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
		   System.out.println(e.getLocalizedMessage());
		}
		 return this.cadenaMarca;
		 
	 }
	 
	 public Connection desconectarMarca() {
		 try {
			this.cadenaMarca.close();
		} catch ( Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return this.cadenaMarca;
	}

	public static void prepareStatement(String string) {
		// TODO Auto-generated method stub
		
	} 
	 
	}

	

