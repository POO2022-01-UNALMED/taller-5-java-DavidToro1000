package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public Anfibio() {
    	super();
		listado.add(this);
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
   	 super(nombre, edad, habitat, genero);
   	 this.colorPiel=colorPiel;
   	 this.venenoso=venenoso;
   	 listado.add(this);
    }
    public void setColorPiel(String colorPiel) {
		this.colorPiel=colorPiel;
	}
	public String getColorPiel() {
		return(colorPiel);
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso=venenoso;
	}
	public boolean getVenenoso() {
		return(venenoso);
	}
    public static int cantidadAnfibios() {
    	return(listado.size());
    }
    public ArrayList<Anfibio> getListado(){
 		return listado;
 	}
    public String movimiento() {
    	return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad,String genero, Zona zona) {
     	Anfibio.ranas+=1;
     	return new Anfibio(nombre, edad, "selva",genero, zona, "rojo", true);
     }
    public static Anfibio crearSalamandra(String nombre, int edad,String genero, Zona zona) {
     	Anfibio.ranas+=1;
     	return new Anfibio(nombre, edad, "selva",genero, zona, "negro y amarillo", false);
     }
}
