package model;

public class proveedor {

	private int idproveedor;
	private String descripcion;
	
	public proveedor() {

	}

	public proveedor(int idproveedor, String descripcion) {
		super();
		this.idproveedor = idproveedor;
		this.descripcion = descripcion;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
}
