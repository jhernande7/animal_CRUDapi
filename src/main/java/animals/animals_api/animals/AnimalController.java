package animals.animals_api.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService services;

    //return all animals
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return services.getallAnimals();
    }

    //returning by id
    @GetMapping("/{animalId}")
    public Optional<Animal> getanibyId(@PathVariable int animalId){
        return services.getAnimalbyId(animalId);
    }

    //adding new animal
    @PostMapping("/new")
    public List<Animal> newAnimal(@RequestBody Animal animal) {
        services.newAnimal(animal);
        return services.getallAnimals();
    }

    //updating a animal already in the database
    @PutMapping("/update/{animalId}")
    public Optional<Animal> upAnimal(@PathVariable int animalId, @RequestBody Animal animal){
        services.upAnimal(animalId, animal);
        return services.getAnimalbyId(animalId);
    }

    //deleting animals
    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deletebyAnimalId(@PathVariable int animalId){
        services.deletebyId(animalId);
        return services.getallAnimals(); //will remove these lines
    }

    //searching for sub string in name
    @GetMapping("/sub")
    public List<Animal> searchforAnimals(@RequestParam String name){
        return services.searchAnimalsbysubString(name);
    }

    //searching for species
    @GetMapping("/species")
    public List<Animal> searchforSpecies(@RequestParam String species){
        return services.getAnimalbySpecies(species);
    }
}
