public abstract class AnimalDecorator extends Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal.getMovementStrategy(), decoratedAnimal.getAnimalType());
        this.decoratedAnimal = decoratedAnimal;
    }
    
    @Override
    public void traverse() {
        decoratedAnimal.traverse();
    }

    @Override
    public void speak() {
        decoratedAnimal.speak();
    }
}
