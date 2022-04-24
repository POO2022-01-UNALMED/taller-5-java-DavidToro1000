package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    public Mamifero() {
    	super();
		listado.add(this);
    }
    public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
   	 super(nombre, edad, habitat, genero);
   	 this.pelaje=pelaje;
   	 this.patas=patas;
   	 listado.add(this);
    }
    public void setPatas(int patas) {
		this.patas=patas;
	}
	public int getPatas() {
		return(patas);
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	public boolean getPelaje() {
		return(pelaje);
	}
    public ArrayList<Mamifero> getListado(){
 		return listado;
 	}
    public static Mamifero crearCaballo(String nombre, int edad,String genero) {
    	Mamifero.caballos+=1;
    	return new Mamifero(nombre, edad, "pradera",genero,  true, 4);
    }
    public static Mamifero crearLeon(String nombre, int edad,String genero) {
    	Mamifero.leones+=1;
    	return new Mamifero(nombre, edad, "selva",genero, true, 4);
    }
    public static int cantidadMamiferos() {
    	return(listado.size());
    }
}
