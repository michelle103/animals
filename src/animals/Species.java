package animals;

import java.util.Arrays;

public enum Species {
    TIGER("Tiger"),
    LION("Lion"),
    BLUE_WHALE("Blue Whale"),
    ELEPHANT("Elephant");

    private final String species;
    Species(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return species;
    }

    public static Species fromString(String text) {
        for (Species s : Species.values()) {
            if (s.species.equalsIgnoreCase(text)) {
                return s;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }

    public static boolean isSpeciesAvailable(String species) {
        for (Species s : Species.values()) {
            if (s.species.equalsIgnoreCase(species)) {
                return true;
            }
        }
        return false;
    }
}
