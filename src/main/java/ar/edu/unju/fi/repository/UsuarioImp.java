package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * Clase que implementa la interfaz IUsuario
 * Se procede agregar @repository, esta anotacion
 * idicara que se trata de un Bean de Spring  que se encargara de 
 * manipular los datos almacenados en algun repositorio (ej: una BD)
 * 
 * @author George
 *
 */
@Repository
public class UsuarioImp implements IUsuario{
	/**
	 * atributo de la clase que implementa la iterfaz
	 * es declarado para asi lograr la inyeccion de dependencias
	 * Permite iyectar un Bean mediante la autodeteccion de Spring
	 * En palabras simples, cuando se llame al metodo guardar, spring buscara un
	 * objeto de tipo Usuario para inyectarlo al metodo
	 * y asi guardar el objeto, es por ello que el metodo guardar no tiene parametros
	 */
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Coria3862Tp5Application.class);

	@Override
	public void guardar() {
		//accion ejecua para almacenar un objeto de tipo Usuario en la Bd
		LOG.info("EL usuario fue guardado " + usuario.getApellido() + ", "+usuario.getNombre());
		
	}

	@Override
	public Usuario mostrar() {
		// se recupera el registro de un usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// se elimina un registro de la BD
		LOG.info("Se elimino el usuario de la Base de Datos");
		
	}

	@Override
	public Usuario modificar() {
		// se modifica el registro de un usuario
		LOG.info("Los cambios realizados se guardaron con exito");
		return usuario;
	}


}
