package model;

public class presentacion {
private int idpresentacion;
private String descripcion;

public presentacion(){
	
}

public presentacion(int idpresentacion, String descripcion) {
	this.idpresentacion = idpresentacion;
	this.descripcion = descripcion;
}

public int getIdPresentacion() {
	return idpresentacion;
}

public void setIdPresentacion(int idpresentacion) {
	this.idpresentacion = idpresentacion;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}








}
