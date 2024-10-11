package animals.animals_api.animals;

import jakarta.persistence.*;

@Entity
@Table(name = "animaldb")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String name;

    private String scientificName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;

    public Animal( int aniId, String name, String scname, String spec, String habitat, String desc){
        this.animalId = aniId;
        this.name = name;
        this.scientificName = scname;
        this.species = spec;
        this.habitat = habitat;
        this.description = desc;
    }

    public  Animal(){} //default constructor

    public int getAnimalId() {
        return animalId;
    }
    public void setAnimalId(int aniId){
        this.animalId = aniId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getScientificName(){
        return scientificName;
    }
    public void setScientificName(String scname){
        this.scientificName = scname;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String spec){
        this.species = spec;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habi){
        this.habitat = habi;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String desc) {
        this.description = desc;
    }
}
