package paulohenriqueb.silva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import paulohenriqueb.silva.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}
