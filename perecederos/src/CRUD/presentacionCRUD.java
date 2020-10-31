package CRUD;

import java.sql.PreparedStatement;


import basedatos.conexionPresentacion;
import model.presentacion;

public class presentacionCRUD {
private PreparedStatement ps;

private boolean flag;


public boolean insertarPresentacion(Object o) {
	presentacion pr = (presentacion) o;

    flag = false;
	
	conexionPresentacion cp = new conexionPresentacion();
	String query = "insert into presentacion(idpresentacion, descripcion)"+"values(?,?)";
	
	try {
		ps = cp.conectarmePresentacion().prepareStatement(query);
		ps.setInt(1, pr.getIdPresentacion());
		ps.setString(2, pr.getDescripcion());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	 ps=null;

	     cp.desconectarmePresentacion();
	
	return flag;
}

public boolean actualizarPresentacion(Object o) {
	presentacion pr = (presentacion) o;

    flag = false;
	
	conexionPresentacion cp = new conexionPresentacion();
	String query = "update into presentacion(idpresentacion, descripcion)"+"values(?,?)";
	
	try {
		ps = cp.conectarmePresentacion().prepareStatement(query);
		ps.setInt(1, pr.getIdPresentacion());
		ps.setString(2, pr.getDescripcion());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	 ps=null;

	     cp.desconectarmePresentacion();
	
	return flag;
}



}
