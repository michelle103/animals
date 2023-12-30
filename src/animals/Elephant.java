package animals;

public class Elephant implements Animal {
    private final String name;
    private final String chipNumber;
    private final String diet;
    private final String habitat;
    private final String isThreatened;
    private final String size;
    private static final String infoTemplate = """
            This elephant has the name: %s and the number: %s. %s lives in
            the %s and eats %s. The elephant is the largest land creature
            and %s measures %sm. Is the elephant threatened?: %s
            """;

    public Elephant(String name, String chipNumber, String diet, String habitat, String isThreatened, String size) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.diet = diet;
        this.habitat = habitat;
        this.isThreatened = isThreatened;
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.printf(infoTemplate, name, chipNumber, name, habitat,
                diet, name, size, isThreatened);
    }
}
