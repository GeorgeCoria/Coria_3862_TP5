package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//marca a la clase como un bean de Spring
@Component
public class Cuota {

		private long id;
		private LocalDate fechaPago;
		private String periodo;
		private double monto;
		private String estado;
		/**
		 * este Atributo es un objeto de tipo Usuario
		 * Es por ello que para lograr aplicar inyeccion de dependencia
		 * usamos Autowired, este permitira inyectar un Bean 
		 * usando la autodetecion de Spring
		 */
		@Autowired
		private Usuario usuario;
		
	/**
	 * Constructor sobre cargado
	 * 	
	 * @param id clave identificadora de la cuota
	 * @param fechaPago fecha en la que se hace efectiva el pago
	 * @param periodo
	 * @param monto 
	 * @param estado
	 * @param usuario
	 */
//------------	CONTRUCTORES -----------------
		
		
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
			this.id = id;
			this.fechaPago = fechaPago;
			this.periodo = periodo;
			this.monto = monto;
			this.estado = estado;
			this.usuario = usuario;
		}


	/**
	 * constructos por defecto sin parametros
	 */
	public Cuota() {
		
	}
	
	//-------- METODOS ---------------

	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}


	//------Metodos accesores ----------
	/**
	 * se captura el valor de id
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Se asigna valor al Id
	 * 
	 * @param id : valor a cargar
	 */

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * se captura fecha de pago
	 * 
	 * @return fecha de pago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * Se asigna valor a fecha de pago
	 * 
	 * @param fechaPago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * se captura el valor del periodo
	 * 
	 * @return periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Se asigna valor a periodo
	 * 
	 * @param periodo
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * Se captura el valor de monto
	 * 
	 * @return monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * se asigna valor al monto
	 * 
	 * @param monto
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * se captura valor de estado
	 * 
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * se asigna un valor a estado
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * se captura el usuario
	 * 
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * se asigna el valor a Usiario
	 * 
	 * @param objeto de tipo usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	
	
		
	
}
