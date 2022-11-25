package paulohenriqueb.silva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paulohenriqueb.silva.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}
