package model;

public class zona {
private int idznona;
private String descripcion;

public zona() {
	
}

public zona(int idznona, String descripcion) {
	super();
	this.idznona = idznona;
	this.descripcion = descripcion;
}

public int getIdznona() {
	return idznona;
}

public void setIdznona(int idznona) {
	this.idznona = idznona;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



}
