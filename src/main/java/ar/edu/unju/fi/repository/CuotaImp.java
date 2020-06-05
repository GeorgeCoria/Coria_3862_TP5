package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Coria3862Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * Clase implementadora de la Interfaz Icuota, permitira realizar
 * acciones relacionadas con el repositorio de datos de Cuotas, 
 * permitiento, a traves de los metodos abstractos, guardar, eliminar,
 * mostrar y modificar un registro del repositorio.
 * Se estable como un bean de Spring por medio de la anotacion
 * @Repository
 */

@Repository
public class CuotaImp implements ICuota {
	
	/**
	 * Todos los metodos declarados en la clase Icuota operan
	 * sobre un objeto tipo cuota, es decir, lo metodos necesitan
	 * un objeto de tipo CUota para complir con su finalidad.
	 * Este atribudo esta con la annotation @Autowired para asi lograr
	 * la inyeccion de dependencia, esta anotations permite inyectar un bean
	 * mediante a aotodeteccion de Spring
	 */
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Coria3862Tp5Application.class);
	/**
	 * Metodo abstracto que permite realizar una operacion que 
	 * tiene por finalidad almacenar en el reposytorio un objeto
	 * de tipo cuota
	 * 
	 */
	@Override
	public void guardar() {
		//se realizan acciones que permitiran guardar el objeto
		LOG.info("La cuota se guardo de manera exitora");
		
	}
	
	/**
	 * Captura un objeto de tipo Cuota
	 * 
	 * @return objeto tipo Cuota
	 */
	@Override
	public Cuota mostrar() {
		// Acciones para mostrar un objeto de tipo cuota
		
		return cuota;
	}
	
	/**
	 * Este metodo sera llamada cada vez que se desea boorrar 
	 * un registro, de tipo Cuota, del repositorio
	 */
	@Override
	public void eliminar() {
		// Acciones que permiten eliminar un registro
		LOG.info("El registro fue Eliminado");
	}

	
	/**
	 * Metodo para realizar modificaciones sobre un objeto de tipo Cuota, esta
	 * modificacion se reflejara en su repositorio correspondiente
	 * 
	 * @return objeto, de tipo cuota,modificado
	 */
	@Override
	public Cuota modificar() {
		// Acciones que modifican al objeto
		LOG.info("Modificacion Exitosa");
		return cuota;
	}
	
}
