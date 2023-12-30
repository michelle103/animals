package animals;

public class Lion implements Animal {
    private final String name;
    private final String chipNumber;
    private final String diet;
    private final String habitat;
    private final String isThreatened;
    private final String origin;
    private static final String infoTemplate = """
            This lion has the name: %s and the number: %s. %s lives in the
            %s and eats %s. The lion is considered the king of beasts and in
            this case %s is a specimen from %s. Is the lion threatened?: %s
            """;

    public Lion(String name, String chipNumber, String diet, String habitat, String isThreatened, String origin) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.diet = diet;
        this.habitat = habitat;
        this.isThreatened = isThreatened;
        this.origin = origin;
    }

    @Override
    public void printInfo() {
        System.out.printf(infoTemplate, name, chipNumber, name, habitat,
                diet, name, origin, isThreatened);
    }
}
