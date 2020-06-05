package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;
/**
 * Clase que implementa los metodos de la Interfaz IUsuarioService
 * Esta clase esta definida como un bean de Spring, dedicada a 
 * gestionar tareas de la logica de negocios e invocar la ejecucion de 
 * transacciones en los repositorios
 * @author George
 *
 */
@Service
public class UsuarioServiceImp implements IUsuarioService{
	
	/**
	 * variable que permitira que se haga efectiva la inyeccion de dependencias
	 * a traves de la Annotations @Autowired
	 * En definitiva, cada vez que alguno de los metodos de la
	 * clase UsuarioServiceImp sea llamado, Spring hara un escaneo de
	 * un objeto Usuario para luego inyectar al metodo
	 */
	@Autowired
	private IUsuario iusuario;

	@Override
	public void guardar() {
		iusuario.guardar();
		
	}

	@Override
	public Usuario mostrar() {
		Usuario usuario=iusuario.mostrar();
		return usuario;
	}

	@Override
	public void eliminar() {
		iusuario.eliminar();
		
	}

	@Override
	public Usuario modificar() {
		Usuario usuario=iusuario.modificar();
		return usuario;
	}

}
