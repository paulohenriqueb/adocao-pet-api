package paulohenriqueb.silva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paulohenriqueb.silva.model.Instituicao;
@Repository
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long>{

}
