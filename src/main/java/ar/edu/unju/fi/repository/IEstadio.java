package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

public interface IEstadio {
	public void guardar();
	public void eliminar();
	public Estadio mostrar();
	public Estadio modificar();
	
}
