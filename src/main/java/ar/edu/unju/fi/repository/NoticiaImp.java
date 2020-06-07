package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Noticia;


/**
 * Clase que implementa la interfaz INoticia
 * se antepone la anottation @Repository, de esta forma Spring 
 * lo declara como un bean dedicado a la manipulacion de datos 
 * almacenados de algun repositorio
 * @author George
 *
 */
@Repository
public class NoticiaImp implements INoticia {
	
	/**
	 * atributo de la clase, necesaria para el funcionamiento 
	 * de los metodos declarados.
	 * Tomara valores a traves de la inyeccion de dependencias.
	 * Es por eso se antepone la Annotation @Autowired, de 
	 * esta forma Spring permite inyectar un bean mediante la autodeteccion de 
	 * Spring
	 */
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG=LoggerFactory.getLogger(Coria3862Tp5Application.class);

	@Override
	public Noticia mostrar() {
		// instrucciones para capturar un registro
		LOG.info("Registro encontrado");
		return noticia;
	}

	@Override
	public Noticia modificar() {
		// Instrucciones para modificar un registro
		LOG.info("Registro Modificado");
		return noticia;
	}

	@Override
	public void guardar() {
		// instrucciones para almacenar un registro
		LOG.info("Registro Guardado");
	}

	@Override
	public void eliminar() {
		// instrucciones para eliminar registros
		LOG.info("Registro eliminado");
		
	}

}
