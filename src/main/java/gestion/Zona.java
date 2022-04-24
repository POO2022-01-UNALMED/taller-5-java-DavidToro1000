package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<Animal>();
	
    public Zona() {    	
    }
    public Zona(String nombre, Zoologico zoo) {
    	this.nombre=nombre;
    	this.zoo=zoo;
    }
    public void agregarAnimales(Animal animal) {
    	animales.add(animal);
    }
    public int cantidadAnimales() {
    	return animales.size();
    }
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    public void setZoo(Zoologico zoo) {
    	this.zoo=zoo;
    }
    public String getNombre() {
    	return(nombre);
    }
    public Zoologico getZoo() {
    	return zoo;
    }
    public ArrayList<Animal> getAnimales(){
		return animales;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
    
}
