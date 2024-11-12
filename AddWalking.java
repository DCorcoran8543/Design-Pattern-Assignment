public class AddWalking extends AnimalDecorator {

    public AddWalking(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    
    @Override
    public void traverse() {
        decoratedAnimal.traverse();
        System.out.println("Now the " + decoratedAnimal.getAnimalType() + " is also walking?");
    }
}