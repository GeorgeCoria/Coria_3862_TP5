package ar.ed.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;
/**
 * EL objetivo de la interfaz IUsuario es disminuir el acoplamiento 
 * de nuestra aplicacion y nos permitira interactuar con los datos
 * Contiene metodos abstractos para guardar, mostrar, eliminar y modificar
 * un Usuario
 * 
 * @author George
 *
 */
public interface IUsuario {
	
	//----- Metodos abstractos ------
	/**
	 * Metodo abstracto que permite almacenar un usuario en la Base detos
	 */
	public void guardar();
	
	/**
	 * Metodo abstracto que captura un Objeto usuario de la
	 * base de datos
	 * 
	 * @return Usuario
	 */
	public Usuario mostrar();
	
	/**
	 * Este metodo sera llamado cuando se desee eliminar un Usuario de la Bd
	 */
	public void eliminar();
	
	/**
	 * Permite realizar operaciones de modificacion de un usuario de la BD
	 * @return
	 */
	public Usuario modificar();
	
}
