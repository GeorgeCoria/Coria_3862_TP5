package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

public interface IResultado {
	
	/**
	 * Metodo que permite capturar
	 * un registro del repositorio
	 * 
	 * @return objeto Resultado
	 */
	public Resultado mostrar();
	
	/**
	 * Motodo que permite realizar
	 * tracciones referentes a la
	 * modificacion de registros
	 * 
	 * @return objecto Resultado
	 */
	public Resultado modificar();
	
	/**
	 * Metodo que permite realizar
	 * transaccies referentes al 
	 * almacenamiento de registro
	 */
	public void guardar();
	
	/**
	 * Metodo que permite realizar
	 * transacciones referenter a
	 * la eliminacion de registros
	 */
	public void eliminar();

}
