package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Clase designada por la annotation @Controller.
 * Se la denomina de tipo controlador por que son las 
 * encargadas de tomar peticiones y controlar que 
 * respuesta debe ser presentada en la vista (pagina
 * html).
 * @author George
 *
 */
@Controller
@RequestMapping("/")
public class MainController {
	
	
	@Autowired
	private IUsuarioService usuarioService;
	
	
	@GetMapping("inicio")
	public String main(Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
}
