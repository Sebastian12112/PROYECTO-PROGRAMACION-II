package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionZona {
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/perecederos?useSSL=false";
	private final String USER = "root";
	private final String PASSWORD ="MyNicolas1";
	
	public Connection cadenaZona;
	 public conexionZona() {
		 this.cadenaZona = null;
	 }
	
	 public Connection conectarmeZona() {
		 
		 try {
			Class.forName(DRIVER);
			this.cadenaZona =DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 return this.cadenaZona;
	 }
	
	 
	 public Connection desconectarmeZona() {
		 try {
			this.cadenaZona.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 return this.cadenaZona;
		 
	 }
}
