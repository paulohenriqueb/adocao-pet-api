package paulohenriqueb.silva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import paulohenriqueb.silva.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{}
