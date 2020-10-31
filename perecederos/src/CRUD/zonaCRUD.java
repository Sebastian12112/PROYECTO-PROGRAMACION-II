package CRUD;

import java.sql.PreparedStatement;


import basedatos.conexionZona;
import model.zona;

public class zonaCRUD {

	private PreparedStatement ps;

	private boolean flag;	
	
	public boolean insertarZona(Object o) {
		zona z = (zona) o;
		
		flag = false ;
		
		conexionZona cz = new conexionZona();
		String query = "insert into zona(id_zona, descripion)"+"values(?,?)";
		  
		try {
			ps = cz.conectarmeZona().prepareStatement(query);
			ps.setInt(1, z.getIdznona());
			ps.setString(2, z.getDescripcion());
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
		
		ps = null;
		
		cz.desconectarmeZona();		
		return flag;
		
		
	}

	public boolean actualizarZona(Object o) {
		zona z = (zona) o;
		
		flag = false ;
		
		conexionZona cz = new conexionZona();
		String query = "update into zona(id_zona, descripion)"+"values(?,?)";
		  
		try {
			ps = cz.conectarmeZona().prepareStatement(query);
			ps.setInt(1, z.getIdznona());
			ps.setString(2, z.getDescripcion());
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
		
		ps = null;
		
		cz.desconectarmeZona();		
		return flag;
		
		
	}
}
