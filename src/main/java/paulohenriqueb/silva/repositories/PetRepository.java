package paulohenriqueb.silva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paulohenriqueb.silva.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{}
