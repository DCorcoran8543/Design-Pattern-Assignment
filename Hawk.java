public class Hawk extends Animal {

    public Hawk(MovementStrategy movementStrategy) {
        super(movementStrategy, "Hawk");
    }

    @Override
    public void speak() {
        System.out.println("Kaw!");
    }
}
