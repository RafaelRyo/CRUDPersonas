package com.crud.personas.rest;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.personas.modelo.ModeloPersona;



@RestController

public class PersonaRestController {
	List<ModeloPersona> personas = new ArrayList<ModeloPersona>();
	
	@PostMapping("/persona")
	public ResponseEntity<ModeloPersona> ingresarPersona(@RequestBody ModeloPersona nuevo) {
		 personas.add(nuevo);
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
	}
	
	@GetMapping("/persona")
	public ResponseEntity<?> obtenerTodos() {
		
			return ResponseEntity.ok(personas);
		
	}
	
	@GetMapping("/persona/{id}")
	public ResponseEntity<?> obtenerUno(@PathVariable int id) {
		ModeloPersona result = personas.get(id);
		return ResponseEntity.ok(result);
	   // return ResponseEntity.ok(personas.get(id));
		
	}
	
	@DeleteMapping("/persona/{id}")
	public ResponseEntity<?> eliminarPersona(@PathVariable int id) {
		personas.remove(id);
		return ResponseEntity.noContent().build();
		
	}
	@PutMapping("/persona/{id}")
	public ResponseEntity<?> eliminarPersona(@RequestBody ModeloPersona editar, @PathVariable int id) {
		personas.remove(id);
		personas.add(editar);
		return ResponseEntity.ok(editar);
		
	}
	
	

}
