package CRUD;

import java.sql.PreparedStatement;


import basedatos.conexionMarca;
import model.marca;

public class marcaCRUD {
private PreparedStatement ps;

private boolean flag;

public boolean insertarMarca(Object o) {
	
	marca m = (marca) o;
	
	flag = false;
	
	conexionMarca c = new conexionMarca();
	String query = "insert into marca(idmarca, descripcion)"+"values(?,?)";
	
	try {
		
		ps=c.conectarmeMarca().prepareStatement(query);
		ps.setInt(1, m.getIdmarca());
		ps.setString(2, m.getDescripcion());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	ps = null;
			c.desconectarMarca();
	return flag;
}



public void eliminarMarca(Object o) {
flag  = false;


conexionMarca c = new conexionMarca();
String query = "delete from marca WHERE idmarca";
 
try {
	
	ps=c.conectarmeMarca().prepareStatement(query);
} catch (Exception e) {
	System.out.println(e.getMessage());
}finally {

ps = null;
c.desconectarMarca();
}
		
	
	
}

 public boolean actualizarMarca(Object o) {
	flag = false;
	marca m = (marca) o;
	
	flag = false;
	
	conexionMarca c = new conexionMarca();
	String query = "update into marca(idmarca, descripcion)"+"values(?,?)";
	
	try {
		ps=c.conectarmeMarca().prepareStatement(query);
		ps.setInt(1, m.getIdmarca());
		ps.setString(2, m.getDescripcion());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	ps = null;
			c.desconectarMarca();
	return flag;
 }

	
	
}
