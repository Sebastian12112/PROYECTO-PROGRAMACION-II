


package basedatos;

import model.marca;
import model.presentacion;
import model.producto;
import model.proveedor;
import model.zona;

import java.io.IOException;
import java.util.Scanner;

public class menuOpciones {
    
public static Scanner scanner = new Scanner(System.in);
static presentacion pres = new presentacion();
static producto prod = new producto();
static marca  marc = new  marca();
static proveedor prove= new proveedor();
static zona  zon = new zona();

	

 public static void main (String[] args) throws InterruptedException, IOException {

    int opcion =0;     
    do {	
    	
     	System.out.println("QUE DESEA HACER");
    	System.out.println("MENU PRODUCTOS PERECEDEROS");
    	System.out.println( "BIENVENIDO");
        System.out.println(" 1. MARCA");
 		System.out.println(" 2. PRESENTACION");
        System.out.println(" 3. PRODUCTO");
        System.out.println(" 4. PROVEEDOR");
    	System.out.println(" 5. CLIENTE");
    	System.out.println("    PRESIONE 6 PARA SALIR");
    	
    	new ProcessBuilder ("cmd", "/c","cls").inheritIO().start().waitFor();
    	opcion = scanner.nextInt();
    switch (opcion) {
    case 1: 
    	menuMarca();
    	break;
    case 2: 
    	 menuPresentacion();
    	
    	break;
    	
    case 3: 
    	menuProveedor();
    	break;
    case 4: 
    	
    	break;
     case 5: 

    break;
  
     case 6:
    	 System.out.println("------------- FIN -------------");
    	 
    	
    	 break;
     default:	
     
    }
    }while(opcion!= 6);
    	
    
    }
	
 public static void limpiarPantalla() {
		for (int i = 0; i <= 20; i++)
			System.out.println();
	}
	public static void  agregarMarca() {	

		
    	marca marc = new marca();
    	System.out.println("Ingrese Id de marca a actualizar");
    	marc.setIdmarca(scanner.nextInt());
    	System.out.println("Ingrese la descripcion de la marca");
    	marc.setDescripcion(scanner.next());
        System.out.println("marca ingresda");
 
    }
    
	public static void actualizarMarca() {
		
		marca marc = new marca();
    	System.out.println("Ingrese Id de marca a actualizar");
    	marc.setIdmarca(scanner.nextInt());
    	System.out.println("Ingrese la nueva descripcion de la marca");
    	marc.setDescripcion(scanner.next());
        System.out.println("marca actualizada");
		
	}
	
	
	 public static void menuMarca() {
		
		 int opcion =0;
		 opcion = scanner.nextInt();
		    do {	 	
		        System.out.println(" 1. AGREGAR MARCA");
		 		System.out.println(" 2. ACTUALIZAR");
		    switch (opcion) {
		    case 1: 
		    	agregarMarca();
		    	break;
		    case 2: 
		    	actualizarMarca();
		    	break;
		    
		    case 3:	
		    	System.out.println("------------- FIN -------------");
		    	break;
		    default:
		    }
		    }while(opcion!= 3);
	 }
	
    public static void agregarPresentacion() {

           	System.out.println("Ingrese Id de presentacion");
        	pres.setIdPresentacion(scanner.nextInt());
        	System.out.println("Ingrese descripcion de presentacion");
    
	    pres.setDescripcion(scanner.next());
    	}
    
    public static void actualizarPresentacion() {

       	System.out.println("Ingrese Id de presentacion");
    	pres.setIdPresentacion(scanner.nextInt());
    	System.out.println("Ingrese la nueva descripcion de presentacion");

    pres.setDescripcion(scanner.next());
	}
    
    public static void menuPresentacion() {
		
		 int opcion =0;
		 opcion = scanner.nextInt();
		    do {	 	
		        System.out.println(" 1. AGREGAR PRESENTACION");
		 		System.out.println(" 2. ACTUALIZAR");
		    switch (opcion) {
		    case 1: 
		    	agregarPresentacion();
		    	break;
		    case 2: 
		    	actualizarPresentacion();
		    	break;
		    
		    case 3:	
		    	System.out.println("------------- FIN -------------");
		    	break;
            default:

		    }
		    }while(opcion!= 3);

	 }  
    
   
    
    
    public static void agregarProducto() {

    	System.out.println("Ingrese codigo de producto");
    	prod.setCodigo(scanner.nextInt());
    	
    	System.out.println("Ingrese descripcion de producto");
    	 prod.setDescripcion_producto(scanner.next());
    	 
    	System.out.println("Ingrese el precio del producto");
    	prod.setPrecio(scanner.nextDouble());
    	
    	System.out.println("Ingrese  existencia");
    	prod.setStock(scanner.nextInt());
    	
    	System.out.println("Ingrese precio de producto");
    	prod.setPrecio(scanner.nextDouble());
    	
    	System.out.println("Ingrese id marca");
    	prod.setIdproducto(scanner.nextInt());
    	
    	System.out.println("Ingrese Id  de presentacion");
    	prod.setIdproducto(scanner.nextInt());
    	
    	System.out.println("Ingrese Id  de proveedor  ");
    	prod.setId_proveedor(scanner.nextInt());
    	
    	System.out.println("Ingrese Id  de cliente");
    	prod.setId_zona(scanner.nextInt());
    	System.out.println("Ingrese Id  de producto");
    	prod.setIdproducto(scanner.nextInt());
  
    }
    	
    	
    public static void agregarProveedor() {
    System.out.println("Ingrese Id de proveedor");
    prove.setIdproveedor(scanner.nextInt());
    	System.out.println("ingrese descripcion proveedor");
    	prove.setDescripcion(scanner.next());
    }
    
    public static void actualizarProveedor() {
        System.out.println("Ingrese Id de proveedor");
        prove.setIdproveedor(scanner.nextInt());
        	System.out.println("ingrese la nueva descripcion proveedor");
        	prove.setDescripcion(scanner.next());
        }
    
    
    public static void menuProveedor() {
		
		 int opcion =0;
		 opcion = scanner.nextInt();
		    do {	 	
		        System.out.println(" 1. AGREGAR PROVEEDOR");
		 		System.out.println(" 2. ACTUALIZAR");
		    switch (opcion) {
		    case 1: 
		    	agregarProveedor();
		    	break;
		    case 2: 
		    	actualizarProveedor();
		    	break;
		    
		    case 3:	
		    	System.out.println("------------- FIN -------------");
		    	break;
            default:

		    }
		    }while(opcion!= 3);
	 }  
    
    
    
    
    
    
    public static void agregarCliente() {
    	System.out.println("ingrese Id de cliente");
    	zon.setIdznona(scanner.nextInt());
    	System.out.println("ingrese descripcion de cliente");
    	zon.setDescripcion(scanner.next());  
    	}
    
    public static void actualizarCliente() {
    	System.out.println("ingrese Id de cliente");
    	zon.setIdznona(scanner.nextInt());
    	System.out.println("ingrese la nueva descripcion de cliente");
    	zon.setDescripcion(scanner.next());  
    	}
   
    
    public static void  menuCliente() {
		
		 int opcion =0;
		 opcion = scanner.nextInt();
		    do {	 	
		        System.out.println(" 1. AGREGAR CLIENTE");
		 		System.out.println(" 2. ACTUALIZAR");
		    switch (opcion) {
		    case 1: 
		    	agregarCliente();
		    	break;
		    case 2: 
		    	actualizarCliente();
		    	break;
		    
		    case 3:	
		    	System.out.println("REGRESAR A MENU PRINCIPAL");
		    	break;
            default:

		    }
		    }while(opcion!= 3);
	 }  
   
    
    
    
    }
    



  //marca marc = new marca();
    
    //marc.setIdmarca(1);
   // marc.setDescripcion("diana");
    
    //marcaCRUD mc = new marcaCRUD();
    //mc.insertarMarca(marc);
    
    
