package animals;

public class Tiger implements Animal {
    private final String name;
    private final String chipNumber;
    private final String diet;
    private final String habitat;
    private final String isThreatened;
    private static final String infoTemplate = """
            This sumatran tiger has the name: %s and the number: %s. %s lives
            in the %s and eats %s. The Sumatran tiger is not afraid of water
            and is a very good swimmer. That’s why he has webbed feet between his toes. Is the
            sumatran tiger threatened?: %s
            """;

    public Tiger(String name, String chipNumber, String diet, String habitat, String isThreatened) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.diet = diet;
        this.habitat = habitat;
        this.isThreatened = isThreatened;
    }

    @Override
    public void printInfo() {
        System.out.printf(infoTemplate, name, chipNumber, name, habitat,
                diet, isThreatened);
    }
}
