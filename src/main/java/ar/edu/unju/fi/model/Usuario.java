package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

//marca a la clase como un bean de Spring
@Component
public class Usuario {
	
	private long id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String direccion;
	private long dni;
	private LocalDate fechaAlta;
	/**
	 * puede tomar uno de los siguientes valores
	 * -SOCIO
	 * -ADMIN
	 * -CONSULTOR
	 * 
	 */
	private String tipo;
	private String password;
	
	//------------Constructores ------------------
	/**
	 * Constructor por defecto sin parametros
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor Parametrizado
	 * se inicializa las variable miembros con respecto a los valores 
	 * parados por parametro
	 *  
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param tipo
	 * @param password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}
	
	//--------------- Metodos y/o Funciones --------------
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta
				+ ", tipo=" + tipo + ", password=" + password + "]";
	}
	
	//-------------- Metodos Accesores ------------------
	
	/**
	 * captura el codigo identificador del usuario
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * se asigna un codigo identificador al Usuario
	 * Cada usuario tendra un codigo distinto
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * se captura el nombre del usuario
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * se asigna un nombre al usuario
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * se captura el apellido del usuario
	 * 
	 * @return apellido del usuario
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Se asigna un apellido al usuario
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * se captura la fecha de Nacimiento del Usuario
	 * 
	 * @return fecha de nacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * se asigna una fecha de nacimiento del usuario
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 *  se captura la direccion del usuario
	 *  
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * se asigna una direccion del usuario
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 *  se captura el dni del usuario
	 *  
	 * @return DNI del usuario
	 */
	public long getDni() {
		return dni;
	}
	
	/**
	 * se asigna Dni del usuario
	 * 
	 * @param dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	/**
	 * se captura la fecha de alta del usuario
	 * 
	 * @return fecha de alta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	
	/**
	 * se asigna fecha de alta del usuario
	 * 
	 * @param fechaAlta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	/**
	 * se captura el tipo usuario
	 * 
	 * @return tipo 
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * se asigna el tipo de usuario
	 * puede ser SOCIO, ADMIN O CONSULTOR
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * se captura el password del usuario
	 * 
	 * @return password
	 */

	public String getPassword() {
		return password;
	}
	
	/**
	 * se asigna un valor a password del usuario
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
