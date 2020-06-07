package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * Clase que implementa la interfaz IEstadio
 * EL objetivo de la clase es manipular los datos almacenados en
 * algun repositorio,
 * Se a antepone la annotation @Repository, de esta manera Spring
 * establece que se trata de un bean relacionado con la manipulacion de 
 * datos
 * 
 * @author George
 *
 */

@Repository
public class EstadioImp implements IEstadio {
	/**
	 * los metodos que implementa esta clase necesitan 
	 * de un objeto tipo Equipo, utilizaremos la autodeccion de Spring,
	 * para que el atributo logre tomar datos a traves de la inyeccion de dependencias,
	 * Se antepone la annotation @Autowired que permite la inyeccion de un bean de Spring
	 * 
	 * 
	 */
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG=LoggerFactory.getLogger(Coria3862Tp5Application.class);
	@Override
	public void guardar() {
		// Acciones necesarias para guardar registros
		LOG.info("Operacion Guardar: Exitosa");
		
	}

	@Override
	public void eliminar() {
		// instrucciones para eliminar registro
		LOG.info("Registro borrado");
		
	}

	@Override
	public Estadio mostrar() {
		// se captura un registro
		return estadio;
	}

	@Override
	public Estadio modificar() {
		// instrucciones para modificar un registro
		LOG.info("Los datos se modificaron correctamente");
		return estadio;
	}

}
