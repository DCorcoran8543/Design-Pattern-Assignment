public class AddSwimming extends AnimalDecorator {

    public AddSwimming(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    
    @Override
    public void traverse() {
        decoratedAnimal.traverse();
        System.out.println("Now the " + decoratedAnimal.getAnimalType() + " is also swimming?");
    }
}