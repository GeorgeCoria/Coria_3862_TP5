package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//marca a la clase como un bean de Spring
@Component
public class Resultado {
	
	private LocalDate fecha;
	/**
	 * Atributo objeto de tipo Equipo, para lograr inyeccion de dependencias,
	 * se procede agregar el metadato Autowired, este permite inyectar un Bean
	 * usando la autodeteccion de Spring
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Atributo objeto de tipo Equipo, lograr la inyeccion de dependencias,
	 * se requiere agregar el metadato Autowired, este permitira inyectar un Bean
	 * usando la utodeteccion de Spring
	 */
	@Autowired
	private Equipo equipo2;
	private int golesequipo1;
	private int golesequipo2;
	
	//------Constructores ------
	/**
	 * COnstructor por defecto
	 * 
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parametrizado, inicializa todas las variables miembros
	 * 
	 * @param fecha
	 * @param equipo1
	 * @param equipo2
	 * @param golesequipo1
	 * @param golesequipo2
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesequipo1, int golesequipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesequipo1 = golesequipo1;
		this.golesequipo2 = golesequipo2;
	}
	
	//---------------Metodos y/o funciones -------------
	
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesequipo1="
				+ golesequipo1 + ", golesequipo2=" + golesequipo2 + "]";
	}
	
	//----------- Metodos Accesores -----------------------
	
	/**
	 * captura la fecha en la que se obtuvo el resultado del partido
	 * 
	 * @return fecha del resultado
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	
	/**
	 * Se asigna fecha al resultado
	 * 
	 * @param fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Se captura el nombre del equipo 1
	 * 
	 * @return equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}
	
	/**
	 * Se asigna nombre a equipo1
	 * 
	 * @param equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	
	/**
	 * se captura nombre del equipo2
	 * 
	 * @return equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}
	
	/**
	 * se captura asigna el nombre del equipo2
	 * 
	 * @param equipo2
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	/**
	 * se captura el valor de goles por parte del equipo1
	 */
	public int getGolesequipo1() {
		return golesequipo1;
	}
	
	/**
	 * se asigna la cantidad de goles del equipo1
	 * 
	 * @param golesequipo1
	 */
	public void setGolesequipo1(int golesequipo1) {
		this.golesequipo1 = golesequipo1;
	}
	
	/**
	 * se captura el valor de goles por parte del equipo2
	 */
	public int getGolesequipo2() {
		return golesequipo2;
	}
	
	/**
	 * se asigna la cantidad de goles del equipo2
	 * 
	 * @param golesequipo2
	 */
	public void setGolesequipo2(int golesequipo2) {
		this.golesequipo2 = golesequipo2;
	}
	
	
	
	
	
}
