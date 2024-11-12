public class Fly implements MovementStrategy {

    @Override
    public void move(String animalType) {
        System.out.println("The " + animalType + " is flying high.");
    }

}
