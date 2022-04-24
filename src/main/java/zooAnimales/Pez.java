package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;
public class Pez extends Animal{
     private static ArrayList<Pez> listado;
     public static int salmones;
     public static int bacalaos;
     private String colorEscamas;
     private int cantidadAletas;
     public Pez() {
    	 super();
 		 listado.add(this);
     }
     public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
    	 super(nombre, edad, habitat, genero);
    	 this.colorEscamas=colorEscamas;
    	 this.cantidadAletas=cantidadAletas;
    	 listado.add(this);
     }
     public static int cantidadPeces() {
     	return(listado.size());
     }
     public void setColorEscamas(String colorEscamas) {
 		this.colorEscamas=colorEscamas;
 	}
 	public String getColorEscamas() {
 		return(colorEscamas);
 	}
 	public void setCantidadAletas(int cantidadAletas) {
 		this.cantidadAletas=cantidadAletas;
 	}
 	public int getCantidadAletas() {
 		return(cantidadAletas);
 	}
 	public ArrayList<Pez> getListado(){
 		return listado;
 	}
     public String movimiento() {
     	return "nadar";
     }
     public static Pez crearSalmon(String nombre, int edad,String genero, Zona zona) {
     	Pez.salmones+=1;
     	return new Pez(nombre, edad, "oceano",genero, zona, "rojo", 6);
     }
     public static Pez crearBacalao(String nombre, int edad,String genero, Zona zona) {
      	Pez.bacalaos+=1;
      	return new Pez(nombre, edad, "oceano",genero, zona, "gris", 6);
      }
}
