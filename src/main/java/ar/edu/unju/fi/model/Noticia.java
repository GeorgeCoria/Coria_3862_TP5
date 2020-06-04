package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

//marca a la clase como un bean de Spring
@Component
public class Noticia {
	private LocalDate fecha;
	private String titulo;
	private String resumen;
	
	//--------- Constructores -----------
	
	/**
	 * constructor por defecto sin parametros
	 * 
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * COnstructor parametrizado, inicializa las variable miembros
	 * 
	 * @param fecha de noticia
	 * @param titulo de noticia
	 * @param resumen de noticia
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		//se asigna valor a fecha de noticia
		this.fecha = fecha;
		//se asigna a titulo, un titulo de noticia
		this.titulo = titulo;
		//se asigna a la variable resumen, valga la redundancia, un resumen de la noticia
		this.resumen = resumen;
	}
	
	
	//-------------- Metodos y/o funciones -------------
	
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}

	//------------ Metodos Accesores --------- 
	/**
	 * se captura el valor de fecha de noticia
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	
	/**
	 * se asigna una fecha a noticia
	 * 
	 * @param fecha de la noticia
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * se captura el valor del titulo de la noticia
	 * 
	 * @return titulo
	 */

	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * se asigna un titulo para la noticia
	 * 
	 * @param titulo
	 */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * se captura el resumen de la noticia
	 * 
	 * @return resumen
	 */
	public String getResumen() {
		return resumen;
	}

		/**
		 *  se asigna un resumen a la noticia
		 *  
		 * @param resumen
		 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	
	
	
	
}
