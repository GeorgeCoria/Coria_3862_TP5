package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//este anotacion marcara a la clase como un bean de Spring
@Component
public class Equipo {
	
	/**
	 * Atributo nombre, este almacenara el nombre
	 * de un equipo
	 */
	private String nombre;
	/**
	 * Atributo objeto de tipo Estadio, para lograr la inyecion de dependencias
	 * anteponemos el metadato Autowired, esto permitira inyectar un bean usando la
	 * autodeteccion de Spring
	 */
	@Autowired
	private Estadio estadio;
	
	
	
	//------- Constructores -------------
	
	/**
	 * Constructor por defecto sin parametros
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructo Parametrizado 
	 * asigna valores a los atributos miembros con respecto a los parametros
	 * 
	 * @param nombre de equipo
	 * @param estadio de equipo
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	//-------- Metodos y/o funciones -----------
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	//------------- Metodos Accesores ----------------
	
	/**
	 * se captura el nombre del equipo
	 * 
	 * @return nombre de equipo
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * se asigna un nombre al equipo
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * captura el nombre del estadio
	 * 
	 * @return estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	
	/**
	 * se asigna un monbre al estadio de equipo
	 * 
	 * @param estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
	
}
