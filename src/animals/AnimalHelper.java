package animals;

import animals.Animal;
import animals.AnimalFactory;
import animals.GeneralizedAnimal;
import animals.Species;

import java.util.List;
import java.util.Stack;

public class AnimalHelper {

    public Stack<Animal> createAnimalStackFromFileContent(List<List<String>> fileContent) {
        Stack<Animal> animals = new Stack<>();
        fileContent.forEach(animalColumns -> {
            if (!Species.isSpeciesAvailable(animalColumns.get(0))) return;
            GeneralizedAnimal generalizedAnimal = createGeneralizedAnimal(animalColumns);
            Animal animal = AnimalFactory.createAnimal(generalizedAnimal);
            animals.push(animal);
        });
        return animals;
    }

    private GeneralizedAnimal createGeneralizedAnimal(List<String> animalColumns) {
        return new GeneralizedAnimal(
                Species.fromString(animalColumns.get(0)),
                animalColumns.get(1),
                animalColumns.get(2),
                animalColumns.get(3),
                animalColumns.get(4),
                animalColumns.get(5),
                animalColumns.size() >= 7 ? animalColumns.get(6) : "",
                animalColumns.size() >= 8 ? animalColumns.get(7) : "",
                animalColumns.size() >= 9 ? animalColumns.get(8) : ""
        );
    }

    public void printAnimalInfos(Stack<Animal> animals) {
        while (!animals.isEmpty()) {
            Animal animal = animals.pop();
            animal.printInfo();
            separateAnimalInfos();
        }
    }

    private void separateAnimalInfos() {
        System.out.println();
    }
}
