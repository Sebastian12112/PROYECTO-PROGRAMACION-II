package CRUD;

import java.sql.PreparedStatement;


import basedatos.conexion;

import model.producto;

public class productoCRUD {
   
private PreparedStatement ps;

private boolean flag;

public boolean insertar(Object o) {
	producto p = (producto) o;
	flag = false;
	
	conexion c = new conexion();
		String query = "insert into producto(idproducto, id_marca, id_presentacion, id_proveedor, id_zona, codigo, descripcion_producto, precio, stock)"+" values(?,?,?,?,?,?,?,?,?)";
	
		
		try {
			ps = c.conectarme().prepareStatement(query);
			ps.setInt(1, p.getIdproducto());
			ps.setInt(2, p.getId_marca());
			ps.setInt(3, p.getId_presentacion());
			ps.setInt(4, p.getId_proveedor());
			ps.setInt(5, p.getId_zona());
			ps.setInt(6, p.getCodigo());
			ps.setString(7, p.getDescripcion_producto());
			ps.setDouble(8, p.getPrecio());
			ps.setInt(9, p.getStock());
					} catch (Exception e) {
            System.out.println(e.getMessage());
		}finally {
			ps= null;
			c.desconectar();
		}
		
	return flag;
}

public boolean actualizarProducto(Object o) {
     producto p = (producto) o;
     
	
	
	flag = false;
	
	conexion c = new conexion();
	String query = "update into producto(idmarca, descripcion)"+"values(?,?)";
	
	try {
		ps = c.conectarme().prepareStatement(query);
		ps.setInt(1, p.getIdproducto());
		ps.setInt(2, p.getId_marca());
		ps.setInt(3, p.getId_presentacion());
		ps.setInt(4, p.getId_proveedor());
		ps.setInt(5, p.getId_zona());
		ps.setInt(6, p.getCodigo());
		ps.setString(7, p.getDescripcion_producto());
		ps.setDouble(8, p.getPrecio());
		ps.setInt(9, p.getStock());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	ps = null;
			c.desconectar();
	return flag;

}
}
