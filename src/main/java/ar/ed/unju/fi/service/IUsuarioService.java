package ar.ed.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {
	
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
