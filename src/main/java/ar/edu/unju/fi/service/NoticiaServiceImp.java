package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * Clase que implementa la interfar INoiciaService
 * Mediante la annotation @Service, Spring define a la
 * clase como un bean dedicado la gestionar tareas de la 
 * logica de negocios e invocar la ejecucion de transacciones
 * en los repositorios
 * @author George
 */
@Service
public class NoticiaServiceImp implements INoticiaService{
	
	/**
	 * los metodos que implementa esta clase necesitan 
	 * de un objeto, utilizaremos la autodeccion de Spring,
	 * para que el atributo logre tomar datos a traves de la inyeccion de dependencias,
	 * Se antepone la annotation @Autowired que permite la inyeccion de un bean de Spring
	 * 
	 */
	@Autowired
	private INoticia inoticia;

	@Override
	public Noticia mostrar() {
		// Intrucciones para capurar un registro
		Noticia noticia=inoticia.mostrar();
		return noticia;
	}

	@Override
	public Noticia Modificar() {
		// Instrucciones para modificar un registro
		Noticia noticia = inoticia.modificar();
		return noticia;
	}

	@Override
	public void guardar() {
		// guardar registro
		inoticia.guardar();
		
	}

	@Override
	public void eliminar() {
		// eliminar registro
		inoticia.eliminar();
		
	}

}
