package CRUD;

import java.sql.PreparedStatement;


import basedatos.conexionProveedor;
import model.proveedor;

public class proveedorCRUD {
	private PreparedStatement ps;

	private boolean flag;
	
	
	public boolean insertProveedor(Object o) {
		proveedor prov = (proveedor) o;
		 flag = false;
		 
		 conexionProveedor cop = new conexionProveedor();
		 String query = "insert into(idproveedor, descripcion)"+"values(?,?)";
		 
		 try {
			ps= cop.conectarmeProveedor().prepareStatement(query);
			ps.setInt(1, prov.getIdproveedor());
			ps.setString(2, prov.getDescripcion());
			
		} catch (Exception e) {
          System.out.println(e.getMessage());
		}
		
		ps= null;
		
		cop.desconectarProveedor();
		
		return flag;
	}
	
	public boolean actualizarProveedor(Object o) {
		proveedor prov = (proveedor) o;
		 flag = false;
		 
		 conexionProveedor cop = new conexionProveedor();
		 String query = "update into(idproveedor, descripcion)"+"values(?,?)";
		 
		 try {
			ps= cop.conectarmeProveedor().prepareStatement(query);
			ps.setInt(1, prov.getIdproveedor());
			ps.setString(2, prov.getDescripcion());
			
		} catch (Exception e) {
          System.out.println(e.getMessage());
		}
		
		ps= null;
		
		cop.desconectarProveedor();
		
		return flag;
	}
	
}
