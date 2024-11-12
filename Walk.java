public class Walk implements MovementStrategy {

    @Override
    public void move(String animalType) {
        System.out.println("The " + animalType + " is walking about.");
    }

}