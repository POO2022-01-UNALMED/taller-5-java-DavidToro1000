package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public Reptil() {
    	super();
		listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
   	 super(nombre, edad, habitat, genero);
   	 this.colorEscamas=colorEscamas;
   	 this.largoCola=largoCola;
   	 listado.add(this);
    }
    public void setColorEscamas(String colorEscamas) {
 		this.colorEscamas=colorEscamas;
 	}
 	public String getColorEscamas() {
 		return(colorEscamas);
 	}
 	public void setLargoCola(int largoCola) {
 		this.largoCola=largoCola;
 	}
 	public int getLargoCola() {
 		return(largoCola);
 	}
 	public ArrayList<Reptil> getListado(){
 		return listado;
 	}
    public static int cantidadReptiles() {
    	return(listado.size());
    }
    public String movimiento() {
    	return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad,String genero, Zona zona) {
    	Reptil.iguanas+=1;
    	return new Reptil(nombre, edad, "humedal",genero, zona, "verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad,String genero, Zona zona) {
    	Reptil.serpientes+=1;
    	return new Reptil(nombre, edad, "jungla",genero, zona, "blanco", 1);
    }
}
