import animals.Animal;
import animals.AnimalHelper;
import fileHandler.CsvReader;

import java.util.List;
import java.util.Stack;

public class Main {
    private static final String animalsCsvPath = "/animals.csv";

    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        List<List<String>> fileContent = csvReader.readCsvFile(animalsCsvPath);
        AnimalHelper animalHelper = new AnimalHelper();
        Stack<Animal> animals = animalHelper.createAnimalStackFromFileContent(fileContent);
        animalHelper.printAnimalInfos(animals);
    }
}