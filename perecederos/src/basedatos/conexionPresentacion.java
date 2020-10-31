package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionPresentacion {
	private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/perecederos?useSSL=false";
	private final String USER = "root";
	private final String PASSWORD ="MyNicolas1";
	
	public Connection cadenaPresentacion;
	
	public conexionPresentacion() {
		this.cadenaPresentacion = null;
	}
	
	public Connection conectarmePresentacion() {
		try {
			Class.forName(DRIVER);
			this.cadenaPresentacion = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		}
		
		return this.cadenaPresentacion;
	}
	
	public Connection desconectarmePresentacion() {
		try {
		this.cadenaPresentacion.close();
		} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		}
		
		return this.cadenaPresentacion;
	}
	
	
	
	
	
	
	
	
	
}
