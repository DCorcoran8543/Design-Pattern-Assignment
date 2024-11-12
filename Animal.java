public abstract class Animal {
    private MovementStrategy movementStrategy;
    private String animalType;

    public Animal(MovementStrategy movementStrategy, String animalType) {
        this.movementStrategy = movementStrategy;
        this.animalType = animalType;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void traverse() {
        movementStrategy.move(animalType);
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }

    public abstract void speak();
}
