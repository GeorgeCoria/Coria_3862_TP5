package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Noticia;

public interface INoticiaService {
	
	/**
	 * Metodo que permite capturar
	 * un registro del repositorio
	 * 
	 * @return objeto noticia
	 */
	public Noticia mostrar();
	
	/**
	 * Motodo que permite realizar
	 * tracciones referentes a la
	 * modificacion de registros
	 * 
	 * @return objecto noticia
	 */
	public Noticia Modificar();
	
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
