package animals;

public class BlueWhale implements Animal {
    private final String name;
    private final String chipNumber;
    private final String diet;
    private final String habitat;
    private final String isThreatened;
    private final String color;
    private static final String infoTemplate = """
            This blue whale has the name: %s and the number: %s. %s lives in
            the %s and eats %s. The blue whale is the largest sea creature.
            %s has the color as a distinguishing feature: %s. Is the blue whale threatened?:
            %s
            """;

    public BlueWhale(String name, String chipNumber, String diet, String habitat, String isThreatened, String color) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.diet = diet;
        this.habitat = habitat;
        this.isThreatened = isThreatened;
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.printf(infoTemplate, name, chipNumber, name, habitat,
                diet, name, color, isThreatened);
    }
}
