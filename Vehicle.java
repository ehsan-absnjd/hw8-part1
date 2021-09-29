package interfaces;

public class Vehicle implements Turner{
    @Override
    public void turn() {
        System.out.println("changing direction...");
    }
}
