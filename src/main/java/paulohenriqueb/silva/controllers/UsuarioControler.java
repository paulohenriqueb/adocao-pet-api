package paulohenriqueb.silva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paulohenriqueb.silva.model.Usuario;
import paulohenriqueb.silva.services.UsuarioService;

@RestController
@RequestMapping("api/usuario/v1")
public class UsuarioControler {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value ={"", "/"})
	public List<Usuario> findAll(){
		return usuarioService.findAll();
	}
	
	
	@GetMapping(value = "{id}")
	public Usuario findById(@PathVariable(value = "id") Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping(value = { "","/" })
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
	
	@PutMapping(value = "/{id}")
	public Usuario update(@RequestBody Usuario usuario) {
		return usuarioService.update(usuario);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		 usuarioService.delete(id);
		 return ResponseEntity.noContent().build();
	}
	
}
