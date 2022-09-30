package com.example.SistemPrueba.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.SistemPrueba.Servicio.ServicioPersona;
import com.example.SistemPrueba.entidad.Persona;





@Controller
public class ControllerPersona {
	
	@Autowired
	private ServicioPersona servicio;
	
	
	//listar las personas en la db
	@GetMapping({"/personas","/"})
	public String ListarPersonas(Model modelo,@Param("palabra") String palabra) {
		
		modelo.addAttribute("personas", servicio.ListarPersonas(palabra));
		modelo.addAttribute("palabra", (palabra));
		return "personas";
	}
	
	//crear n registro
	@GetMapping("/personas/nuevo")
	public String CrearRegistro(Model modelo) {
		Persona persona = new Persona();
		modelo.addAttribute("persona", persona);
		return "crear_registro";
		
	}
	
	//guardar registro
	
	@PostMapping("/personas")
	public String SavePersona(@ModelAttribute("persona") Persona persona) {
		
		servicio.SavePersona(persona);
		return "redirect:/personas";
		
	}
	
	
	//editar registro de empleado
	@GetMapping("personas/editar/{id}")
	public String EditarFormulario(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("persona", servicio.ObtenerPersonaPorId(id));
		return "editar_registro";
	}
	
	
	
	
	//enviar formulario de registro
	@PostMapping("/personas/{id}")
	public String ActualizarPersona(@PathVariable Long id, @ModelAttribute("persona") Persona persona, Model  modelo) {
		Persona personaExiste = servicio.ObtenerPersonaPorId(id);
		personaExiste.setId(id);
		personaExiste.setNombre(persona.getNombre());
		personaExiste.setEdad(persona.getEdad());
		personaExiste.setCorreo(persona.getCorreo());
		
		servicio.ActualizarPersona(personaExiste);
		
		return "redirect:/personas";
	}
	
	
	
	
	
	
	
	
	




	
	@GetMapping("/personas/{id}")
	public String EliminarPersona(@PathVariable Long id) {
		servicio.EliminarPersona(id);
		return "redirect:/personas";
	}
}
