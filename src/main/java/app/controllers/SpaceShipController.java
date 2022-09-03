package app.controllers;

import app.models.Crew;
import app.models.SpaceShip;
import app.models.SpaceShipClass;
import app.repositories.CrewRepo;
import app.repositories.SpaceShipRepo;
import app.services.SpaceShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SpaceShipController {

    @Autowired
    private CrewRepo crewRepo;
    @Autowired
    private SpaceShipRepo spaceShipRepo;

    @Autowired
    private SpaceShipService spaceShipService;

    @GetMapping(value = {"/spaceship"})
    public String saveNewSpaceShip(Model model) {
        model.addAttribute("newShip", new SpaceShip());
        model.addAttribute("shipClasses", SpaceShipClass.values());

        return "spaceship_new";
    }

    @GetMapping(value = {"/spaceshipLists"})
    public String spaceshipDatas(Model model) {
    List<SpaceShip > spaceShipList = (List<SpaceShip>) spaceShipRepo.findAll();
    model.addAttribute("spaceshiplists",spaceShipList);

            return "spaceshipLists";
        }


    @GetMapping(value = {"/result"})
    public String result(Model model){
        List<SpaceShip> ship = spaceShipService.getByActive();
        model.addAttribute("ship", ship);
        return "result";
    }


    /*@GetMapping(value = {"/spaceshipList/{search}"})
    public String registration(
            @PathVariable int registraionCode, Model model) {
        List<Crew> crewList = (List<Crew>) crewRepo.findAll();
        model.addAttribute("crews",crewList);
        return "allCrew";

    }*/

}
