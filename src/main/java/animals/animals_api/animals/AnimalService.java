package animals.animals_api.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    //were we can access database
    @Autowired
    private AnimalRepository anirepo;

    public List<Animal> searchAnimalsbysubString(String name) {
        return anirepo.findByNameContainingIgnoreCase(name);
    }

    //getting all
    public List<Animal> getallAnimals() {
        return anirepo.findAll();
    }

    //getting by id
    public Optional<Animal> getAnimalbyId(Integer animalId) {
        return anirepo.findById(animalId);
    }

    //getting by given species
    public List<Animal> getAnimalbySpecies(String species){
        return anirepo.findBySpecies(species); // custom one i have to do in repo
    }

    //adding a new animal
    public void newAnimal(Animal animal) {
        anirepo.save(animal);
    }

    //updating animal that is already in list
    public void upAnimal(Integer animalId, Animal animal) {
        anirepo.save(animal);
    }

    //deleting animal from list
    public void deletebyId(int animalId){
        anirepo.deleteById(animalId);
    }
}
