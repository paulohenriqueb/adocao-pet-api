package paulohenriqueb.silva.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import paulohenriqueb.silva.exceptions.ResourceNotFoundException;
import paulohenriqueb.silva.model.Pet;
import paulohenriqueb.silva.repositories.PetRepository;

public class PetService {
	
	Logger logger = Logger.getLogger(PetService.class.getName());
	
	@Autowired
	PetRepository petRepository;
	
	public List<Pet> findAll(){
		logger.info("Listando todos os pets");
		
		return petRepository.findAll();
	}
	
	public Pet findById(Long id) {
		logger.info("Listando o pet através do ID");
		
		return petRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Não foi encontrado pet com esse ID" + id));
	}
	
	public Pet create(Pet pet) {
		return petRepository.save(pet);
	}
	
	public Pet update(Pet pet) {
		logger.info("Atualizando um pet");
		
		Pet entity = petRepository.findById(pet.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Falha ao atualizar os dados"));
		entity.setNome(pet.getNome());
		entity.setTipo(pet.getTipo());
		entity.setTemperamento(pet.getTemperamento());
		entity.setPossuiDebilidade(pet.getPossuiDebilidade());
		entity.setDebilidade(pet.getDebilidade());
		entity.setInstituicaoId(pet.getInstituicaoId());
		
		return petRepository.save(entity);
	}
	
	public void delete(Long id) {
		Pet entity = petRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Falha ao tentar deletar o pet"));
		petRepository.delete(entity);
	}
}
