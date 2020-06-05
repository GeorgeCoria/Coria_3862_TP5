package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Equipo;
/**
 * Clase que implementa los metodos de la interfaz Equipo
 * Tiene por finalidad administrar transacciones referidas a 
 * la manipulacion de datos de algun repositorio.
 * Se antepone @Repository, de esta Forma Spring lo reconoce
 * como un bean referida con la manipulacion de datos
 * 
 * @author George
 *
 */
@Repository
public class EquipoImp implements IEquipo{
	
	/**
	 * Los metodos desarrollados necesitan un objeto de tipo Equipo.
	 * Mediante la Inyeccion de dependencias  no es necesario especificarlo 
	 * en los parametros.
	 * El aitributo "couta" a traves Spring, usando la annotations @Autowired,
	 * permite inyectar un bean mediante la autodeteccion de Spring
	 */
	
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG=LoggerFactory.getLogger(Coria3862Tp5Application.class);

	/**
	 * Este metodo ejecuta las instrucciones necesarias
	 * para el almacenamiento de un nuevo registro en el 
	 * repositorio
	 * 
	 */
	@Override
	public void guardar() {
		// operaciones para guardar un registro
		LOG.info("Los datos se guardaron de forma exitosa");
		
	}
	
	/**
	 * Este metodo ejecuta las intrucciones necesarias
	 * para eliminar un registro de repositorio
	 */

	@Override
	public void eliminar() {
		// operacion para eliminar registro
		LOG.info("Regitro borrado");
	}
	
	/**
	 * Metodo que permite realizar la captura de 
	 * un registro del repositorio
	 */

	@Override
	public Equipo mostrar() {
		// Capturar un registro
		LOG.info("Registro encontrado");
		return equipo;
	}

	/**
	 * Ejecuta instruccines necesarias para hacer
	 * posible modificar un registro del repositorio
	 */
	@Override
	public Equipo modificar() {
		// modificar un registro
		LOG.info("Modificacion exitosa");
		return equipo;
	}

}
