package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public Reptil() {
    	super();
		listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
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
    public static Reptil crearIguana(String nombre, int edad,String genero) {
    	Reptil.iguanas+=1;
    	return new Reptil(nombre, edad, "humedal",genero, "verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad,String genero) {
    	Reptil.serpientes+=1;
    	return new Reptil(nombre, edad, "jungla",genero, "blanco", 1);
    }
}
