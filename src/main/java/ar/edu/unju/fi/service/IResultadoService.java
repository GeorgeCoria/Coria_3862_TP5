package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;

public interface IResultadoService {

	/**
	 * Metodo que permite capturar
	 * un registro del repositorio
	 * invoca metodos desde la capa 
	 * repository
	 * 
	 * @return objeto Resultado
	 */
	public Resultado mostrar();
	
	/**
	 * Motodo que permite realizar
	 * tracciones referentes a la
	 * modificacion de registros.
	 * invoca metodos desde la capa 
	 * repository
	 * 
	 * @return objecto Resultado
	 */
	public Resultado modificar();
	
	/**
	 * Metodo que permite realizar
	 * transaccies referentes al 
	 * almacenamiento de registro
	 * invoca metodos desde la capa 
	 * repository
	 */
	public void guardar();
	
	/**
	 * Metodo que permite realizar
	 * transacciones referenter a
	 * la eliminacion de registros
	 * invoca metodos desde la capa 
	 * repository
	 */
	public void eliminar();
}
