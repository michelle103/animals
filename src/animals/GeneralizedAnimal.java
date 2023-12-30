package animals;

public class GeneralizedAnimal {
    private final Species species;
    private final String name;
    private final String chipNumber;
    private final String diet;
    private final String habitat;
    private final String isThreatened;
    private final String size;
    private final String color;
    private final String origin;

    public GeneralizedAnimal(Species species, String name, String chipNumber, String diet, String habitat, String isThreatened, String size, String color, String origin) {
        this.species = species;
        this.name = name;
        this.chipNumber = chipNumber;
        this.diet = diet;
        this.habitat = habitat;
        this.isThreatened = isThreatened;
        this.size = size;
        this.color = color;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getChipNumber() {
        return chipNumber;
    }

    public String getDiet() {
        return diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getIsThreatened() {
        return isThreatened;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getOrigin() {
        return origin;
    }

    public Species getSpecies() {
        return species;
    }
}
