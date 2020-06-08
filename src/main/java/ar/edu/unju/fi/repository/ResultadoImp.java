package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;

/**
 * Clase que implementa la interfaz IResultado con el 
 * fin de ejecutar instrucciones referidas a la manipulacion
 * de datos de algun repositorio.
 * Se antepone la Annotations @Repository de esta forma 
 * la clase se considera un bean de Spring.
 * 
 * @author George
 *
 */
@Repository
public class ResultadoImp implements IResultado{
	
	/**
	 * atributo de la clase, necesaria para el funcionamiento 
	 * de los metodos declarados.
	 * Tomara valores a traves de la inyeccion de dependencias.
	 * Es por eso se antepone la Annotation @Autowired, de 
	 * esta forma Spring permite inyectar un bean mediante la autodeteccion de 
	 * Spring
	 */
	
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Coria3862Tp5Application.class);

	@Override
	public Resultado mostrar() {
		// instrucciones para capturar un registro
		LOG.info("Registro encontrado");
		return resultado;
	}

	@Override
	public Resultado modificar() {
		// Instrucciones para modificar un registro
		LOG.info("Registro Modificado");
		return resultado;
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
