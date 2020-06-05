package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.ed.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.model.Usuario;

@SpringBootApplication
public class Coria3862Tp5Application implements CommandLineRunner{
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	public static void main(String[] args) {
		SpringApplication.run(Coria3862Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicializp las variables de mi objeto usuario
		usuario.setApellido("Coria");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(37662456);
		usuario.setFechaAlta(LocalDate.of(2002,01,15));
		usuario.setFechaNacimiento(LocalDate.of(1993,01,23));
		usuario.setId(1);
		usuario.setNombre("Jorge");
		usuario.setPassword("1234");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		
	}

}
