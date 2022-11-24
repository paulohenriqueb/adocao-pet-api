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

import paulohenriqueb.silva.model.Pet;
import paulohenriqueb.silva.services.PetService;

@RestController
@RequestMapping("api/pet/v1")
public class PetController {

	@Autowired
	private PetService petService;
	
	@GetMapping(value = { "", "/" })
	public List<Pet> findAll(){
		return petService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Pet findById(@PathVariable(value = "id") Long id) {
		return petService.findById(id);
	}
	
	@PostMapping
	public Pet create(@RequestBody Pet pet) {
		return petService.create(pet);
	}
	
	@PutMapping(value="/{id}")
	public Pet update(@RequestBody Pet pet) {
		return petService.update(pet);
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		petService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
