package basedatos;

public class test {
  public static void main(String[] args) {
	  
	  conexion c = new conexion();
	  conexionMarca m = new conexionMarca();
	  conexionPresentacion p = new conexionPresentacion();
	  conexionProveedor prov = new conexionProveedor();
	  conexionZona cz= new conexionZona();
	  
	  c.conectarme();
	  m.conectarmeMarca();
	  p.conectarmePresentacion();
	  prov.conectarmeProveedor();
	  cz.conectarmeZona();
	  
	  if(c.cadena!=null) {
		  System.out.println("EXITO");
	  }else {
	  System.out.println("NO HAY CONEXION");
	  }

	  if(m.cadenaMarca!=null) {
		  System.out.println("EXITO");
	  }else {
	  System.out.println("NO HAY CONEXION");
	  }
	  
	  if(p.cadenaPresentacion!=null) {
		  System.out.println("EXITO");
	  }else {
	  System.out.println("NO HAY CONEXION");
	  }
	   
	  if(prov.cadenaProveedor!=null) {
		  System.out.println("EXITO");
	  }else {
	  System.out.println("NO HAY CONEXION");
	  }
	  
	  if(cz.cadenaZona!=null) {
		  System.out.println("EXITO");
	  }else {
	  System.out.println("NO HAY CONEXION");
	  }
 
  }

}	
	   
  //marca marc = new marca();
  
  //marc.setIdmarca(1);
 // marc.setDescripcion("diana");
  
  //marcaCRUD mc = new marcaCRUD();
  //mc.insertarMarca(marc);
  
  
  
  //productoCRUD pc = new productoCRUD();
 // pc.insertar(pro);
 // marcaCRUD mc = new marcaCRUD();
  

