package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Estadio {
	private String nombre;
	private LocalDate fechaFundacion;
	private String ciudad;
	private int capacidad;
	private String direccion;
	
	//------------ METODOS ACCESORES --------------------
	
	/**
	 * Constructor por defecto
	 */
	
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor Parametrizado
	 * los valores ingresados por parametro inicializan los atributos del objeto
	 * 
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	//--------METODOS ---------------
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
	//------------- METODOS ACCESORES ----------------------
	
	/**
	 * Se captura el nombre del estadio
	 * 
	 * @return nombre de estadio
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Se asigna un nombre a estadio
	 * 
	 * @param nombre de estadio
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * se captura la fecha de fundacion del estadio
	 * 
	 * @return fecha
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}
	
	/**
	 * Se asigna fecha de fundacion a fechaFundacion
	 * 
	 * @param fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	
	/**
	 * Se captura la ciudad donde se ubica el estadio
	 * 
	 * @return nombre de ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Se asigna valor a ciudad, variable qu contiene el dato
	 * de la ciudad donde se ubica el estadio
	 * 
	 * @param nombre de ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * captura el valor de capacidad del estadio
	 * 
	 * @return capacidad del estadio
	 */
	public int getCapacidad() {
		return capacidad;
	}
	
	/**
	 * se asigna valor a capacidad del estadio
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * se captura la direccion del estadio
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * se asigna valor a direccion
	 * 
	 * @param direccion del estadio
	 */

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
	
	
	
	
}
