package app.repositories;

import app.models.SpaceShip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpaceShipRepo extends CrudRepository<SpaceShip, Long> {


}
