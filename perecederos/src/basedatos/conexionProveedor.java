package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionProveedor {
		private final String DRIVER = "com.mysql.jdbc.Driver";
		private final String URL = "jdbc:mysql://localhost:3306/perecederos?useSSL=false";
		private final String USER = "root";
		private final String PASSWORD ="MyNicolas1";
		
		
		public Connection cadenaProveedor;
		public conexionProveedor() {
			this.cadenaProveedor = null;
		}
		
		public Connection conectarmeProveedor() {
	      try {
			Class.forName(DRIVER);
			this.cadenaProveedor = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
			return this.cadenaProveedor;
			
		}
		
		public Connection desconectarProveedor() {
			
			try {
				this.cadenaProveedor.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return this.cadenaProveedor;
			
		}
		
	
}
