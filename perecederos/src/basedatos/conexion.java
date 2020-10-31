package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
private final String DRIVER = "com.mysql.jdbc.Driver";
private final String URL = "jdbc:mysql://localhost:3306/perecederos?useSSL=false";
private final String USER = "root";
private final String PASSWORD ="MyNicolas1";

public Connection cadena;

public conexion() {
   this.cadena = null;
}

  public Connection conectarme() {
	  
	  
	  try {
		  
		  Class.forName(DRIVER);
		  this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
		  
	  }catch(Exception e){
		  System.out.println(e.getMessage());
	  }
	  
	  return this.cadena;
  }
  
  public Connection desconectar() {
	  
	  try {
		this.cadena.close();
	} catch ( Exception e) {
		System.out.println(e.getMessage());
	}
	  
	 return this.cadena;
  }
	
	
}

