package interfaces;

public class DemoTurner2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner vehicle = new Vehicle();
        Turner wheel = new Wheel();
        leaf.turn();
        page.turn();
        pancake.turn();
        vehicle.turn();
        wheel.turn();

    }
}
