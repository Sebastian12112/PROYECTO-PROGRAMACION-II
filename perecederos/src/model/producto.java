package model;

public class producto {
      private int idproducto;
      private int id_marca;
      private int id_presentacion;
      private int id_proveedor;
      private int id_zona;
      private int codigo;
      private String descripcion_producto;
	 private double precio;
	 private int stock;
	
	 public producto() {
		 
	 }

	

	 public producto (int idproducto, int id_marca, int id_presentacion, int id_proveedor, int id_zona, int codigo,
				String descripcion_producto, double precio, int stock) {

		this.idproducto = idproducto;
		this.id_marca = id_marca;
		this.id_presentacion = id_presentacion;
		this.id_proveedor = id_proveedor;
		this.id_zona = id_zona;
		this.codigo = codigo;
		this.descripcion_producto = descripcion_producto;
		this.precio = precio;
		this.stock = stock;
	}






	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getId_marca() {
		return id_marca;
	}

	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}

	public int getId_presentacion() {
		return id_presentacion;
	}

	public void setId_presentacion(int id_presentacion) {
		this.id_presentacion = id_presentacion;
	}

	public int getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	 
	 
}
