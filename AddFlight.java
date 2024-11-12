public class AddFlight extends AnimalDecorator {

    public AddFlight(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    
    @Override
    public void traverse() {
        decoratedAnimal.traverse();
        System.out.println("Now the " + decoratedAnimal.getAnimalType() + " is also flying?");
    }
}
