package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;

public interface IEstadioService {

	public void guardar();
	public void eliminar();
	public Estadio mostrar();
	public Estadio modificar();
}
