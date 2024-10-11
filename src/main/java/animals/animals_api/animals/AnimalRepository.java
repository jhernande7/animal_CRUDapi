package animals.animals_api.animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {
    List<Animal> findByNameContainingIgnoreCase(String name);


    @Query List<Animal> findBySpecies(String species);
}
