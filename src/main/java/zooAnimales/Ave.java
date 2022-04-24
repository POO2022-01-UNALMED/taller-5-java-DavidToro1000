package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public Ave() {
    	super();
		listado.add(this);
    }
    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
   	 super(nombre, edad, habitat, genero);
   	 this.colorPlumas=colorPlumas;
   	 listado.add(this);
    }
    public void setColorPlumas(String colorPlumas) {
 		this.colorPlumas=colorPlumas;
 	}
 	public String getColorPlumas() {
 		return(colorPlumas);
 	}
 	public ArrayList<Ave> getListado(){
 		return listado;
 	}
    public static int cantidadAves() {
    	return(listado.size());
    }
    public String movimiento() {
    	return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad,String genero) {
    	Ave.halcones+=1;
    	return new Ave(nombre, edad, "Montanas",genero, "cafe glorioso");
    }
    public static Ave crearAguila(String nombre, int edad,String genero) {
    	Ave.aguilas+=1;
    	return new Ave(nombre, edad, "Montanas",genero,"blanco y amarillo");
    }
}
