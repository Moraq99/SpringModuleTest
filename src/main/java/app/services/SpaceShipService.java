package app.services;

import app.helpers.DataLoader;
import app.models.Crew;
import app.models.SpaceShip;
import app.repositories.SpaceShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class SpaceShipService {


    private DataLoader dataLoader;
    private SpaceShipRepo spaceShipRepo;

    @Autowired
    public SpaceShipService(DataLoader dataLoader, SpaceShipRepo spaceShipRepo) {
        this.spaceShipRepo = spaceShipRepo;
        this.dataLoader = dataLoader;
    }

    private Map<Long, SpaceShip> spaceShip = new TreeMap<>();
    public List<SpaceShip> getAll(){
        return (List<SpaceShip>) spaceShipRepo.findAll();
    }
    public List<SpaceShip> getByActive() {
        List<SpaceShip> result = new ArrayList<>();
        for (SpaceShip ship : getAll()){
            if(ship.isActive()){
                result.add(ship);
            }
        }
        return result;
    }


    public List<Crew> getByCrew() {
        List<Crew> crews = new ArrayList<>();


        return crews;
    }





}
