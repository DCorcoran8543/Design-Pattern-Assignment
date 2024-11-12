public class Dog extends Animal {

    public Dog(MovementStrategy movementStrategy) {
        super(movementStrategy, "Dog");
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
