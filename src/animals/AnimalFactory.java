package animals;

public class AnimalFactory {
    public static Animal createAnimal(GeneralizedAnimal animal) {
        return switch (animal.getSpecies()) {
            case TIGER -> new Tiger(animal.getName(),
                    animal.getChipNumber(),
                    animal.getDiet(),
                    animal.getHabitat(),
                    animal.getIsThreatened());
            case LION -> new Lion(animal.getName(),
                    animal.getChipNumber(),
                    animal.getDiet(),
                    animal.getHabitat(),
                    animal.getIsThreatened(),
                    animal.getOrigin());
            case BLUE_WHALE -> new BlueWhale(animal.getName(),
                    animal.getChipNumber(),
                    animal.getDiet(),
                    animal.getHabitat(),
                    animal.getIsThreatened(),
                    animal.getColor());
            case ELEPHANT -> new Elephant(animal.getName(),
                    animal.getChipNumber(),
                    animal.getDiet(),
                    animal.getHabitat(),
                    animal.getIsThreatened(),
                    animal.getSize());
        };
    }
}
