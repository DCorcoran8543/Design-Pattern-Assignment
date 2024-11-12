public class Main {
    public static void main(String[] args) {
        System.out.println("Beginning Animal demo with movement strategies:");

        // Expected bahviours
        Animal dog = new Dog(new Walk());
        dog.traverse();
        dog.speak();
        System.out.println("");

        Animal tadpole = new Tadpole(new Swim());
        tadpole.traverse();
        tadpole.speak();
        System.out.println("");

        Animal hawk = new Hawk(new Fly());
        hawk.traverse();
        hawk.speak();
        System.out.println("");

        System.out.println("Decorating animals:");

        // Dog is flying???
        dog = new AddFlight(dog);
        dog.traverse();
        dog.speak();
        System.out.println("");

        // Tadpole is walking???
        tadpole = new AddWalking(tadpole);
        tadpole.traverse();
        tadpole.speak();
        System.out.println("");

        // Hawk is swimming???
        hawk = new AddSwimming(hawk);
        hawk.traverse();
        hawk.speak();
    }
    
}
