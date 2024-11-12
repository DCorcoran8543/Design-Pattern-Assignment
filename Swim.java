public class Swim implements MovementStrategy {
    
    @Override
    public void move(String animalType) {
        System.out.println("The " + animalType + " is swimming around.");
    }
    
}
