public class Tadpole extends Animal {

    public Tadpole(MovementStrategy movementStrategy) {
        super(movementStrategy, "Tadpole");
    }

    @Override
    public void speak() {
        System.out.println("*Bubbling noises*");
    }
}
