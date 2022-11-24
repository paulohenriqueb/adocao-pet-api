package paulohenriqueb.silva.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import paulohenriqueb.silva.exceptions.ResourceNotFoundException;
import paulohenriqueb.silva.model.Instituicao;
import paulohenriqueb.silva.repositories.InstituicaoRepository;

public class InstituicaoService {

	@Autowired
	InstituicaoRepository instituicaoRepository;
	
	private Logger logger = Logger.getLogger(InstituicaoService.class.getName());
	
	public List<Instituicao> findAll(){
		logger.info("Encontrando todas as instituições");
		
		return instituicaoRepository.findAll();
	}
	
	public Instituicao findById(Long id) {
		logger.info("Encontrando uma instituicao");
		
		return instituicaoRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Não foi encontrado uma instituição para o ID : " + id));
	}
	
	public Instituicao create(Instituicao instituicao) {
		logger.info("Cadastrando uma nova instituição");
		
		return instituicaoRepository.save(instituicao);
	}
	
	public Instituicao update(Instituicao instituicao) {
		logger.info("Atualizando uma instituição");
		
		Instituicao entity = instituicaoRepository.findById(instituicao.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Erro ao tentar atualizar!"));
		
		entity.setNomeInstituicao(instituicao.getNomeInstituicao());
		entity.setEnderecoInstituicao(instituicao.getEnderecoInstituicao());
		entity.setHorarioAtendimento(instituicao.getHorarioAtendimento());
		entity.setResponsavelInstituicao(instituicao.getResponsavelInstituicao());
		entity.setRedeSocialInstituicao(instituicao.getRedeSocialInstituicao());
		entity.setEmailInstituicao(instituicao.getEmailInstituicao());
		entity.setIdPetRelacional(instituicao.getIdPetRelacional());
		entity.setCep(instituicao.getCep());
		
		return instituicaoRepository.save(entity);
	}
	
	public void delete(Long id) {
		logger.info("Deletando uma instituição");
		
		Instituicao entity = instituicaoRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Não foi encontrado uma instituicao para o ID " + id));
		instituicaoRepository.delete(entity);
	}
}
