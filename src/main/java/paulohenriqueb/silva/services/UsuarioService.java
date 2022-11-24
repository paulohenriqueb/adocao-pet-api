package paulohenriqueb.silva.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import paulohenriqueb.silva.exceptions.ResourceNotFoundException;
import paulohenriqueb.silva.model.Usuario;
import paulohenriqueb.silva.repositories.UsuarioRepository;

public class UsuarioService {

	Logger logger = Logger.getLogger(UsuarioService.class.getName());
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		logger.info("Listando todos os usuários cadastrados");
		
		return usuarioRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		return usuarioRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Não foi encontrado usuário para o ID ? " + id));
	}
	
	public Usuario create(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario update(Usuario usuario) {
		Usuario entity = usuarioRepository.findById(usuario.getId())
				.orElseThrow(()-> new ResourceNotFoundException("Falha ao tentar atualizar o usuário"));
		
		entity.setNome(usuario.getNome());
		entity.setTelefone(usuario.getTelefone());
		entity.setEmail(usuario.getEmail());
		entity.setSenha(usuario.getSenha());
		entity.setEndereco(usuario.getEndereco());
		entity.setUf(usuario.getUf());
		entity.setCep(usuario.getCep());
	
		return usuarioRepository.save(entity);
	}
	
	public void delete(Long id) {
		Usuario entity = usuarioRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Falha ao tentar deletar o usuário"));
		usuarioRepository.delete(entity);
	}
	
}
