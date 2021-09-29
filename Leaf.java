package interfaces;

public class Leaf implements Turner{
    @Override
    public void turn() {
        System.out.println("changing colors...");
    }
}
