package gestion;
import java.util.ArrayList;
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<Zona>();
    
    public Zoologico() {
    	
    }
    public Zoologico(String nombre, String ubicacion) {
    	this.nombre=nombre;
    	this.ubicacion=ubicacion;
    }
    public void agregarZonas(Zona zona){
    	zonas.add(zona);
    }
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    public String getNombre() {
    	return(nombre);
    }
    public ArrayList<Zona> getZona(){
		return zonas;
	}
    public void setUbicacion(String ubicacion) {
    	this.ubicacion=ubicacion;
    }
    public String getUbicacion() {
    	return(ubicacion);
    }
    public int cantidadTotalAnimales() {
    	int count=0;
    	for (int i=0; i<zonas.size(); i++) {
    		count += zonas.get(i).cantidadAnimales();
    	}
    	return count;
    }
}
