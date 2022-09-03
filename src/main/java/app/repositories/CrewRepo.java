package app.repositories;

import app.models.SpaceShip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRepo extends CrudRepository<SpaceShip, Long> {

    //List<Crew> findAll();
}
