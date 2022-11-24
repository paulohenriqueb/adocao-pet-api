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
import paulohenriqueb.silva.model.Instituicao;

import paulohenriqueb.silva.services.InstituicaoService;

@RestController
@RequestMapping("api/instituicao/v1")
public class InstituicaoController {
	@Autowired
	InstituicaoService instituicaoService;
	
	@GetMapping(value = {"", "/"})
	public List<Instituicao> findAll(){
		return instituicaoService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Instituicao findById(@PathVariable(value = "id") Long id) {
		return instituicaoService.findById(id);
	}
	
	@PostMapping(value = {"", "/"})
	public Instituicao create(@RequestBody Instituicao instituicao) {
		return instituicaoService.create(instituicao);
	}
	
	@PutMapping(value = "/{id}")
	public Instituicao update(@RequestBody Instituicao instituicao) {
		return instituicaoService.update(instituicao);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value="id") Long id){
		instituicaoService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
